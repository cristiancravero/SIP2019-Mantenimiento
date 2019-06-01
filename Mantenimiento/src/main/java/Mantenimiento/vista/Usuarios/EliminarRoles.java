package Mantenimiento.vista.Usuarios;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EliminarRoles extends JPanel {
	JTextField textField;
	JButton btnAceptar;
	private JButton btnCancelar;
	/**
	 * Create the panel.
	 */
	public EliminarRoles() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel lblBuscar = new JLabel("ELIMINAR ROL");
		lblBuscar.setBounds(414, 11, 136, 22);
		lblBuscar.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblBuscar);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(20, 58, 72, 14);
		panel.add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(71, 55, 252, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		btnAceptar = new JButton("Eliminar");
		
		btnAceptar.setBounds(347, 54, 89, 23);
		panel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(446, 54, 89, 23);
		panel.add(btnCancelar);
	}


}
