package com.farmaciasperuanas.springboot.backend.acceso.models.services;

import java.util.List;

import com.farmaciasperuanas.springboot.backend.acceso.models.entity.Reporte;

public interface IReporteService {
	
	public List<Reporte> findAll();
	
	public Reporte save(Reporte reporte);
	
	public Reporte findByRegistro(String cod_usuario, String fecha_registro);

}
