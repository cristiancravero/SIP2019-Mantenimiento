package Mantenimiento.Controlador;

import java.util.Observable;
import java.util.Observer;
import Mantenimiento.Modelo.Acceso.IModeloAcceso;
import Mantenimiento.Modelo.Acceso.AccesoAplication;
import Mantenimiento.Modelo.Usuarios.acciones;
import Mantenimiento.vista.Usuarios.Acceso;
import Mantenimiento.vista.Usuarios.Principal;
import Mantenimiento.vista.Usuarios.panelPrincipal;

public class ControladorAcceso implements Observer {


	private static ControladorAcceso instance = new ControladorAcceso();
	private static IModeloAcceso acceso;
	private static IVistaAcceso vista;
	//private static IVista vista1;
	static boolean accesoValido = false;
	static boolean clickUsuarios = false;

	
	 public static void main(String[] args) { setModelo(new AccesoAplication());
	  ControladorAcceso.getInstance(); ((Observable)acceso).addObserver(instance);
	 inicializar(); }
	 

	public static boolean isClickUsuarios() {
		return clickUsuarios;
	}

	public static void setClickUsuarios(boolean clickUsuarios) {
		ControladorAcceso.clickUsuarios = clickUsuarios;
	}
	
	public static boolean isAccesoValido() {
		return accesoValido;
	}

	public static void setAccesoValido(boolean accesoValido) {
		ControladorAcceso.accesoValido = accesoValido;
	}

	public static void setModelo(IModeloAcceso acceso) {
		ControladorAcceso.acceso = acceso;
	}

	public void validarAcceso(String usuario, String password) {
		this.acceso.validarAcceso(usuario, password);
	}

	public static ControladorAcceso getInstance() {
		return instance;
	}

	public static void inicializar() {
		setModelo(new AccesoAplication());
		ControladorAcceso.getInstance();
		((Observable) acceso).addObserver(instance);
		vista = (IVistaAcceso) new Acceso();
		vista.crearFrame();
		vista.hacerVisible();
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		acciones accion = acceso.getAccion();
		System.out.println("fui notificado" + accion);
		switch (accion) {
		case ACCESOVALIDO:
			this.vista.mostrarPanel();
		/*	vista.ocultar();
			vista = new Principal();
			vista.crearFrame();
			// vista.ocultar();
			vista.hacerVisible();*/
			break;
		case ACCESOINVALIDO:
			System.out.println("Paso por acceso invalido");
			vista.mostrarMensaje(acceso.getMensaje());

		case ERROR:
			System.out.println("Paso por error");
			vista.mostrarMensaje(acceso.getMensaje());
			break;
		default:
			break;
		}

	}

}
	
	