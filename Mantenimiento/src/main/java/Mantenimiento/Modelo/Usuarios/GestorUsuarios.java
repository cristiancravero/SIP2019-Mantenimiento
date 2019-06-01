package Mantenimiento.Modelo.Usuarios;

import java.util.ArrayList;
import java.util.Observable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Mantenimiento.Db.Usuarios.JavaPostgreSQLUsuarios;



@SpringBootApplication
public class GestorUsuarios  extends Observable implements IModeloUsuarios{
	JavaPostgreSQLUsuarios ConexionDB= new JavaPostgreSQLUsuarios(); 
	acciones accion;
	ArrayList<Permiso> pall=new ArrayList<Permiso>();
	ArrayList<Rol> rall=new ArrayList<Rol>();
	ArrayList<Usuario> uall=new ArrayList<Usuario>();
	Usuario u=new Usuario();
	Persona per = new Persona();
	Permiso p;
	Rol r=new Rol();
	String mensaje;
	

	public GestorUsuarios() {
		this.ConexionDB.connectDatabase();
	}
	
	public void validarAcceso(String usuario,String password) {
		this.ConexionDB.validarAcceso(usuario, password);
		if(this.ConexionDB.getOperacion()==estado.ACEPTADO){
			this.accion= acciones.ACCESOVALIDO;       
			this.notificarObservers(accion);
		}else {
			this.mensaje="El usuario ingresado no es valido";
			this.accion= acciones.ACCESOINVALIDO; 
			this.notificarObservers(accion);
		}
			
	}
	
	@Override
	public void agregarPermiso(String nombre) {
		Permiso p= new Permiso(0,nombre);
		buscarPermiso1(nombre);
		if(this.getPermiso()==null) {
			this.ConexionDB.agregarPermiso(p);
			if (this.ConexionDB.getOperacion()==estado.ACEPTADO) {
				this.mensaje="Permiso Agregado con exito";
				this.accion= acciones.AGREGARPERMISO;       
				this.notificarObservers(accion);
			}else {
				this.mensaje="Permiso existente";
				this.accion= acciones.ERROR;
				this.notificarObservers(accion);
				}
		}
	}

	@Override
	public void eliminarPermiso (String nombre) {
		buscarPermiso1(nombre);
		if(this.getPermiso()!=null) {
			Permiso p= this.getPermiso();
			p.setNombre(nombre);
			if(this.ConexionDB.rolAsignado(p.getId())==null) {
				this.ConexionDB.eliminarPermiso(p);
				if (this.ConexionDB.getOperacion()==estado.ACEPTADO) {
					this.mensaje="Permiso Eliminado con exito";
					this.accion= acciones.ELIMINARPERMISO;
					this.notificarObservers(accion);
					
				}else {
					this.mensaje="Permiso no existente";
					this.accion= acciones.ERROR;
					this.notificarObservers(accion);
					}
			}else {
				this.mensaje="Permiso asignado, no se puede eliminar";
				this.accion= acciones.ERROR;
				this.notificarObservers(accion);
			}
		}
	}

	@Override
	public void modificarPermiso(String nombre) {
		acciones a;
		buscarPermiso1(nombre);
		if(this.getPermiso()!=null) {
			Permiso p= this.getPermiso();
			p.setNombre(nombre);
			this.ConexionDB.modificarPermiso(p);
			if (this.ConexionDB.getOperacion()==estado.ACEPTADO) {
				this.mensaje="Permiso Modificado con exito";
				this.accion= acciones.MODIFICARPERMISO;
				this.notificarObservers(accion);
			}else {
				this.mensaje="Permiso no existente";
				this.accion= acciones.ERROR;
				this.notificarObservers(accion);
				}
		}
	}

	@Override
	public void buscarPermiso(String nombre) {
		this.p= null;
		ArrayList<Permiso> per=this.ConexionDB.buscarPermisos();
		for(int i=0;i<per.size();i++) {
			Permiso p1=per.get(i);
			if(p1.getNombre().equals(nombre)) {
				System.out.println("nombre array"+p1.getNombre());
				System.out.println("nombre"+nombre);
				this.p=per.get(i);
			}
		}
		if(p==null) {
			this.mensaje="Permiso no existente";
			this.accion= acciones.ERROR;
			this.notificarObservers(accion);
		}else {
			this.accion= acciones.CARGARPERMISO;
			this.notificarObservers(accion);
		}
		
		
	}

	
	public void buscarPermiso1(String nombre) {
		this.p= null;
		ArrayList<Permiso> per=this.ConexionDB.buscarPermisos();
		for(int i=0;i<per.size();i++) {
			Permiso p1=per.get(i);
			
			if(p1.getNombre().equals(nombre)) {
				System.out.println("nombre array"+p1.getNombre());
				System.out.println("nombre"+nombre);
				this.p=per.get(i);
				
			}
		}

	}
	
