package modeltiendagenerica;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;

/**
 * The persistent class for the ventas database table.
 * 
 */
@Entity
@Table(name = "ventas")
@NamedQuery(name = "Ventas.findAll", query = "SELECT v FROM Ventas v")
public class Ventas implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codigo_ventas")
	private String codigoVentas;

	private BigInteger clientes_Cedula_cliente;

	private double ivaventa;

	@Column(name = "total_venta")
	private double totalVenta;

	private BigInteger usuarios_Cedula_usuario;

	@Column(name = "valor_venta")
	private double valorVenta;

	public Ventas() {
	}

	public String getCodigoVentas() {
		return this.codigoVentas;
	}

	public void setCodigoVentas(String codigoVentas) {
		this.codigoVentas = codigoVentas;
	}

	public BigInteger getClientes_Cedula_cliente() {
		return this.clientes_Cedula_cliente;
	}

	public void setClientes_Cedula_cliente(BigInteger clientes_Cedula_cliente) {
		this.clientes_Cedula_cliente = clientes_Cedula_cliente;
	}

	public double getIvaventa() {
		return this.ivaventa;
	}

	public void setIvaventa(double ivaventa) {
		this.ivaventa = ivaventa;
	}

	public double getTotalVenta() {
		return this.totalVenta;
	}

	public void setTotalVenta(double totalVenta) {
		this.totalVenta = totalVenta;
	}

	public BigInteger getUsuarios_Cedula_usuario() {
		return this.usuarios_Cedula_usuario;
	}

	public void setUsuarios_Cedula_usuario(BigInteger usuarios_Cedula_usuario) {
		this.usuarios_Cedula_usuario = usuarios_Cedula_usuario;
	}

	public double getValorVenta() {
		return this.valorVenta;
	}

	public void setValorVenta(double valorVenta) {
		this.valorVenta = valorVenta;
	}

}