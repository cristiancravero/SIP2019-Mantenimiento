package Mantenimiento.Modelo.Acceso;

import java.util.Observable;


import Mantenimiento.Db.Usuarios.JavaPostgreSQLUsuarios;
import Mantenimiento.Modelo.Usuarios.Usuario;
import Mantenimiento.Modelo.Usuarios.acciones;
import Mantenimiento.Modelo.Usuarios.estado;

public class AccesoAplication extends Observable implements IModeloAcceso{
	JavaPostgreSQLUsuarios ConexionDB= new JavaPostgreSQLUsuarios();
	acciones accion;
	Usuario u=new Usuario();
	String mensaje;
	
	
	
	public AccesoAplication() {
		this.ConexionDB.connectDatabase();

	}
	
	@Override
	public acciones getAccion() {
		return accion;
	}
	
	private void notificarObservers(acciones e){
		this.setChanged();
		this.notifyObservers(e);
	}

	public String getMensaje() {
		return mensaje;
	}
	
	
	public void validarUsuario(String usuario,String password) {
		this.ConexionDB.validarUsuario(usuario);
		if(this.ConexionDB.getOperacion()==estado.ACEPTADO){
			this.ConexionDB.validarPassword(password);
			if(this.ConexionDB.getOperacion()==estado.ACEPTADO){
				this.mensaje="Acceso valido";
				this.accion= acciones.ACCESOVALIDO;
				this.notificarObservers(accion);
				
			}else {
				this.mensaje="El password ingresado no es valido";
				this.accion= acciones.ACCESOINVALIDO; 
				this.notificarObservers(accion);
			}
		}else {
			this.mensaje="El usuario ingresado no es valido";
			this.accion= acciones.ACCESOINVALIDO; 
			this.notificarObservers(accion);
		}
	}

	@Override
	public void validarAcceso(String usuario, String password) {
		this.ConexionDB.validarUsuario(usuario);
		if(this.ConexionDB.getOperacion()==estado.ACEPTADO){
			this.ConexionDB.validarPassword(password);
			if(this.ConexionDB.getOperacion()==estado.ACEPTADO){
				this.mensaje="Usuario valido";
				this.accion= acciones.ACCESOVALIDO;       
				this.notificarObservers(accion);
			}else {
				this.mensaje="El password ingresado no es valido";
				this.accion= acciones.ACCESOINVALIDO; 
				this.notificarObservers(accion);
			}
		}else {
			this.mensaje="El usuario ingresado no es valido";
			this.accion= acciones.ACCESOINVALIDO; 
			this.notificarObservers(accion);
		}
		
	}
	

	
}
