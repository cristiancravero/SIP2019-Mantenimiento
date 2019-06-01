package  Mantenimiento.Modelo.Pedido;

import  Mantenimiento.Modelo.Usuarios.Usuario;

/**
 * @author Pato-PC
 * @version 1.0
 * @created 29-may.-2019 19:48:02
 */
public class PedidoLargoPlazo extends Pedido {

	private boolean autorizado;
	private int disposicionNro;
	private Usuario responsableACargo;
	private int tiempoEstimado;
	public Usuario m_Usuario;

	public PedidoLargoPlazo(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}