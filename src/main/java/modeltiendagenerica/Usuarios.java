package modeltiendagenerica;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the usuarios database table.
 * 
 */
@Entity
@Table(name="usuarios")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuarios implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String cedula_usuario;

	@Column(name="email_usuario")
	private String emailUsuario;

	@Column(name="nombre_usuario")
	private String nombreUsuario;

	private String password_Usuario;

	private String usuario;

	public Usuario() {
	}

	public String getCedula_usuario() {
		return this.cedula_usuario;
	}

	public void setCedula_usuario(String cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}

	public String getEmailUsuario() {
		return this.emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getNombreUsuario() {
		return this.nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword_Usuario() {
		return this.password_Usuario;
	}

	public void setPassword_Usuario(String password_Usuario) {
		this.password_Usuario = password_Usuario;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}