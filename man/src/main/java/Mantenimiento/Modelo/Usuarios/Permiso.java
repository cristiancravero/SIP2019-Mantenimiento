package Mantenimiento.Modelo.Usuarios;

public class Permiso {
	@Override
	public String toString() {
		return "Permiso [nombre=" + nombre + "]";
	}
	private int id;
	private String nombre;
	

	public Permiso(int id,String nombre) {
		this.nombre = nombre;
		this.id=id;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}


