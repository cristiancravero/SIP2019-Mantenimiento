package Mantenimiento.Controlador;

import java.util.Observable;
import java.util.Observer;

import Mantenimiento.Modelo.Pedido.GestorPedidos;
import Mantenimiento.Modelo.Pedido.Pedido;
import Mantenimiento.Modelo.Pedido.acciones;
import Mantenimiento.vista.Pedidos.AdmPedidos;
import Mantenimiento.vista.Usuarios.VistaUsuarios;

public class ControladorPedidos implements Observer{
	private static ControladorPedidos instance = new ControladorPedidos();
	private  static	GestorPedidos gpedidos;
	private static	AdmPedidos vista;

	public static void main(String[] args) {
		setModelo(new GestorPedidos());
		ControladorPedidos.getInstance();
		((Observable)gpedidos).addObserver(instance);
		inicializar();
	}
	
	public static void inicializar() {
		vista = (AdmPedidos) new AdmPedidos();
		vista.crearFrame();
		vista.hacerVisible();
	}
	
	public  static void setModelo(GestorPedidos users) {
		ControladorPedidos.gpedidos = users;
	}

	public static ControladorPedidos getInstance(){
		return instance;
	}
	
	public void AltaPedido(Pedido p) {
		this.gpedidos.AltaPedido(p);
	}
	
	public void RecuperarPedido(String filtro, String clave) {
		this.gpedidos.RecuperarPedido(filtro, clave);
		
	}
	
	public void RecuperarListaPedido(String filtro) {
		this.gpedidos.RecuperarListaPedido(filtro);
	}
	
	
	public void ModificarPedido(Pedido p){
		this.gpedidos.ModificarPedido(p);
	}
	
	public void verPedido(Pedido p){
		this.gpedidos.verPedido("id","2314");
	}

	public void seleccionCargarTareaAlta() {
			
		}
	
	public void seleccionQuitarTareaAlta() {
		
	}
	
	public void seleccionVerInsumosAlta() {
		
	}
	
	public void seleccionCrear() {
		
	}
	

	
	
	
	@Override
	public void update(Observable arg0, Object arg1) {
		acciones accion = gpedidos.getAccion();
		System.out.println("fui notificado" + accion);
		switch (accion){
		case ALTAPEDIDO:  
			break;
		case MODIFICARPEDIDO:
			vista.mostrarModificar(gpedidos.getP());
			//vista.mostrarMensaje(gpedidos.getMensaje());
			break;
		case ELIIMINARPEDIDO:
			vista.mostrarMensaje(gpedidos.getMensaje());
			break;
		case CARGARLISTAPEDIDOS:
			vista.mostrarPedidos(gpedidos.getLista());
			break;
		case CARGARLISTATAREAS:
		//	vista.mostrarMensaje();
			break;	
		case CARGARPEDIDOVISUALIZAR:
			vista.mostrarVisualizar();
			break;
		case CARGARPEDIDOMODIFICAR:
			vista.mostrarVisualizar();
			break;
		default:
			break;}

	}

}