	public void agregarPersona(String nombre, String apellido, int dni) {
		Persona p= new Persona();
		p.setNombre(nombre);
		p.setApellido(apellido);
		p.setDni(dni);
		this.ConexionDB.agregarPersona(p);
	}
	
	public void modificarPersona(String nombre, String apellido, int dni) {
		Persona p= new Persona();
		p.setNombre(nombre);
		p.setApellido(apellido);
		p.setDni(dni);
		this.ConexionDB.modificarPersona(p);
	}	

	public void eliminarPersona(String nombre, String apellido, int dni) {
		Persona p= new Persona();
		p.setNombre(nombre);
		p.setApellido(apellido);
		p.setDni(dni);
		this.ConexionDB.eliminarPersona(p);
	}

	@Override
	public void agregarUsuarios(String nombre,String apellido,int dni,String password,String nombreRol) {
	/*	Usuario u=new Usuario(nombre,apellido,dni,password);
		Rol r;
		this.buscarUsuario1(dni);
		if(this.getUsuario()==null) {
			this.buscarRol1(nombreRol);
			r=this.getRol();
			u.setR(r);
			this.ConexionDB.agregarUsuario(u);
			if (this.ConexionDB.getOperacion()==estado.ACEPTADO) {
				this.ConexionDB.AsignarRol(this.r.getId(),dni);
				this.mensaje="Usuario Agregado con exito";
				this.accion= acciones.AGREGARUSUARIO;
				this.notificarObservers(accion);
			}else {
				this.mensaje="Usuario existente";
				this.accion= acciones.ERROR;
				this.notificarObservers(accion);
				}
		}*/
	}


	
	@Override
	public void eliminarUsuario(int dni) {
		/*this.buscarUsuario1(dni);
		if(this.getUsuario()!=null) {
			Usuario p= this.getUsuario();
			p.setDni(dni);
			this.ConexionDB.eliminarUsuario(p);
			if (this.ConexionDB.getOperacion()==estado.ACEPTADO) {
				this.ConexionDB.desasignarRol(p.getDni());
				this.mensaje="Usuario Eliminado con exito";
				this.accion= acciones.ELIMINARUSUARIO;
				this.notificarObservers(accion);
			}else {	
				this.mensaje="Usuario no existente";
				this.accion= acciones.ERROR;
				this.notificarObservers(accion);
				}
			
		}*/
	}

	@Override
	public void modificarUsuario(String nombre,String apellido,int dni,String password,String nombreRol) {
	/*	acciones a;
		this.buscarUsuario1(dni);
		if(this.u!=null) {
			Rol r;
			this.buscarRol1(nombreRol);
			r=this.getRol();
			Usuario u= this.getUsuario();
			u.setNombre(nombre);
			u.setApellido(apellido);
			u.setPassword(password);
			u.setR(r);
			this.ConexionDB.modificarUsuario(u);
			if (this.ConexionDB.getOperacion()==estado.ACEPTADO) {
				this.mensaje="Usuario Modificado con exito";
				this.accion= acciones.MODIFICARUSUARIO;
				this.notificarObservers(accion);
			}else {
				this.mensaje="Usuario no existente";
				this.accion= acciones.ERROR;
				this.notificarObservers(accion);
				}
		}*/
	}

	
	@Override
	public void buscarUsuario(int dni) {
		/*this.u= null;
		ArrayList<Usuario> per=this.ConexionDB.buscarUsuarios();
		for(int i=0;i<per.size();i++) {
			Usuario p1=per.get(i);
			if(p1.getDni()==dni) {
				this.u=per.get(i);
			}
		}
		if(u==null) {
			this.mensaje="Usuario no existente";
			this.accion= acciones.ERROR;
			this.notificarObservers(accion);
		}else {
			this.mensaje="Cargando Usuario";
			this.accion= acciones.CARGARUSUARIO;
			this.notificarObservers(accion);
		}*/

	}
	
	public void buscarUsuario1(int dni) {
/*		this.u= null;
		ArrayList<Usuario> per=this.ConexionDB.buscarUsuarios();
		for(int i=0;i<per.size();i++) {
			Usuario p1=per.get(i);
			if(p1.getDni()==dni) {
				this.u=per.get(i);
			}
		}*/
	}
	
	@Override
	public Usuario getUsuario() {
		return this.u;
	}
	

