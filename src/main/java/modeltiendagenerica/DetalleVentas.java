package modeltiendagenerica;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the detalle_ventas database table.
 * 
 */
@Entity
@Table(name="detalle_ventas")
@NamedQuery(name="DetalleVentas.findAll", query="SELECT d FROM DetalleVentas d")
public class DetalleVentas implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="codigo_detalle_venta")
	private String codigoDetalleVenta;

	@Column(name="cantidad_producto")
	private int cantidadProducto;

	private BigInteger productos_codigo_producto;

	@Column(name="valor_total")
	private double valorTotal;

	@Column(name="valor_venta")
	private double valorVenta;

	private double valoriva;

	private BigInteger ventas_codigo_ventas;

	public DetalleVentas() {
	}

	public String getCodigoDetalleVenta() {
		return this.codigoDetalleVenta;
	}

	public void setCodigoDetalleVenta(String codigoDetalleVenta) {
		this.codigoDetalleVenta = codigoDetalleVenta;
	}

	public int getCantidadProducto() {
		return this.cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public BigInteger getProductos_codigo_producto() {
		return this.productos_codigo_producto;
	}

	public void setProductos_codigo_producto(BigInteger productos_codigo_producto) {
		this.productos_codigo_producto = productos_codigo_producto;
	}

	public double getValorTotal() {
		return this.valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public double getValorVenta() {
		return this.valorVenta;
	}

	public void setValorVenta(double valorVenta) {
		this.valorVenta = valorVenta;
	}

	public double getValoriva() {
		return this.valoriva;
	}

	public void setValoriva(double valoriva) {
		this.valoriva = valoriva;
	}

	public BigInteger getVentas_codigo_ventas() {
		return this.ventas_codigo_ventas;
	}

	public void setVentas_codigo_ventas(BigInteger ventas_codigo_ventas) {
		this.ventas_codigo_ventas = ventas_codigo_ventas;
	}

}