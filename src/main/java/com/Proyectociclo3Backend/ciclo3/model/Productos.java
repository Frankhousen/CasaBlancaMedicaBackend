package com.Proyectociclo3Backend.ciclo3.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Productos {
	
	@Id
	private long codigo_producto;
	private String nombre_producto;
	private long proveedores_nitproveedor;
	private double precio_compra;
	private double iva_compra;
	private double precio_venta;
	public long getCodigo_producto() {
		return codigo_producto;
	}
	public void setCodigo_producto(long codigo_producto) {
		this.codigo_producto = codigo_producto;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public long getProveedores_nitproveedor() {
		return proveedores_nitproveedor;
	}
	public void setProveedores_nitproveedor(long proveedores_nitproveedor) {
		this.proveedores_nitproveedor = proveedores_nitproveedor;
	}
	public double getPrecio_compra() {
		return precio_compra;
	}
	public void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}
	public double getIva_compra() {
		return iva_compra;
	}
	public void setIva_compra(double iva_compra) {
		this.iva_compra = iva_compra;
	}
	public double getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}
	
}
