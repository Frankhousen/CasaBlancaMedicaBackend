package com.Proyectociclo3Backend.ciclo3.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ventas {
	
	@Id
	private long codigo_ventas;
	private long Usuario_Cedula_usuario;
	private long Cliente_Cedula_cliente;
	private double ivaventa;
	private double total_venta;
	private double valor_venta;
	
	public long getCodigo_ventas() {
		return codigo_ventas;
	}
	public void setCodigo_ventas(long codigo_ventas) {
		this.codigo_ventas = codigo_ventas;
	}
	public long getUsuario_Cedula_usuario() {
		return Usuario_Cedula_usuario;
	}
	public void setUsuario_Cedula_usuario(long usuario_Cedula_usuario) {
		Usuario_Cedula_usuario = usuario_Cedula_usuario;
	}
	public long getCliente_Cedula_cliente() {
		return Cliente_Cedula_cliente;
	}
	public void setCliente_Cedula_cliente(long cliente_Cedula_cliente) {
		Cliente_Cedula_cliente = cliente_Cedula_cliente;
	}
	public double getIvaventa() {
		return ivaventa;
	}
	public void setIvaventa(double ivaventa) {
		this.ivaventa = ivaventa;
	}
	public double getTotal_venta() {
		return total_venta;
	}
	public void setTotal_venta(double total_venta) {
		this.total_venta = total_venta;
	}
	public double getValor_venta() {
		return valor_venta;
	}
	public void setValor_venta(double valor_venta) {
		this.valor_venta = valor_venta;
	}
	
}
