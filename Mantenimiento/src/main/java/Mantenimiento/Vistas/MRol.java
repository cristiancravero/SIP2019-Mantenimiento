package Mantenimiento.Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MRol extends JFrame{

	JFrame frame;
	JTextField nombreField;
	private JLabel lNombre;
	private JLabel lDescripcion;
	 JList listPD;
	private JList listPU;
	private JButton bQuitar;
	private JButton bAgregar;
	private JButton btnCancelar;
	private JButton btnAceptar;
	JTextPane descripPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MRol window = new MRol();
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
	public MRol() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 540, 502);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblAgregarRol = new JLabel("MODIFICAR ROL");
		lblAgregarRol.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAgregarRol.setBounds(340, 11, 198, 14);
		panel.add(lblAgregarRol);
		
		lNombre = new JLabel("Nombre:");
		lNombre.setBounds(59, 41, 89, 14);
		panel.add(lNombre);
		
		nombreField = new JTextField();
		nombreField.setBounds(158, 38, 214, 20);
		panel.add(nombreField);
		nombreField.setColumns(10);
		
		lDescripcion = new JLabel("Descripcion:");
		lDescripcion.setBounds(60, 117, 88, 14);
		panel.add(lDescripcion);
		
		descripPane = new JTextPane();
		descripPane.setBounds(158, 79, 214, 73);
		panel.add(descripPane);
		
		listPU = new JList();
		listPU.setBounds(326, 200, 173, 200);
		panel.add(listPU);
		
		bQuitar = new JButton("<");
		bQuitar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		bQuitar.setBounds(258, 216, 41, 30);
		panel.add(bQuitar);
		
		bAgregar = new JButton(">");
		bAgregar.setBounds(258, 257, 41, 30);
		panel.add(bAgregar);
		
		listPD = new JList();
		listPD.setBounds(60, 200, 171, 200);
		panel.add(listPD);
		
		JLabel lPermisosDisponibles = new JLabel("Permisos Disponibles");
		lPermisosDisponibles.setBounds(78, 175, 127, 14);
		panel.add(lPermisosDisponibles);
		
		JLabel lPermisosUtilizados = new JLabel("Permisos Utilizados");
		lPermisosUtilizados.setBounds(356, 175, 118, 14);
		panel.add(lPermisosUtilizados);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(425, 417, 89, 23);
		panel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(326, 417, 89, 23);
		panel.add(btnCancelar);
	}
}
