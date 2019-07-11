package com.farmaciasperuanas.springboot.backend.acceso.models.entity;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "reportes")
public class Reporte implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String cod_usuario;

	private String fecha_registro;

	private String hora_registro;

	private String hora_salida_aprox;

	private Date hora_salida_marcada;

	public Date sumarHoras(Date fecha, int horas) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fecha);
		calendar.add(Calendar.HOUR, horas);
		return calendar.getTime();
	}

	@PrePersist
	public void prePersist() {
		Date dia_atual = new Date();		
		DateFormat dayFormat = new SimpleDateFormat("dd/MM/yyyy");
		setFecha_registro(dayFormat.format(dia_atual));
				
		DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
		hora_registro = hourFormat.format(dia_atual);
		hora_salida_aprox = hourFormat.format(sumarHoras(dia_atual, 8));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCod_usuario() {
		return cod_usuario;
	}

	public void setCod_usuario(String cod_usuario) {
		this.cod_usuario = cod_usuario;
	}

	public String getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(String fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public String getHora_registro() {
		return hora_registro;
	}

	public void setHora_registro(String hora_registro) {
		this.hora_registro = hora_registro;
	}

	public String getHora_salida_aprox() {
		return hora_salida_aprox;
	}

	public void setHora_salida_aprox(String hora_salida_aprox) {

		this.hora_salida_aprox = hora_salida_aprox;
	}

	public Date getHora_salida_marcada() {
		return hora_salida_marcada;
	}

	public void setHora_salida_marcada(Date hora_salida_marcada) {
		this.hora_salida_marcada = hora_salida_marcada;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
