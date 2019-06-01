package Mantenimiento.Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AgregaPermiso extends JFrame{

	JFrame frame;
	JTextField nombreField;
	JLabel lNombre;
	JButton bCancelar;
	JButton bAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregaPermiso window = new AgregaPermiso();
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
	public AgregaPermiso() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 193);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblAgregarPermiso = new JLabel("AGREGAR PERMISO");
		lblAgregarPermiso.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAgregarPermiso.setBounds(234, 11, 178, 14);
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
