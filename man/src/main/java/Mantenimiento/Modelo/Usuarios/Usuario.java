package Mantenimiento.Modelo.Usuarios;

public class Usuario {
	private String usuario;
	private String password;
	private Rol r;
	

	public Usuario() {
		super();
	} 
	
	public Usuario(String usuario, String password) {
		super();
		this.usuario = usuario;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	

	public void setPassword(String password) {
		this.password = password;
	}

	public Rol getR() {
		return r;
	}

	public void setR(Rol r) {
		this.r = r;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
}


