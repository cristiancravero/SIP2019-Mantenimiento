package Mantenimiento.vista.Usuarios;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AgregarPermisos extends JPanel {
	JTextField nombreField;
	JLabel lNombre;
	JButton bCancelar;
	JButton bAceptar;
	/**
	 * Create the panel.
	 */
	public AgregarPermisos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel lblAgregarPermiso = new JLabel("AGREGAR PERMISO");
		lblAgregarPermiso.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAgregarPermiso.setBounds(244, 11, 178, 14);
		panel.add(lblAgregarPermiso);
		
		lNombre = new JLabel("Nombre:");
		lNombre.setBounds(10, 61, 84, 14);
		panel.add(lNombre);
		
		nombreField = new JTextField();
		nombreField.setBounds(64, 58, 284, 20);
		panel.add(nombreField);
		nombreField.setColumns(10);
		
		bAceptar = new JButton("Aceptar");
		bAceptar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		bAceptar.setBounds(333, 109, 89, 23);
		panel.add(bAceptar);
		
		bCancelar = new JButton("Cancelar");
		bCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		bCancelar.setBounds(234, 109, 89, 23);
		panel.add(bCancelar);
	}

}
