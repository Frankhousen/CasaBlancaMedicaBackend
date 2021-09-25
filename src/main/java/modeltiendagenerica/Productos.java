package modeltiendagenerica;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the productos database table.
 * 
 */
@Entity
@Table(name="productos")
@NamedQuery(name="Productos.findAll", query="SELECT p FROM Productos p")
public class Productos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="codigo_producto")
	private String codigoProducto;

	private double ivacompra;

	@Column(name="nombre_producto")
	private String nombreProducto;

	@Column(name="precio_compra")
	private double precioCompra;

	@Column(name="precio_venta")
	private double precioVenta;

	@Column(name="proveedores_nitproveedor")
	private BigInteger proveedoresNitproveedor;

	public Productos() {
	}

	public String getCodigoProducto() {
		return this.codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public double getIvacompra() {
		return this.ivacompra;
	}

	public void setIvacompra(double ivacompra) {
		this.ivacompra = ivacompra;
	}

	public String getNombreProducto() {
		return this.nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public double getPrecioCompra() {
		return this.precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getPrecioVenta() {
		return this.precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public BigInteger getProveedoresNitproveedor() {
		return this.proveedoresNitproveedor;
	}

	public void setProveedoresNitproveedor(BigInteger proveedoresNitproveedor) {
		this.proveedoresNitproveedor = proveedoresNitproveedor;
	}

}