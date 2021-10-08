package com.Proyectociclo3Backend.ciclo3.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DetalleVentas {
	
	@Id
	private long codigo_detalle_venta;
	private long productos_codigo_producto;
	private long ventas_codigo_ventas;
	private int cantidad_producto;
	private double valor_total;
	private double valor_venta;
	private double valor_iva;
	public long getCodigo_detalle_venta() {
		return codigo_detalle_venta;
	}
	public void setCodigo_detalle_venta(long codigo_detalle_venta) {
		this.codigo_detalle_venta = codigo_detalle_venta;
	}
	public long getProductos_codigo_producto() {
		return productos_codigo_producto;
	}
	public void setProductos_codigo_producto(long productos_codigo_producto) {
		this.productos_codigo_producto = productos_codigo_producto;
	}
	public long getVentas_codigo_ventas() {
		return ventas_codigo_ventas;
	}
	public void setVentas_codigo_ventas(long ventas_codigo_ventas) {
		this.ventas_codigo_ventas = ventas_codigo_ventas;
	}
	public int getCantidad_producto() {
		return cantidad_producto;
	}
	public void setCantidad_producto(int cantidad_producto) {
		this.cantidad_producto = cantidad_producto;
	}
	public double getValor_total() {
		return valor_total;
	}
	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}
	public double getValor_venta() {
		return valor_venta;
	}
	public void setValor_venta(double valor_venta) {
		this.valor_venta = valor_venta;
	}
	public double getValor_iva() {
		return valor_iva;
	}
	public void setValor_iva(double valor_iva) {
		this.valor_iva = valor_iva;
	}
	
	
}
