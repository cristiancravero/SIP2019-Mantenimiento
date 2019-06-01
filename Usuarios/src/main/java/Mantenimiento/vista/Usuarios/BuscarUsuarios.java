package Mantenimiento.vista.Usuarios;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BuscarUsuarios extends JPanel {
	JButton btnNewButton;
	 JTextField textField;
	/**
	 * Create the panel.
	 */
	public BuscarUsuarios() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		JLabel lblBuscar = new JLabel("BUSCAR USUARIO");
		lblBuscar.setBounds(333, 7, 163, 22);
		lblBuscar.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblBuscar);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(37, 72, 60, 14);
		panel.add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(93, 69, 175, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Buscar");

		
		btnNewButton.setBounds(313, 68, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(421, 68, 89, 23);
		panel.add(btnCancelar);
	}
}
