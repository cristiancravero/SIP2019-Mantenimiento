package Mantenimiento.Modelo.Pedido;

import java.util.ArrayList;
import java.util.Date;
import java.util.Observable;

import Mantenimiento.Db.Pedidos.JavaPostgreSQLPedidos;
import Mantenimiento.Modelo.Pedido.acciones;
import Mantenimiento.Modelo.Sectores.Sector;


public class GestorPedidos extends Observable {
	JavaPostgreSQLPedidos ConexionDB= new JavaPostgreSQLPedidos(); 
	Pedido p= new Pedido();
	ArrayList<Pedido> lista= new  ArrayList<Pedido>();
	acciones accion;
	String mensaje;
	 
	public GestorPedidos() {
		this.ConexionDB.connectDatabase();
	}
	
	public Pedido getP() {
		return p;
	}

	public void setP(Pedido p) {
		this.p = p;
	}

	public ArrayList<Pedido> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Pedido> lista) {
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
		this.RecuperarListaPedido( filtro);
		this.setP(lista.get(1));
		this.mensaje="";
		this.accion=acciones.MODIFICARPEDIDO;
		 notificarObservers(accion);
	/*	if(this.ConexionDB.AltaPedido(p)) {
			this.mensaje="";
			this.accion=acciones.MODIFICARPEDIDO;
			 notificarObservers(accion);
		}else {
			this.mensaje="";
			this.accion=acciones.ALTAPEDIDO;
			 notificarObservers(accion);
		}
		//this.p=this.conexion.RecuperarPedido(filtro,clave);
		//buscar en base de datos y devoler en p
				//avisar a observers y actualizar mensaje si error*/
	}
	
	
	public void verPedido(String filtro, String clave) {
		this.RecuperarListaPedido( filtro);
		this.setP(lista.get(1));
		this.mensaje="";
		this.accion=acciones.CARGARPEDIDOVISUALIZAR;
		 notificarObservers(accion);
	/*	if(this.ConexionDB.AltaPedido(p)) {
			this.mensaje="";
			this.accion=acciones.MODIFICARPEDIDO;
			 notificarObservers(accion);
		}else {
			this.mensaje="";
			this.accion=acciones.ALTAPEDIDO;
			 notificarObservers(accion);
		}
		//this.p=this.conexion.RecuperarPedido(filtro,clave);
		//buscar en base de datos y devoler en p
				//avisar a observers y actualizar mensaje si error*/
	}

	
	public void RecuperarListaPedido(String filtro) {
		//if(this.ConexionDB.AltaPedido(p)) {
		//lista = new ArrayList<Pedido>();
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