	@Override
	public void agregarRol(String nombre,String descripcion,ArrayList<Permiso> p) {
		Rol r=new Rol(nombre,descripcion);
		acciones a;
		this.buscarRol1(nombre);
		if(this.r==null) {
			this.r.setPermisos(p);
			this.ConexionDB.agregarRol(r);
			if (this.ConexionDB.getOperacion()==estado.ACEPTADO) {
				this.mensaje="Rol agregado con exito";
				this.accion= acciones.AGREGARUSUARIO;
				this.notificarObservers(accion);
			}else {
				this.mensaje="Rol existente";
				this.accion= acciones.ERROR;
				this.notificarObservers(accion);
				}
		}
	}

	@Override
	public void eliminarRol(String nombre) {
		this.buscarRol1(nombre);
		if(this.r!=null) {
			Rol p= this.getRol();
			p.setNombre(nombre);
			if(this.ConexionDB.usuariosAsignados(p.getId())==null) {
				this.ConexionDB.eliminarRoles(p);
				if (this.ConexionDB.getOperacion()==estado.ACEPTADO) {
					this.mensaje="Rol Eliminado";
					this.accion= acciones.ELIMINARROL;
					this.notificarObservers(accion);
				}else { 
					this.mensaje="Rol no existente";
					this.accion= acciones.ERROR;
					this.notificarObservers(accion);
					}
			}else {
				this.mensaje="Existen usuarios con el rol "+nombre+" asignado, la operacion no puede realizarse";
				this.accion= acciones.ERROR;
				this.notificarObservers(accion);
			}
		}
	}

	@Override
	public void modificarRol(String nombre,String descr,ArrayList<Permiso> p) {
		this.buscarRol1(nombre);
		if(this.r!=null) {
			Rol u= this.getRol();
			u.setNombre(nombre);
			u.setDescripcion(descr);
			u.setPermisos(p);
			this.ConexionDB.modificarRoles(u);
			if (this.ConexionDB.getOperacion()==estado.ACEPTADO) {
				this.mensaje="Rol eliminado con exito";
				this.accion= acciones.ELIMINARPERMISO;
				this.notificarObservers(accion);
			}else {
				this.mensaje="Rol no existente";
				this.accion= acciones.ERROR;
				this.notificarObservers(accion);
				}
		}
	
	}
	
	
	@Override
	public void buscarRol(String nombre) {
		Rol r = null;
		ArrayList<Rol> per=this.ConexionDB.buscarRoles();
		for(int i=0;i<per.size();i++) {
			r=per.get(i);
			if(r.getNombre()==nombre) {
				this.r= per.get(i);
			}
		}
		if(r==null) {
			this.mensaje="Rol no existente";
			this.accion= acciones.ERROR;
			this.notificarObservers(accion);
		}else {
			this.accion= acciones.CARGARROL;
			this.notificarObservers(accion);
		}
		
		
	}
	
	public void buscarRol1(String nombre) {
		Rol r = null;
		ArrayList<Rol> per=this.ConexionDB.buscarRoles();
		for(int i=0;i<per.size();i++) {
			r=per.get(i);
			if(r.getNombre()==nombre) {
				this.r= per.get(i);
			}
		}		
	}
	
	@Override
	public Rol getRol() {	
		return r;
	}
	

	@Override
	public acciones getAccion() {
		return accion;
	}
	
	private void notificarObservers(acciones e){
		this.setChanged();
		this.notifyObservers(e);
	}

	
	

	@Override
	public String getMensaje() {
		return mensaje;
	}

	@Override
	public void buscarRolesCombo() {
		this.rall=this.ConexionDB.buscarRoles();
		this.accion= acciones.COMBOROLES;
		this.notificarObservers(accion);		 
	}
	@Override
	public void buscarPermisosLista() {
		this.pall=this.ConexionDB.buscarPermisos();
		if(this.ConexionDB.getOperacion()==estado.ACEPTADO) {
		this.accion= acciones.LISTAPERMISOS;
		this.notificarObservers(accion); 
		}else {
			this.mensaje="No se pueden encontrar permisos";
			this.accion= acciones.ERROR;
		this.notificarObservers(accion);
		}
	}
	
	@Override
	public void buscarPermisosAll() {
		this.pall=this.ConexionDB.buscarPermisos();
	}
	@Override
	public void buscarUsuariosAll() {
		this.uall=this.ConexionDB.buscarUsuarios();
	}
	@Override
	public void buscarRolesAll() {
		this.rall=this.ConexionDB.buscarRoles();
	}
	@Override
	public Permiso getPermiso() {
		return p;
	}

	@Override
	public ArrayList<Usuario> getUsuarioAll() {
		
		return this.uall;
	}

	@Override
	public ArrayList<Permiso> getPermisoAll() {
		
		return this.pall;
	}
	
	@Override
	public ArrayList<Rol> getRolAll() {
		
		return this.rall;
	}

	
}
