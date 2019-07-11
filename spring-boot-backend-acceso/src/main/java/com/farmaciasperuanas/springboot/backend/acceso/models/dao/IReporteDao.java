package com.farmaciasperuanas.springboot.backend.acceso.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmaciasperuanas.springboot.backend.acceso.models.entity.Reporte;

public interface IReporteDao extends JpaRepository<Reporte, Long>  {
	
	public Reporte findByRegistro(String cod_usuario, String fecha_registro);
	
}
