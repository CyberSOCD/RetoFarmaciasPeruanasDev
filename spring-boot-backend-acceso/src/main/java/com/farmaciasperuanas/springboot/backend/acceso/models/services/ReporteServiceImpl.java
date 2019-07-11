package com.farmaciasperuanas.springboot.backend.acceso.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.farmaciasperuanas.springboot.backend.acceso.models.dao.IReporteDao;
import com.farmaciasperuanas.springboot.backend.acceso.models.entity.Reporte;

@Service
public class ReporteServiceImpl implements IReporteService {
	
	@Autowired
	private IReporteDao reporteDao;

	@Override
	@Transactional(readOnly = true)
	public List<Reporte> findAll() {
		return (List<Reporte>) reporteDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Reporte save(Reporte reporte) {
		return reporteDao.save(reporte);
	}

	@Override
	@Transactional(readOnly = true)
	public Reporte findByRegistro(String cod_usuario, String fecha_registro) {
		// TODO Auto-generated method stub
		return reporteDao.findByRegistro(cod_usuario, fecha_registro);
	}



}
