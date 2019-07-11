package com.farmaciasperuanas.springboot.backend.acceso.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmaciasperuanas.springboot.backend.acceso.models.entity.Reporte;
import com.farmaciasperuanas.springboot.backend.acceso.models.services.IReporteService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class ReporteRestController {
	
	@Autowired
	private IReporteService reporteService;
	
	@Secured({"ROLE_ADMIN","ROLE_USER"})
	@GetMapping("/reportes")
	public List<Reporte> show() {
		return reporteService.findAll();
	}
	
	@Secured({"ROLE_ADMIN","ROLE_USER"})
	@PostMapping("/reportes")
	public ResponseEntity<?> create(@Valid @RequestBody Reporte reporte, BindingResult result) {

		Reporte reporteNew = null;
		Map<String, Object> response = new HashMap<>();
		
		if(result.hasErrors()) {
			List<String> errors = result.getFieldErrors()
					.stream()
					.map(err -> "El campo '"+ err.getField() + "'" + err.getDefaultMessage())
					.collect(Collectors.toList());
			response.put("errors", errors);
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}

		try {
			reporteNew = reporteService.save(reporte);
		} catch (DataAccessException e) {
			response.put("mensaje", "Error al realizar la insert en la bd");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		response.put("mensaje", "El usuario ha registrado su ingreso con exito!");
		response.put("usuario", reporteNew);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}

}
