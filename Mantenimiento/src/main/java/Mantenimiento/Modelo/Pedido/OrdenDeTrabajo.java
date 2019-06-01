package  Mantenimiento.Modelo.Pedido;

import java.util.Date;

import  Mantenimiento.Modelo.Informes.Informe;

/**
 * @author Pato-PC
 * @version 1.0
 * @created 29-may.-2019 19:48:00
 */
public class OrdenDeTrabajo {

	private Estado estado;
	private Date fechaFinOT;
	private Date fechaInicioOT;
	private int idOrdenTrabajo;
	private ItemOT listaTareas;
	public Estado m_Estado;
	public ItemOT m_ItemOT;
	public Informe m_Informe;

	public OrdenDeTrabajo(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param estado
	 */
	public void asignarEstado(Estado estado){

	}

	/**
	 * 
	 * @param ordenDeTrabajo
	 * @param tarea
	 */
	public void asignarTarea(OrdenDeTrabajo ordenDeTrabajo, Tareas tarea){

	}

	public void crearOT(){

	}

	/**
	 * 
	 * @param ordenDeTrabajo
	 * @param tarea
	 */
	public void desasignarTarea(OrdenDeTrabajo ordenDeTrabajo, Tareas tarea){

	}

	/**
	 * 
	 * @param ordenDeTrabajo
	 * @param tarea
	 */
	public void finalizarTarea(OrdenDeTrabajo ordenDeTrabajo, Tareas tarea){

	}

	/**
	 * 
	 * @param ordenDeTrabajo
	 */
	public void modificarOT(OrdenDeTrabajo ordenDeTrabajo){

	}

	public void verificarFinOT(){

	}

	/**
	 * 
	 * @param idOrdenTrabajo
	 */
	public void visualizarOT(int idOrdenTrabajo){

	}

}