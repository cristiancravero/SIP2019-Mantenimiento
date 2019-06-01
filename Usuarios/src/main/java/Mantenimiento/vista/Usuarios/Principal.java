package Mantenimiento.vista.Usuarios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JPanel;

import Mantenimiento.Controlador.ControladorAcceso;
import Mantenimiento.Controlador.IVistaAcceso;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Principal implements IVistaAcceso{

	private JFrame frame;
	private Principal window;
	JButton btnNewButton_1;
//	static boolean clickUsuarios = false;
	//private ControladorAcceso control=new ControladorAcceso();

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/Mantenimiento/Imagenes/10438606_820406954649079_3196769624694590562_n.jpg")));
		frame.getContentPane().setBackground(new Color(248, 248, 255));
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		frame.setTitle("Acceso a Mantenimiento");
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 140, 0));
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setIcon(new ImageIcon(Principal.class.getResource("/Mantenimiento/Imagenes/Users256_25013 (1).png")));
		btnNewButton.setBounds(93, 54, 88, 81);
		panel_1.add(btnNewButton);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(Principal.class.getResource("/Mantenimiento/Imagenes/Note-Remember-Pencil-List-Important-Writing-512 (1).png")));
		button.setBounds(272, 54, 88, 81);
		panel_1.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(Principal.class.getResource("/Mantenimiento/Imagenes/images (1).png")));
		button_1.setBounds(428, 54, 88, 81);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.setBounds(93, 197, 88, 81);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("New button");
		button_3.setBounds(272, 197, 86, 81);
		panel_1.add(button_3);
		
		JButton button_4 = new JButton("New button");
		button_4.setBounds(428, 197, 88, 81);
		panel_1.add(button_4);
		
		btnNewButton_1 = new JButton("Salir");
		
		btnNewButton_1.setBounds(0, 377, 701, 23);
		panel_1.add(btnNewButton_1);
		
		JLabel lblGestionDeUsuarios = new JLabel("Gestion de Usuarios");
		lblGestionDeUsuarios.setBounds(89, 146, 130, 14);
		panel_1.add(lblGestionDeUsuarios);
		
		JLabel lblGestionDePedidos = new JLabel("Gestion de Pedidos");
		lblGestionDePedidos.setBounds(273, 146, 130, 14);
		panel_1.add(lblGestionDePedidos);
		frame.setBackground(new Color(248, 248, 255));
		frame.setBounds(100, 100, 717, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenu mnEdicion = new JMenu("Edicion");
		menuBar.add(mnEdicion);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
	}

	@Override
	public void hacerVisible() {
		window.frame.setVisible(true);
		
	}

	@Override
	public void mostrarMensaje(String mensaje) {
		JOptionPane optionPane = new JOptionPane();
		optionPane.setMessage(mensaje);
		JDialog dialog = optionPane.createDialog(mensaje);
		dialog.setAlwaysOnTop(true);
		dialog.setVisible(true);
		dialog.setModal(true);
		
	}

	@Override
	public void ocultar() {
		this.window.frame.setVisible(false);
		
	}

	@Override
	public void crearFrame() {
	window = new Principal();
		
	}

	@Override
	public void validarAcceso() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mostrarPanel() {
		// TODO Auto-generated method stub
		
	}
}
