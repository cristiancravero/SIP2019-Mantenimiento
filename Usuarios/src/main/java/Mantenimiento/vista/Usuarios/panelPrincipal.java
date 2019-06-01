package Mantenimiento.vista.Usuarios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Mantenimiento.Controlador.IVistaAcceso;

import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.Box;
import javax.swing.JInternalFrame;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class panelPrincipal extends JFrame implements IVistaAcceso {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					panelPrincipal frame = new panelPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public panelPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 496);
		setTitle("Menu Principal");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 165, 0));
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(248, 248, 255));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JButton btnGestionDeUsuarios = new JButton("");
		btnGestionDeUsuarios.setBounds(117, 170, 95, 55);
		btnGestionDeUsuarios.setIcon(null);
		panel_1.add(btnGestionDeUsuarios);
		
		JButton btnGestionPedidos = new JButton("");
		btnGestionPedidos.setBounds(279, 60, 91, 55);
		panel_1.add(btnGestionPedidos);
		
		JLabel lblNewLabel = new JLabel("Gestion de Usuarios");
		lblNewLabel.setBounds(127, 236, 127, 14);
		lblNewLabel.setLabelFor(btnGestionDeUsuarios);
		panel_1.add(lblNewLabel);
		
		JLabel lblGestionDePedidos = new JLabel("Gestion de Pedidos");
		lblGestionDePedidos.setBounds(279, 120, 112, 14);
		lblGestionDePedidos.setLabelFor(btnGestionPedidos);
		panel_1.add(lblGestionDePedidos);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(10, 403, 658, 23);
		panel_1.add(btnSalir);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(477, 60, 91, 55);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(137, 286, 91, 55);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(279, 192, 91, 55);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBounds(477, 192, 95, 55);
		panel_1.add(btnNewButton_3);
		
		JLabel lblGestionDeOrdenes = new JLabel("Gestion de Ordenes de Trabajo");
		lblGestionDeOrdenes.setBounds(117, 353, 150, 14);
		panel_1.add(lblGestionDeOrdenes);
		
		JLabel label = new JLabel("Gestion de Ordenes de Trabajo");
		label.setBounds(442, 120, 150, 14);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("Gestion de Ordenes de Trabajo");
		label_1.setBounds(253, 258, 150, 14);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("Gestion de Ordenes de Trabajo");
		label_2.setBounds(442, 258, 150, 14);
		panel_1.add(label_2);
	}

	@Override
	public void hacerVisible() {
		setVisible(true);
		
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
		setVisible(false);
		
	}

	@Override
	public void crearFrame() {
		new panelPrincipal();
		
	}

	@Override
	public void validarAcceso() {
		// TODO Auto-generated method stub
		
	}
}
