package  Mantenimiento.Modelo.Pedido;

import  Mantenimiento.Modelo.Especializacion.Especializacion;
import  Mantenimiento.Modelo.Insumos.Insumo;

/**
 * @author Pato-PC
 * @version 1.0
 * @created 29-may.-2019 19:48:04
 */
public class Tareas {

	private String descripcion;
	private Especializacion especializacion;
	private Estado estado;
	private int idOrdenTrabajo;
	private int idPedido;
	private int idTarea;
	private Prioridad prioridad;
	public Prioridad m_Prioridad;
	public Especializacion m_Especializacion;
	public Insumo m_Insumo;
	public Estado m_Estado;
	public ItemAgente m_ItemAgente;
	public ItemOT m_ItemOT;

	public Tareas(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param tarea
	 */
	public void cambiarEstado(Tareas tarea){

	}

	/**
	 * 
	 * @param tarea
	 */
	public void cargarInsumo(Tareas tarea){

	}

	/**
	 * 
	 * @param tarea
	 * @param insumo
	 */
	public void verificarInsumo(Tareas tarea, Insumo insumo){

	}

}