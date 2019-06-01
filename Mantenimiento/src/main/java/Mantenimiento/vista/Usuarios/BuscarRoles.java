package Mantenimiento.vista.Usuarios;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BuscarRoles extends JPanel {
	JTextField textField;
	JButton btnBuscar;
	private JPanel panel;

	/**
	 * Create the panel.
	 */
	public BuscarRoles() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		
		panel = new JPanel();
		
		panel.setLayout(null);
		
		JLabel lblBuscar = new JLabel("BUSCAR ROL");
		lblBuscar.setBounds(378, 11, 179, 22);
		lblBuscar.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblBuscar);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 71, 56, 14);
		panel.add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(76, 68, 222, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		
		btnBuscar.setBounds(308, 67, 89, 23);
		panel.add(btnBuscar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(407, 67, 89, 23);
		panel.add(btnCancelar);
	}

}
