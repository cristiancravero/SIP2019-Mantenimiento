package Mantenimiento.Modelo.Acceso;

import Mantenimiento.Modelo.Usuarios.acciones;

public interface IModeloAcceso {
	
	public void validarAcceso(String usuario,String password);
	public String getMensaje();
	public acciones getAccion();
	
	
}
