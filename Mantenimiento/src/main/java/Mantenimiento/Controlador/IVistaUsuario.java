package Mantenimiento.Controlador;

import java.util.ArrayList;

import Mantenimiento.Usuarios.Permiso;
import Mantenimiento.Usuarios.Rol;
import Mantenimiento.Usuarios.Usuario;

public interface IVistaUsuario {
	public void hacerVisible();
	public void mostrarMensaje(String mensaje);
	public void ocultar();
	void crearFrame();
	public void mostrarAgregarUsuarios();
	public void mostrarAgregarRoles();
	public void mostrarAgregarPermisos();
	public void mostrarModificarPermisos(Permiso permiso);
	public void mostrarModificarUsuarios(Usuario usuario);
	public void mostrarModificarRoles(Rol rol);
	public void mostrarBuscarUsuarios();
	public void mostrarBuscarPermisos();
	public void mostrarBuscarRoles();
	public void mostrarEliminarUsuarios();
	public void mostrarEliminarRoles();
	public void mostrarEliminarPermisos();
	public void mostrarRolesCombo(ArrayList<Rol> a);
	public void mostrarPermisosLista(ArrayList<Permiso> a);
	public void agregarUsuarios();
	public void agregarRoles();
	public void agregarPermisos();
	public void modificarUsuarios();
	public void modificarRoles();
	public void modificarPermisos();
	public void eliminarPermisos();
	public void eliminarRoles();
	public void eliminarUsuario();
	public void buscarPermisos();
	public void buscarRoles();
	public void buscarUsuarios();
	public void agregarItemLista();
	public void quitarItemLista();
}
