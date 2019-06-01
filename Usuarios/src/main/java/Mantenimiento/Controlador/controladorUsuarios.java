package Mantenimiento.Controlador;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import Mantenimiento.Modelo.Usuarios.GestorUsuarios;
import Mantenimiento.Usuarios.IModeloUsuarios;
import Mantenimiento.Usuarios.Permiso;
import Mantenimiento.Usuarios.UsuariosApplication;
import Mantenimiento.Usuarios.acciones;
import Mantenimiento.vista.Usuarios.VistaUsuarios;
import Mantenimiento.vista.Usuarios.VistaUsuarios2;


public class controladorUsuarios implements Observer{
	private static controladorUsuarios instance = new controladorUsuarios();
	private  static	GestorUsuarios abmuser;
	private static	IVistaUsuario vista;
	
	public  static void setModelo(Mantenimiento.Modelo.Usuarios.IModeloUsuarios users) {
		abmuser = users;
	}

	public static controladorUsuarios getInstance(){
		return instance;
	}
	
	public static void main(String[] args) {
		setModelo(new GestorUsuarios());
		controladorUsuarios.getInstance();
		((Observable)abmuser).addObserver(instance);
		inicializar();
	}
	
	public void mostrarAU() {
		this.abmuser.buscarRolesAll();
		
	}
		
	public static void inicializar() {
		vista = (IVistaUsuario) new VistaUsuarios();
		vista.crearFrame();
		vista.hacerVisible();
	}
	
	
	public void mostrarMU1(int dni) {
		this.abmuser.buscarUsuario(dni);
	}
	
	public void mostrarMP1(String nombre) {
		this.abmuser.buscarPermiso(nombre);
		
	}

	public void mostrarMR1(String string) {
		this.abmuser.buscarRol(string);
		
	}

	public void mostrarAR() {
		this.abmuser.buscarPermisosLista();
		
	}

	public void mostrarRoles() {
		this.abmuser.buscarRolesCombo();
	}
	public void agregarPersona(String nombre,String apellido,int dni) {
		this.abmuser.agregarPersona(nombre,apellido,dni);
		
	}
	
	public void modificarPersona(String nombre,String apellido,int dni,String password,String nombreRol) {
		this.abmuser.modificarPersona(nombre,apellido,dni);
		
	}
	
	
	public void eliminarPersona(String nombre,String apellido,int dni,String password,String nombreRol) {
		this.abmuser.eliminarPersona(nombre,apellido,dni);
		
	}
	
	public void buscarPersona(String nombre,String apellido,int dni,String password,String nombreRol) {
		this.abmuser.buscarPersona(nombre,apellido,dni,password,"Administrador");
		
	}
	
	public void agregarUser(String nombre,String apellido,int dni,String password,String nombreRol) {
		this.abmuser.agregarUsuarios(nombre,apellido,dni,password,"Administrador");
		
	}
	public void agregarRol(String nombre,String descripcion,ArrayList<Mantenimiento.Modelo.Usuarios.Permiso> p) {
		this.abmuser.agregarRol(nombre,descripcion,p);
		
	}
	public void agregarPermiso(String nombre) {
		this.abmuser.agregarPermiso(nombre);
	}
	
	public void modificarUser(String nombre,String apellido,int dni,String password,String nombreRol) {
		this.abmuser.modificarUsuario(nombre,apellido,dni,password,nombreRol);
		
	}
	
	public void modificarRol(String nombre,String descripcion,ArrayList<Permiso> p) {
		this.abmuser.modificarRol(nombre,descripcion,p);
	}
	public void modificarPermiso(String nombre) {
		this.abmuser.modificarPermiso(nombre);
	}
	public void eliminarPermiso(String nombre) {
		this.abmuser.eliminarPermiso(nombre);
	}
	public void eliminarRol(String nombre) {
		this.abmuser.eliminarRol(nombre);
	}
	public void eliminarUser(int dni) {
		this.abmuser.eliminarUsuario(dni);
	}
	public void buscarPermiso(String nombre) {
		this.abmuser.buscarPermiso(nombre);
	}
	public void buscarRol(String nombre) {
		this.abmuser.buscarRol(nombre);
	}
	public void buscaruser(int dni) {
		this.abmuser.buscarUsuario(dni);
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		acciones accion = abmuser.getAccion();
		System.out.println("fui notificado" + accion);
		switch (accion){
		case AGREGARUSUARIO:
			vista.mostrarMensaje(abmuser.getMensaje());
			break;
		case MODIFICARUSUARIO:
			vista.mostrarMensaje(abmuser.getMensaje());
			break;
		case ELIMINARUSUARIO:
			vista.mostrarMensaje(abmuser.getMensaje());
			break;
		case CARGARUSUARIO:
			vista.mostrarModificarUsuarios(this.abmuser.getUsuario());
			break;
		case BUSCARUSUARIO:
			break;
		
			
		case AGREGARPERMISO:
			vista.mostrarMensaje(abmuser.getMensaje());
			break;
		case MODIFICARPERMISO:
			vista.mostrarMensaje(abmuser.getMensaje());
			break;
		case ELIMINARPERMISO:
			vista.mostrarMensaje(abmuser.getMensaje());
			break;
		case CARGARPERMISO:
			vista.mostrarModificarPermisos(this.abmuser.getPermiso());
			break;
		case BUSCARPERMISO:
	
			break;
		
			
		case AGREGARROL:
			vista.mostrarMensaje(abmuser.getMensaje());
			break;
		case MODIFICARROL:
			vista.mostrarMensaje(abmuser.getMensaje());
			break;
		case ELIMINARROL:
			vista.mostrarMensaje(abmuser.getMensaje());
			break;
		case CARGARROL:
			vista.mostrarModificarRoles(this.abmuser.getRol());
			break;
		case BUSCARROL:
	
			break;
	
		case LISTAPERMISOS:
			vista.mostrarPermisosLista(this.abmuser.getPermisoAll());
			break;
		case COMBOROLES:
			vista.mostrarRolesCombo(this.abmuser.getRolAll());
			break;	
		case ERROR:
			System.out.println("Paso por error");
			vista.mostrarMensaje(abmuser.getMensaje());
			break;
		default:
			break;}

	}







}
