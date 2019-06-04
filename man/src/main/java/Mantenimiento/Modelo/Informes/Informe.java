package  Mantenimiento.Modelo.Informes;

import  Mantenimiento.Modelo.Pedido.OrdenDeTrabajo;
import  Mantenimiento.Modelo.Pedido.Pedido;

/**
 * @author Pato-PC
 * @version 1.0
 * @created 29-may.-2019 19:52:08
 */
public interface Informe {

	/**
	 * 
	 * @param informe
	 */
	public void imprimirInforme(Informe informe);

	/**
	 * 
	 * @param ordenTrabajo
	 */
	public void infAgentes(OrdenDeTrabajo ordenTrabajo);

	/**
	 * 
	 * @param pedido
	 */
	public void infPedidos(Pedido pedido);

	/**
	 * 
	 * @param ordenTrabajo
	 */
	public void insumosSector(OrdenDeTrabajo ordenTrabajo);

	/**
	 * 
	 * @param ordenTrabajo
	 */
	public void repSector(OrdenDeTrabajo ordenTrabajo);

}