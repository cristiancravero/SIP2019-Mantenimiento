package Mantenimiento.Controlador;

import java.util.ArrayList;

import Mantenimiento.Usuarios.Permiso;
import Mantenimiento.Usuarios.Rol;
import Mantenimiento.Usuarios.Usuario;

public interface IVista {
	public void hacerVisible();
	public void mostrarMensaje(String mensaje);
	public void ocultar();
	void crearFrame();
	
	
	


}
