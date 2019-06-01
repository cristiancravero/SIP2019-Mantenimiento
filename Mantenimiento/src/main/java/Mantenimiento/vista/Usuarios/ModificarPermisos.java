package Mantenimiento.vista.Usuarios;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class ModificarPermisos extends JPanel {
	JTextField nombreField;
	private JLabel label;
	private JButton button;
	private JButton button_1;

	/**
	 * Create the panel.
	 */
	public ModificarPermisos() {
		setLayout(null);
		
		button = new JButton("Aceptar");
		button.setBounds(334, 51, 83, 23);
		add(button);
		
		button_1 = new JButton("Cancelar");
		button_1.setBounds(427, 51, 93, 23);
		add(button_1);
		
		nombreField = new JTextField();
		nombreField.setBounds(61, 52, 268, 20);
		nombreField.setColumns(10);
		add(nombreField);
		
		label = new JLabel("Nombre:");
		label.setBounds(10, 55, 93, 14);
		add(label);
		
		JLabel label_1 = new JLabel("MODIFICAR PERMISO");
		label_1.setBounds(334, 11, 200, 22);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		add(label_1);

	}

}
