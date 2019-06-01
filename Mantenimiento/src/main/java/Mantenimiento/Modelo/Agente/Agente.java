package Mantenimiento.Modelo.Agente;

import  Mantenimiento.Modelo.Especializacion.Especializacion;

/**
 * @author Pato-PC
 * @version 1.0
 * @created 29-may.-2019 19:51:34
 */
public class Agente {

	private String apellido;
	public int idLegajo;
	private String nombre;
	public Especializacion m_Especializacion;

	public Agente(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param nombre
	 * @param apellido
	 */
	public void altaAgente(String nombre, String apellido){

	}

	/**
	 * 
	 * @param especializacion
	 */
	public void asignarEspecializacion(Especializacion especializacion){

	}

	/**
	 * 
	 * @param agente
	 */
	public void bajaAgente(Agente agente){

	}

	/**
	 * 
	 * @param agente
	 */
	public boolean buscarAgente(Agente agente){
		return false;
	}

	public boolean consultarDisponibilidad(){
		return false;
	}

	/**
	 * 
	 * @param agente
	 */
	public void modificarAgente(Agente agente){

	}

}