package  Mantenimiento.Modelo.Pedido;

import  Mantenimiento.Modelo.Sectores.Sector;
import  Mantenimiento.Modelo.Usuarios.Usuario;

import java.util.ArrayList;
import java.util.Date;


/**
 * @author Pato-PC
 * @version 1.0
 * @created 29-may.-2019 19:48:01
 */
public class Pedido {
	private int idPedido;
	private String descripcion;
	public Sector Sector;
	private Date fechaInicio;
	public Estado estado;
	private Prioridad prioridad;
	private Usuario usuario;
	
	public ArrayList<Tareas> m_Tareas;
	private int cantTareas;

	public Pedido(){

	}


	public Pedido(int idPedido, String descripcion, Sector sector, Date fechaInicio,
			Estado estado, Prioridad prioridad, Usuario usuario,
			ArrayList<Tareas> m_Tareas) {
		super();
		this.idPedido = idPedido;
		this.descripcion = descripcion;
		Sector = sector;
		this.fechaInicio = fechaInicio;
		this.estado = estado;
		this.prioridad = prioridad;
		this.usuario = usuario;
		this.m_Tareas = m_Tareas;
	}


	public int getIdPedido() {
		return idPedido;
	}


	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Sector getSector() {
		return Sector;
	}


	public void setSector(Sector sector) {
		Sector = sector;
	}


	public Date getFechaInicio() {
		return fechaInicio;
	}


	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}


	public Estado getEstado() {
		return estado;
	}


	public void setEstado(Estado estado) {
		this.estado = estado;
	}


	public Prioridad getPrioridad() {
		return prioridad;
	}


	public void setPrioridad(Prioridad prioridad) {
		this.prioridad = prioridad;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public ArrayList<Tareas> getM_Tareas() {
		return m_Tareas;
	}


	public void setM_Tareas(ArrayList<Tareas> m_Tareas) {
		this.m_Tareas = m_Tareas;
		this.cantTareas=m_Tareas.size();
	}


	public int getCantTareas() {
		return cantTareas;
	}


	public void setCantTareas(int cantTareas) {
		this.cantTareas = cantTareas;
	}




}