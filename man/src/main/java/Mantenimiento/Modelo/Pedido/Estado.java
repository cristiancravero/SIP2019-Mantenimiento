package Mantenimiento.Modelo.Pedido;


/**
 * Iniciado, en Curso, Pendiente, Finalizado, etc.
 * @author Pato-PC
 * @version 1.0
 * @created 29-may.-2019 19:47:57
 */
public class Estado {

	private String descripcion;
	private int idEstado;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}

	public Estado(String descripcion, int idEstado) {
		super();
		this.descripcion = descripcion;
		this.idEstado = idEstado;
	}

	public Estado(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param descripcion
	 */
	public void agregarEstado(String descripcion){

	}

	/**
	 * 
	 * @param idEstado
	 */
	public void eliminarEstado(int idEstado){

	}

}