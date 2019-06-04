package  Mantenimiento.Modelo.Insumos;

import java.util.ArrayList;

/**
 * @author Pato-PC
 * @version 1.0
 * @created 29-may.-2019 19:52:17
 */
public class Insumo {

	private String descripcion;
	private int idInsumo;
	public OrdenDeCompra m_OrdenDeCompra;
	public verSuministro m_verSuministro;
	public Stock m_Stock;

	public Insumo(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param descripcion
	 */
	public void altaInsumo(String descripcion){

	}

	/**
	 * 
	 * @param insumo
	 */
	public void bajaInsumo(Insumo insumo){

	}

	/**
	 * 
	 * @param nombre
	 */
	public void modificarInsumo(String nombre){

	}

	public ArrayList<Insumo> verInsumosSuministro(){
		return null;
	}

	/**
	 * 
	 * @param idInsumo
	 */
	public Insumo verStock(int idInsumo){
		return null;
	}

}