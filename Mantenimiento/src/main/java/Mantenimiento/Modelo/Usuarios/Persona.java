package Mantenimiento.Modelo.Usuarios;

import java.util.ArrayList;

public class Persona {
	private String nombre;
	private String apellido;
	private int dni;
	private String mail;
	private ArrayList<Usuario> Usuarios =new ArrayList<Usuario>();
	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	
	
	
	public Persona() {
		super();
	}



	public Persona(String nombre, String apellido, int dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public void agregarUsuario() {
		
	}
	
	public void quitarUsuario() {
		
	}
	
	public void buscarUsuario() {
		
	}
	
	
}
