package Mantenimiento.vista.Usuarios;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BuscarPermisos extends JPanel {
	JTextField nombreField;
	JButton btnBuscar;
	/**
	 * Create the panel.
	 */
	public BuscarPermisos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel lblBuscar = new JLabel("BUSCAR PERMISO");
		lblBuscar.setBounds(322, 11, 183, 22);
		lblBuscar.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblBuscar);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 71, 41, 14);
		panel.add(lblNombre);
		
		nombreField = new JTextField();
		nombreField.setBounds(61, 68, 222, 20);
		panel.add(nombreField);
		nombreField.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		
		btnBuscar.setBounds(293, 67, 89, 23);
		panel.add(btnBuscar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(392, 67, 89, 23);
		panel.add(btnCancelar);
	}

}
