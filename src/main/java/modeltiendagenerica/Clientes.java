package modeltiendagenerica;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the clientes database table.
 * 
 */
@Entity
@Table(name="clientes")
@NamedQuery(name="Clientes.findAll", query="SELECT c FROM Clientes c")
public class Clientes implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String cedula_cliente;

	@Column(name="dir_cliente")
	private String dirCliente;

	@Column(name="email_cliente")
	private String emailCliente;

	@Column(name="nombre_cliente")
	private String nombreCliente;

	@Column(name="telefono_cliente")
	private String telefonoCliente;

	public Clientes() {
	}

	public String getCedula_cliente() {
		return this.cedula_cliente;
	}

	public void setCedula_cliente(String cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}

	public String getDirCliente() {
		return this.dirCliente;
	}

	public void setDirCliente(String dirCliente) {
		this.dirCliente = dirCliente;
	}

	public String getEmailCliente() {
		return this.emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getNombreCliente() {
		return this.nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getTelefonoCliente() {
		return this.telefonoCliente;
	}

	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}

}