package com.Proyectociclo3Backend.ciclo3.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Clientes {

	@Id
	private long cedula_cliente;
	private String dir_cliente;
	private String email_cliente;
	private String nombre_cliente;
	private String telefono_cliente;
	
	public long getCedula_cliente() {
		return cedula_cliente;
	}
	public void setCedula_cliente(long cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}
	public String getDir_cliente() {
		return dir_cliente;
	}
	public void setDir_cliente(String dir_cliente) {
		this.dir_cliente = dir_cliente;
	}
	public String getEmail_cliente() {
		return email_cliente;
	}
	public void setEmail_cliente(String email_cliente) {
		this.email_cliente = email_cliente;
	}
	public String getNombre_cliente() {
		return nombre_cliente;
	}
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	public String getTelefono_cliente() {
		return telefono_cliente;
	}
	public void setTelefono_cliente(String telefono_cliente) {
		this.telefono_cliente = telefono_cliente;
	}
	
}
