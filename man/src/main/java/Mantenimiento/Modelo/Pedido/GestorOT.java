package Mantenimiento.Modelo.Pedido;

import java.util.ArrayList;
import java.util.Date;
import java.util.Observable;

import Mantenimiento.Db.Pedidos.JavaPostgreSQLPedidos;
import Mantenimiento.Modelo.Sectores.Sector;

public class GestorOT extends Observable{
	JavaPostgreSQLPedidos ConexionDB= new JavaPostgreSQLPedidos(); 
	OrdenDeTrabajo OT= new OrdenDeTrabajo();
	ArrayList<OrdenDeTrabajo> lista= new  ArrayList<OrdenDeTrabajo>();
	acciones accion;
	String mensaje;
	 
	public GestorOT() {
		this.ConexionDB.connectDatabase();
	}
	
	public OrdenDeTrabajo getOT() {
		return OT;
	}

	public void setOT(OrdenDeTrabajo OT) {
		this.OT = OT;
	}

	public ArrayList<OrdenDeTrabajo> getLista() {
		return lista;
	}

	public void setLista(ArrayList<OrdenDeTrabajo> lista) {
		this.lista = lista;
	}


	
	public String getMensaje() {
		return mensaje;
	}
	public acciones getAccion() {
		return this.accion;
	}
	
	private void notificarObservers(acciones e){
		this.setChanged();
		this.notifyObservers(e);
	}

	
	public void AltaPedido(Pedido p) {
		this.ConexionDB.AltaPedido(p);
		if(this.ConexionDB.AltaPedido(p)) {
			this.mensaje="";
			this.accion=acciones.ALTAPEDIDO;
			 notificarObservers(accion);
		}else {
			this.mensaje="";
			this.accion=acciones.ALTAPEDIDO;
			 notificarObservers(accion);
		}
		//guardar en base de datos
		//this.conexion.AltaPedido(p);
		//avisar a observers y actualizar mensaje 
	}
	
	public void RecuperarPedido(String filtro, String clave) {
		if(this.ConexionDB.AltaOT(OT)) {
			this.mensaje="";
			this.accion=acciones.ALTAPEDIDO;
			 notificarObservers(accion);
		}else {
			this.mensaje="";
			this.accion=acciones.ALTAPEDIDO;
			 notificarObservers(accion);
		}
		//this.p=this.conexion.RecuperarPedido(filtro,clave);
		//buscar en base de datos y devoler en p
				//avisar a observers y actualizar mensaje si error
	}
	
	public void RecuperarListaPedido(String filtro) {
		//if(this.ConexionDB.AltaPedido(p)) {
		//lista = new ArrayList<OrdenDeTrabajo>();
		lista.add(new Pedido(2341,"pedido de prueba sin descripcion",new Sector(2,"sector 2"),new Date(7777777), new Estado("iniciado",1),new Prioridad("Media",1),null, new ArrayList<Tareas>()));
		lista.add(new Pedido(2341,"pedido de prueba sin descripcion",new Sector(2,"sector 2"),new Date(7777777), new Estado("iniciado",1),new Prioridad("Media",1),null, new ArrayList<Tareas>()));
		lista.add(new Pedido(2341,"pedido de prueba sin descripcion",new Sector(2,"sector 2"),new Date(7777777), new Estado("iniciado",1),new Prioridad("Media",1),null, new ArrayList<Tareas>()));
			this.mensaje="";
			this.accion=acciones.CARGARLISTAPEDIDOS;
			 notificarObservers(accion);
		/*}else {
			this.mensaje="";
			this.accion=acciones.ALTAPEDIDO;
			 notificarObservers(accion);
		}*/
		//this.lista=this.conexion.RecuperarListaPedido(filtro);
		 //buscar en base de datos y devoler en lista
		//avisar a observers y actualizar mensaje si error
	}
	
	
	public void ModificarPedido(Pedido p){
		if(this.ConexionDB.AltaPedido(p)) {
			this.mensaje="";
			this.accion=acciones.ALTAPEDIDO;
			 notificarObservers(accion);
		}else {
			this.mensaje="";
			this.accion=acciones.ALTAPEDIDO;
			 notificarObservers(accion);
		}
		//this.conexion.ModificarPedido(p);
	}
	

	
}
}
