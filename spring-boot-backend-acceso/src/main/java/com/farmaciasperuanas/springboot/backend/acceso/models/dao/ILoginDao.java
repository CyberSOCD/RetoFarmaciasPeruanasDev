package com.farmaciasperuanas.springboot.backend.acceso.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.farmaciasperuanas.springboot.backend.acceso.models.entity.Login;

public interface ILoginDao extends CrudRepository<Login, Long> {
	
	public Login findByUsername(String username);
	
	@Query("select l from Login l where l.username=?1")
	public Login findByUsername2(String username);
}
