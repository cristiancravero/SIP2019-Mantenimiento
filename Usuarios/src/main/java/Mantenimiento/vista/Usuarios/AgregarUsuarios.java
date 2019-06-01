package Mantenimiento.vista.Usuarios;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AgregarUsuarios extends JPanel {
	public JTextField DniField;
	public JPasswordField passwordField;
	public JPasswordField passwordField_1;
	public JPanel panel;
	public JTextField nombreField;
	public JTextField apellidoField;
	public JComboBox<String> comboBoxRol;
	public JButton bCancelar;
	public JButton bAceptar;
	private JButton btnAceptar;
	/**
	 * Create the panel.
	 */
	public AgregarUsuarios() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		panel = new JPanel();
		panel.setLayout(null);
		
		JLabel lblAgregarUsuario = new JLabel("AGREGAR USUARIO");
		lblAgregarUsuario.setBounds(225, 11, 209, 26);
		lblAgregarUsuario.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel.add(lblAgregarUsuario);
		
		JLabel lNombre = new JLabel("Nombre:");
		lNombre.setBounds(26, 69, 60, 14);
		panel.add(lNombre);
		
		nombreField = new JTextField();
		nombreField.setBounds(110, 66, 198, 20);
		panel.add(nombreField);
		nombreField.setColumns(10);
		
		JLabel lApellido = new JLabel("Apellido:");
		lApellido.setBounds(26, 106, 70, 14);
		panel.add(lApellido);
		
		apellidoField = new JTextField();
		apellidoField.setBounds(110, 103, 198, 20);
		panel.add(apellidoField);
		apellidoField.setColumns(10);
		
		JLabel lDni = new JLabel("DNI:");
		lDni.setBounds(46, 137, 50, 14);
		panel.add(lDni);
		
		DniField = new JTextField();
		DniField.setBounds(110, 134, 198, 20);
		panel.add(DniField);
		DniField.setColumns(10);
		
		JLabel lContrasea = new JLabel("Contraseña:");
		lContrasea.setBounds(10, 162, 77, 14);
		panel.add(lContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(110, 165, 198, 20);
		panel.add(passwordField);
		
		JLabel lConfirmarContrasea = new JLabel("<html>Confirmar <br>\r\nContraseña:<html>");
		lConfirmarContrasea.setBounds(10, 187, 70, 33);
		panel.add(lConfirmarContrasea);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(110, 196, 198, 20);
		panel.add(passwordField_1);
		
		JLabel lAsignarRol = new JLabel("Asignar Rol:");
		lAsignarRol.setBounds(10, 236, 68, 14);
		panel.add(lAsignarRol);
	
		comboBoxRol = new JComboBox<String>();
		comboBoxRol.setBounds(110, 233, 198, 20);
		panel.add(comboBoxRol);	
	
		
		bCancelar = new JButton("Cancelar");
		bCancelar.setBounds(246, 317, 89, 23);
		panel.add(bCancelar);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(345, 317, 89, 23);
		panel.add(btnAceptar);
	}
}

