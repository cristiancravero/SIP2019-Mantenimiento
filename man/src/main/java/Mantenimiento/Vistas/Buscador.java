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

public class Buscador{

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buscador window = new Buscador();
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
	public Buscador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 519, 334);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new MigLayout("", "[][][grow][grow][][][][][][][][][][][]", "[][][][][][][][][][]"));
		
		JLabel lblBuscar = new JLabel("BUSCAR");
		lblBuscar.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblBuscar, "cell 14 0");
		
		JLabel lblNewLabel = new JLabel("Filtro:");
		panel.add(lblNewLabel, "cell 1 1,growy");
		
		JComboBox comboBox = new JComboBox();
		panel.add(comboBox, "cell 2 1 8 1,growx");
		
		JLabel lblNombre = new JLabel("Nombre:");
		panel.add(lblNombre, "cell 1 3,alignx trailing");
		
		textField = new JTextField();
		panel.add(textField, "cell 2 3 8 1,growx");
		textField.setColumns(10);
	}

}
