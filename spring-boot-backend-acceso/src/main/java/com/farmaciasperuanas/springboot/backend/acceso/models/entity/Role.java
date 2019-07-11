package com.farmaciasperuanas.springboot.backend.acceso.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Role implements Serializable  {
	
	@Id
	@GeneratedValue(strategy = 	GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique=true, length=20)
	private String nom_rol;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getNom_rol() {
		return nom_rol;
	}
	
	public void setNom_rol(String nom_rol) {
		this.nom_rol = nom_rol;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}