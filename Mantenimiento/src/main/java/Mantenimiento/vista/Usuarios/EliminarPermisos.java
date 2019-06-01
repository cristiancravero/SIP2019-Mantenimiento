package Mantenimiento.vista.Usuarios;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EliminarPermisos extends JPanel {
	JTextField textField;
	JButton btnAceptar;
	private JButton btnCancelar;
	/**
	 * Create the panel.
	 */
	public EliminarPermisos() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			JPanel panel = new JPanel();
			panel.setLayout(null);
			
			JLabel lblBuscar = new JLabel("ELIMINAR PERMISO");
			lblBuscar.setBounds(337, 11, 205, 22);
			lblBuscar.setFont(new Font("Tahoma", Font.BOLD, 18));
			panel.add(lblBuscar);
			
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setBounds(10, 59, 89, 14);
			panel.add(lblNombre);
			
			textField = new JTextField();
			textField.setBounds(76, 56, 237, 20);
			panel.add(textField);
			textField.setColumns(10);
			
			btnAceptar = new JButton("Eliminar");
			
			
			btnAceptar.setBounds(337, 55, 89, 23);
			panel.add(btnAceptar);
			
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(456, 55, 89, 23);
			panel.add(btnCancelar);
		
	}

}
