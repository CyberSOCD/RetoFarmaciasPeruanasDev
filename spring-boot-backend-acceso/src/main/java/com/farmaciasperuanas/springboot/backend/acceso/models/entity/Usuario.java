package com.farmaciasperuanas.springboot.backend.acceso.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_usuario;

	@Column(nullable = false)
	private String cod_usuario;
	private String nom_usuario;
	private String ape_usuario;

	@NotEmpty
	@Column(nullable = false, unique = true)
	private String dni_usuario;

	@Email
	@NotEmpty
	@Column(nullable = false, unique = true)
	private String ema_usuario;

	@Temporal(TemporalType.DATE)
	private Date alt_usuario;
	
	private String rol_usuario;

	@PrePersist
	public void prePersist() {
		alt_usuario = new Date();
		String str1 = this.getApe_usuario();
		String str2 = this.getNom_usuario();
		String apellido = str1.substring(0, str1.indexOf(" "));
		String nombre = str2.substring(0, 1);
		cod_usuario = (nombre + apellido).toUpperCase();
	}

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNom_usuario() {
		return nom_usuario;
	}

	public void setNom_usuario(String nom_usuario) {
		this.nom_usuario = nom_usuario;
	}

	public String getApe_usuario() {
		return ape_usuario;
	}

	public void setApe_usuario(String ape_usuario) {
		this.ape_usuario = ape_usuario;
	}

	public String getCod_usuario() {
		return cod_usuario;
	}

	public void setCod_usuario(String cod_usuario) {
		this.cod_usuario = cod_usuario;
	}

	public String getDni_usuario() {
		return dni_usuario;
	}

	public void setDni_usuario(String dni_usuario) {
		this.dni_usuario = dni_usuario;
	}

	public String getEma_usuario() {
		return ema_usuario;
	}

	public void setEma_usuario(String ema_usuario) {
		this.ema_usuario = ema_usuario;
	}

	public Date getAlt_usuario() {
		return alt_usuario;
	}

	public void setAlt_usuario(Date alt_usuario) {
		this.alt_usuario = alt_usuario;
	}

	public String getRol_usuario() {
		return rol_usuario;
	}

	public void setRol_usuario(String rol_usuario) {
		this.rol_usuario = rol_usuario;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
