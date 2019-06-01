package Mantenimiento.Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModifUser extends JFrame{

	JFrame frame;
	JButton btnNewButton;
	 JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifUser window = new ModifUser();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ModifUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 536, 177);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
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
