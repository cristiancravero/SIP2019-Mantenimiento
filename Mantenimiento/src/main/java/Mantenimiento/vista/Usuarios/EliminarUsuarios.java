package Mantenimiento.vista.Usuarios;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EliminarUsuarios extends JPanel {
	JButton btnAceptar;
	JTextField textField;
	/**
	 * Create the panel.
	 */
	public EliminarUsuarios() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel lblBuscar = new JLabel("ELIMINAR USUARIO");
		lblBuscar.setBounds(338, 11, 191, 22);
		lblBuscar.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblBuscar);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 87, 64, 14);
		panel.add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(66, 84, 262, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		btnAceptar = new JButton("Eliminar");
		
		btnAceptar.setBounds(338, 83, 89, 23);
		panel.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(437, 83, 89, 23);
		panel.add(btnCancelar);
	}

}