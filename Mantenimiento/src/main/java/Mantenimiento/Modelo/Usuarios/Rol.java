package Mantenimiento.Modelo.Usuarios;

import java.util.ArrayList;

public class Rol {
	private int id;
	private String nombre;
	private String descripcion;
	private ArrayList<Permiso> permisos=new ArrayList<Permiso>();
	
	public Rol(String nombre, String descripcion) {
		super();
		this.descripcion = descripcion;
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public Rol() {
		super();
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public ArrayList<Permiso> getPermisos() {
		return permisos;
	}
	
	public void setPermisos(ArrayList<Permiso> permisos) {
		this.permisos = permisos;
	}
	
	public void addPermiso(Permiso p) {
		this.permisos.add(p);
	}
	
	@Override
	public String toString() {
		return this.nombre;
	}
	
	public void delPermiso(int id) {
		for(int i=0;i<this.permisos.size();i++) {
			Permiso p =this.permisos.get(i);
			if (p.getId()==id) {
				this.permisos.remove(i);
			}
		}
	}
}
