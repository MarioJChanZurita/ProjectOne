package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {

	@Id
	private int idpersona;
	
	@Column
	private String nombre;
	
	@Column
	private String apellido;

	public int getId() {
		return idpersona;
	}

	public void setId(int id) {
		this.idpersona = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
	
}
