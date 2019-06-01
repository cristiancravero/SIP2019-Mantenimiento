package Mantenimiento.Modelo.Usuarios;

import java.util.ArrayList;

public interface IModeloUsuarios {
	public void agregarUsuarios(String nombre,String apellido,int dni,String password,String nombreRol);
	public void modificarUsuario(String nombre,String apellido,int dni,String password,String nombreRol);
	public void eliminarUsuario(int dni);
	public void buscarUsuario(int dni);
	public void buscarUsuariosAll();
	public Usuario getUsuario();
	public ArrayList<Usuario> getUsuarioAll();
	
	public void agregarRol(String nombre,String descripcion,ArrayList<Permiso> p);
	public void modificarRol(String nombre,String descripcion,ArrayList<Permiso> p);
	public void eliminarRol(String nombre);
	public void buscarRol(String nombre);
	public void buscarRolesAll();
	public Rol getRol();
	public ArrayList<Rol> getRolAll();
	
	public void agregarPermiso(String nombre);
	public void modificarPermiso(String nombre);
	public void eliminarPermiso(String nombre) ;
	public void buscarPermiso(String nombre);
	public void buscarPermisosAll();
	public Permiso getPermiso();
	public ArrayList<Permiso> getPermisoAll();
	
	public acciones getAccion();
	public String getMensaje();
	public void buscarRolesCombo();
	public void buscarPermisosLista();
	public void validarAcceso(String usuario, String password);
	
	
	
	
	
	
	
	
}

