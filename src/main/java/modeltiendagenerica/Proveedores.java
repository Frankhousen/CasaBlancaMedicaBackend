package modeltiendagenerica;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the proveedores database table.
 * 
 */
@Entity
@Table(name="proveedores")
@NamedQuery(name="Proveedores.findAll", query="SELECT p FROM Proveedores p")
public class Proveedores implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String nitproveedor;

	@Column(name="ciudad_proveedor")
	private String ciudadProveedor;

	@Column(name="direccion_proveedor")
	private String direccionProveedor;

	@Column(name="nombre_proveedor")
	private String nombreProveedor;

	@Column(name="telefono_proveedor")
	private String telefonoProveedor;

	public Proveedores() {
	}

	public String getNitproveedor() {
		return this.nitproveedor;
	}

	public void setNitproveedor(String nitproveedor) {
		this.nitproveedor = nitproveedor;
	}

	public String getCiudadProveedor() {
		return this.ciudadProveedor;
	}

	public void setCiudadProveedor(String ciudadProveedor) {
		this.ciudadProveedor = ciudadProveedor;
	}

	public String getDireccionProveedor() {
		return this.direccionProveedor;
	}

	public void setDireccionProveedor(String direccionProveedor) {
		this.direccionProveedor = direccionProveedor;
	}

	public String getNombreProveedor() {
		return this.nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}

	public String getTelefonoProveedor() {
		return this.telefonoProveedor;
	}

	public void setTelefonoProveedor(String telefonoProveedor) {
		this.telefonoProveedor = telefonoProveedor;
	}

}