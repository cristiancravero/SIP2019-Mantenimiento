package Mantenimiento.vista.Usuarios;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import Mantenimiento.Controlador.IVistaUsuario;
import Mantenimiento.Controlador.controladorUsuarios;
import Mantenimiento.Usuarios.Permiso;
import Mantenimiento.Usuarios.Rol;
import Mantenimiento.Usuarios.Usuario;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToggleButton;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.ImageIcon;
import java.awt.Dialog.ModalExclusionType;

public class VistaUsuarios  extends JFrame  implements IVistaUsuario{
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private VistaUsuarios window;
	private controladorUsuarios control=new controladorUsuarios();
	 DefaultListModel<String> modeloDisponible = new DefaultListModel<>();
	 DefaultListModel<String> modeloUsado = new DefaultListModel<>();
	JPanel panelPrincipal = new JPanel();
	JPanel agregarPermisos = new JPanel();
	JPanel agregarUsuarios = new JPanel();
	JPanel agregarRoles = new JPanel();
	JPanel eliminarPermisos = new JPanel();
	JPanel eliminarRoles = new JPanel();
	JPanel eliminarUsuarios = new JPanel();
	JPanel buscarPermisos = new JPanel();
	JPanel buscarUsuarios = new JPanel();
	JPanel buscarRoles = new JPanel();
	JPanel modificarPermisos = new JPanel();
	JPanel modificarRoles = new JPanel();
	JPanel modificarUsuarios = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_15;
	private JComboBox<String> comboBox= new JComboBox<String>();
	private JTextPane textPane;
	private JList listPD=new JList(modeloDisponible);
	private JList listPU=new JList(modeloUsado);
	private JList listPD1=new JList(modeloDisponible);
	private JList listPU1=new JList(modeloUsado);
	private JPasswordField passwordField_2;
	private JPasswordField passwordField_3;
	private JTextPane textPane_1;
	private JButton buttonQ1;
	private JButton buttonA1;
	private JComboBox comboBox1= new JComboBox<String>();
	private JTextField textField_2;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_13;
	private JTextField textField_14;


	/**
	 * Create the application.
	 */
	public VistaUsuarios() {
	initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {	
		frame = new JFrame();		
		frame.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
	frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 764, 543);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		frame.setTitle("Gestión de Usuarios");
	JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		panelPrincipal.setForeground(Color.BLACK);
		panelPrincipal.setBorder(new LineBorder(new Color(0, 0, 0)));
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_2);
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(null);
		panel.add(panel_2, BorderLayout.WEST);	
		JPanel panel_1 = new JPanel();
		JButton bAgregarUsuario = new JButton("Agregar Usuario");
		bAgregarUsuario.setBounds(7, 7, 177, 23);
		bAgregarUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				mostrarAgregarUsuarios();
			}
		});
		panel_1.setLayout(null);
		panel_1.add(bAgregarUsuario);
		
		JButton bModificarUsuario = new JButton("Modificar Usuario");
		bModificarUsuario.setBounds(7, 34, 177, 23);
		bModificarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarBuscarUsuarios();
			}
		});
		panel_1.add(bModificarUsuario);
		
		JButton bEliminarUsuario = new JButton("Eliminar Usuario");
		bEliminarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mostrarEliminarUsuarios();
			}
		});
		bEliminarUsuario.setBounds(7, 61, 177, 23);
		panel_1.add(bEliminarUsuario);
		
		JPanel TABrol = new JPanel();
		tabbedPane.addTab("Roles", null, TABrol, null);
		TABrol.setLayout(new BoxLayout(TABrol, BoxLayout.X_AXIS));
		
		JPanel panel_3 = new JPanel();
		TABrol.add(panel_3);
		panel_3.setLayout(null);
		
		JButton bAgregarRol = new JButton("Agregar Rol");
		bAgregarRol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarAgregarRoles();
			}
		});
		bAgregarRol.setBounds(7, 7, 177, 23);
		panel_3.add(bAgregarRol);
		
		JButton bModificarRol = new JButton("Modificar Rol");
		bModificarRol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarBuscarRoles();
			}
		});
		bModificarRol.setBounds(7, 34, 177, 23);
		panel_3.add(bModificarRol);
		
		JButton bEliminarRol = new JButton("Eliminar Rol");
		bEliminarRol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarEliminarRoles();
			}
		});
		bEliminarRol.setBounds(7, 61, 177, 23);
		panel_3.add(bEliminarRol);
		
		JButton bBuscarRol = new JButton("Buscar Rol");
		bBuscarRol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mostrarBuscarRoles();
			}
		});
		bBuscarRol.setBounds(7, 88, 177, 23);
		panel_3.add(bBuscarRol);
		
		JPanel TABperm = new JPanel();
		tabbedPane.addTab("Permisos", null, TABperm, null);
		TABperm.setLayout(new BoxLayout(TABperm, BoxLayout.X_AXIS));
		
		JPanel panel_4 = new JPanel();
		TABperm.add(panel_4);
		panel_4.setLayout(null);
		
		JButton bAgregarPermiso = new JButton("Agregar Permiso");
		bAgregarPermiso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mostrarAgregarPermisos();
			}
		});
		bAgregarPermiso.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		bAgregarPermiso.setBounds(7, 7, 177, 23);
		panel_4.add(bAgregarPermiso);
		
		JButton bModificarPermiso = new JButton("Modificar Permiso");
		bModificarPermiso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarBuscarPermisos();
			}
		});
		bModificarPermiso.setBounds(7, 34, 177, 23);
		panel_4.add(bModificarPermiso);
		
		JButton bEliminarPermiso = new JButton("Eliminar Permiso");
		bEliminarPermiso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarEliminarPermisos();
			}
		});
		bEliminarPermiso.setBounds(7, 61, 177, 23);
		panel_4.add(bEliminarPermiso);
		
		JButton bBuscarPermiso = new JButton("Buscar Permiso");
		bBuscarPermiso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarBuscarPermisos();
			}
		});
		bBuscarPermiso.setBounds(7, 90, 177, 23);
		panel_4.add(bBuscarPermiso);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Configuracion", null, panel_5, null);
		
		JPanel TABusers = new JPanel();
		tabbedPane.addTab("Usuarios", null, TABusers, null);
		TABusers.setLayout(new BoxLayout(TABusers, BoxLayout.X_AXIS));
		TABusers.add(panel_1);
		
		JButton bBuscarUsuario = new JButton("Buscar Usuario");
		bBuscarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarBuscarUsuarios();
			}
		});
		bBuscarUsuario.setBounds(7, 88, 177, 23);
		panel_1.add(bBuscarUsuario);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(7, 116, 177, 23);
		panel_1.add(btnNewButton);
		
		JPanel panel_6 = new JPanel();
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addComponent(tabbedPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
				.addComponent(panel_6, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
		);
		
		JPanel panel_8 = new JPanel();
		tabbedPane.addTab("Personas", null, panel_8, null);
		panel_8.setLayout(null);
		
		JButton btnAgregarPersona = new JButton("Agregar Persona");
		btnAgregarPersona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarAgregarPersona();
			}
		});
		btnAgregarPersona.setBounds(10, 11, 177, 23);
		panel_8.add(btnAgregarPersona);
		
		JButton btnModificarPersona = new JButton("Modificar Persona");
		btnModificarPersona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarModificarPersona();
			}
		});
		btnModificarPersona.setBounds(10, 38, 177, 23);
		panel_8.add(btnModificarPersona);
		
		JButton btnEliminarPersona = new JButton("Eliminar Persona");
		btnEliminarPersona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarEliminarPersona();
			}
		});
		btnEliminarPersona.setBounds(10, 65, 177, 23);
		panel_8.add(btnEliminarPersona);
		
		JButton btnBuscarPersona = new JButton("Buscar Persona");
		btnBuscarPersona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarBuscarPersona();
			}
		});
		btnBuscarPersona.setBounds(10, 92, 177, 23);
		panel_8.add(btnBuscarPersona);
		panel_6.setLayout(new CardLayout(0, 0));
		
		JButton btnSalir = new JButton("Salir");
		panel_6.add(btnSalir, "name_540292915965200");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		panel_2.setLayout(gl_panel_2);
		panel.add(panelPrincipal, BorderLayout.CENTER);
		panelPrincipal.setLayout(null);
		panelPrincipal.setLayout(null);
		panelPrincipal.setLayout(new CardLayout(0, 0));
		
		JPanel panel_7 = new JPanel();
		panelPrincipal.add(panel_7, "name_291208470487700");
		panel_7.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, -72, 683, 697);
		lblNewLabel.setIcon(new ImageIcon(VistaUsuarios.class.getResource("/Mantenimiento/Imagenes/sommer.png")));
		panel_7.add(lblNewLabel);
		
		JLabel lblGestionDeUsuarios = new JLabel("GESTION DE USUARIOS");
		lblGestionDeUsuarios.setBounds(155, 24, 211, 25);
		panel_7.add(lblGestionDeUsuarios);
		lblGestionDeUsuarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionDeUsuarios.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		
		agregarPermisos.setLayout(null);
	
		
		JLabel label = new JLabel("AGREGAR PERMISO");
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(290, 11, 178, 14);
		agregarPermisos.add(label);
		
		JLabel label_1 = new JLabel("Nombre:");
		label_1.setBounds(10, 61, 84, 14);
		agregarPermisos.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(64, 58, 284, 20);
		agregarPermisos.add(textField);
		
		JButton button = new JButton("Aceptar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarPermisos();
			}
		});
		button.setBounds(280, 89, 89, 23);
		agregarPermisos.add(button);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.setBounds(379, 89, 89, 23);
		agregarPermisos.add(button_1);
		
		
		agregarUsuarios.setLayout(null);
		
		
		JLabel label_2 = new JLabel("AGREGAR USUARIO");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		label_2.setBounds(308, 11, 209, 26);
		agregarUsuarios.add(label_2);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(26, 69, 60, 14);
		agregarUsuarios.add(lblUsuario);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(110, 66, 288, 20);
		agregarUsuarios.add(textField_1);
		
		JLabel lblEmail = new JLabel("E-Mail:");
		lblEmail.setBounds(36, 100, 50, 14);
		agregarUsuarios.add(lblEmail);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(110, 97, 288, 20);
		agregarUsuarios.add(textField_3);
		
		JLabel label_6 = new JLabel("Contraseña:");
		label_6.setBounds(9, 131, 77, 14);
		agregarUsuarios.add(label_6);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(110, 128, 288, 20);
		agregarUsuarios.add(passwordField);
		
		JLabel label_7 = new JLabel("<html>Confirmar <br>\r\nContraseña:<html>");
		label_7.setBounds(19, 156, 70, 33);
		agregarUsuarios.add(label_7);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(110, 159, 288, 20);
		agregarUsuarios.add(passwordField_1);
		
		JLabel label_8 = new JLabel("Asignar Rol:");
		label_8.setBounds(18, 200, 68, 14);
		agregarUsuarios.add(label_8);
		
		JButton button_2 = new JButton("Cancelar");
		button_2.setBounds(343, 311, 89, 23);
		agregarUsuarios.add(button_2);
		
		JButton button_3 = new JButton("Aceptar");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarUsuarios();
			}
		});
		button_3.setBounds(244, 311, 89, 23);
		agregarUsuarios.add(button_3);
		
		
		agregarRoles.setLayout(null);
		
		
		JLabel label_9 = new JLabel("AGREGAR ROL");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_9.setBounds(385, 11, 150, 14);
		agregarRoles.add(label_9);
		
		JLabel label_10 = new JLabel("Nombre:");
		label_10.setBounds(22, 41, 89, 14);
		agregarRoles.add(label_10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(102, 38, 305, 20);
		agregarRoles.add(textField_4);
		
		JLabel label_11 = new JLabel("Descripcion:");
		label_11.setBounds(22, 114, 88, 14);
		agregarRoles.add(label_11);
		
		textPane = new JTextPane();
		textPane.setBounds(102, 89, 305, 73);
		agregarRoles.add(textPane);
		
		listPU = new JList();
		listPU.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listPU.setBounds(278, 200, 173, 221);
		agregarRoles.add(listPU);
		
		JButton buttonQ = new JButton("<");
		buttonQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quitarItemLista();
			}
		});
		buttonQ.setBounds(227, 250, 41, 30);
		agregarRoles.add(buttonQ);
		
		JButton buttonA = new JButton(">");
		buttonA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarItemLista();
			}
		});
		buttonA.setBounds(227, 291, 41, 30);
		agregarRoles.add(buttonA);
		
		listPD = new JList();
		listPD.setModel(new AbstractListModel() {
			String[] values = new String[] {""};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listPD.setValueIsAdjusting(true);
		listPD.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listPD.setBounds(46, 200, 171, 221);
		agregarRoles.add(listPD);
		
		JLabel label_12 = new JLabel("Permisos Disponibles");
		label_12.setBounds(72, 185, 127, 14);
		agregarRoles.add(label_12);
		
		JLabel label_13 = new JLabel("Permisos Utilizados");
		label_13.setBounds(318, 185, 118, 14);
		agregarRoles.add(label_13);
		
		JButton button_6 = new JButton("Aceptar");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarRoles();
			}
		});
		button_6.setBounds(347, 439, 89, 23);
		agregarRoles.add(button_6);
		
		JButton button_7 = new JButton("Cancelar");
		button_7.setBounds(446, 439, 89, 23);
		agregarRoles.add(button_7);
	
		eliminarPermisos.setLayout(null);
		
		
		JLabel label_14 = new JLabel("ELIMINAR PERMISO");
		label_14.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_14.setBounds(330, 11, 205, 22);
		eliminarPermisos.add(label_14);
		
		JLabel label_15 = new JLabel("Nombre:");
		label_15.setBounds(10, 59, 89, 14);
		eliminarPermisos.add(label_15);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(82, 56, 347, 20);
		eliminarPermisos.add(textField_5);
		
		JButton button_8 = new JButton("Eliminar");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarPermisos();
			}
		});
		button_8.setBounds(330, 93, 89, 23);
		eliminarPermisos.add(button_8);
		
		JButton button_9 = new JButton("Cancelar");
		button_9.setBounds(429, 93, 89, 23);
		eliminarPermisos.add(button_9);
		
	
		eliminarRoles.setLayout(null);
		
		
		JLabel label_16 = new JLabel("ELIMINAR ROL");
		label_16.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_16.setBounds(375, 11, 136, 22);
		eliminarRoles.add(label_16);
		
		JLabel label_17 = new JLabel("Nombre:");
		label_17.setBounds(55, 58, 72, 14);
		eliminarRoles.add(label_17);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(122, 55, 284, 20);
		eliminarRoles.add(textField_6);
		
		JButton button_10 = new JButton("Eliminar");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarRoles();
			}
		});
		button_10.setBounds(336, 91, 89, 23);
		eliminarRoles.add(button_10);
		
		JButton button_11 = new JButton("Cancelar");
		button_11.setBounds(435, 91, 89, 23);
		eliminarRoles.add(button_11);
		
		
		eliminarUsuarios.setLayout(null);
		
		
		JLabel label_18 = new JLabel("ELIMINAR USUARIO");
		label_18.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_18.setBounds(338, 11, 191, 22);
		eliminarUsuarios.add(label_18);
		
		JLabel lblDni = new JLabel("Usuario:");
		lblDni.setBounds(27, 67, 64, 14);
		eliminarUsuarios.add(lblDni);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(82, 64, 345, 20);
		eliminarUsuarios.add(textField_7);
		
		JButton button_12 = new JButton("Eliminar");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarUsuario();
			}
		});
		button_12.setBounds(338, 95, 89, 23);
		eliminarUsuarios.add(button_12);
		
		JButton button_13 = new JButton("Cancelar");
		button_13.setBounds(440, 95, 89, 23);
		eliminarUsuarios.add(button_13);
		
		
		buscarPermisos.setLayout(null);
		
		JLabel label_20 = new JLabel("BUSCAR PERMISO");
		label_20.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_20.setBounds(322, 11, 183, 22);
		buscarPermisos.add(label_20);
		
		JLabel label_21 = new JLabel("Nombre:");
		label_21.setBounds(26, 71, 82, 14);
		buscarPermisos.add(label_21);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(82, 68, 330, 20);
		buscarPermisos.add(textField_8);
		
		JButton button_14 = new JButton("Buscar");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarPermisos();
			}
		});
		button_14.setBounds(302, 104, 89, 23);
		buscarPermisos.add(button_14);
		
		JButton button_15 = new JButton("Cancelar");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_15.setBounds(402, 104, 89, 23);
		buscarPermisos.add(button_15);
		
		
		buscarRoles.setLayout(null);
	
		
		
		JLabel label_22 = new JLabel("BUSCAR ROL");
		label_22.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_22.setBounds(378, 11, 179, 22);
		buscarRoles.add(label_22);
		
		JLabel label_23 = new JLabel("Nombre:");
		label_23.setBounds(21, 58, 56, 14);
		buscarRoles.add(label_23);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(87, 55, 325, 20);
		buscarRoles.add(textField_9);
		
		JButton button_16 = new JButton("Buscar");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarRoles();
			}
		});
		button_16.setBounds(307, 88, 89, 23);
		buscarRoles.add(button_16);
		
		JButton button_17 = new JButton("Cancelar");
		button_17.setBounds(412, 88, 89, 23);
		buscarRoles.add(button_17);
		
		
		buscarUsuarios.setLayout(null);
	
		
		JLabel label_24 = new JLabel("BUSCAR USUARIO");
		label_24.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_24.setBounds(333, 7, 163, 22);
		buscarUsuarios.add(label_24);
		
		JLabel lblDni_1 = new JLabel("Usuario:");
		lblDni_1.setBounds(39, 57, 69, 14);
		buscarUsuarios.add(lblDni_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(97, 54, 309, 20);
		buscarUsuarios.add(textField_10);
		
		JButton button_18 = new JButton("Buscar");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarUsuarios();
			}
		});
		button_18.setBounds(313, 98, 89, 23);
		buscarUsuarios.add(button_18);
		
		JButton button_19 = new JButton("Cancelar");
		button_19.setBounds(419, 98, 89, 23);
		buscarUsuarios.add(button_19);
		
		
		modificarRoles.setLayout(null);

		
		JLabel lblMostrarRol = new JLabel("MOSTRAR ROL");
		lblMostrarRol.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMostrarRol.setBounds(340, 11, 198, 14);
		modificarRoles.add(lblMostrarRol);
		
		JLabel label_27 = new JLabel("Nombre:");
		label_27.setBounds(59, 41, 89, 14);
		modificarRoles.add(label_27);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(158, 38, 214, 20);
		modificarRoles.add(textField_11);
		
		JLabel label_28 = new JLabel("Descripcion:");
		label_28.setBounds(60, 117, 88, 14);
		modificarRoles.add(label_28);
		
		textPane_1 = new JTextPane();
		textPane_1.setBounds(158, 79, 214, 73);
		modificarRoles.add(textPane_1);
		
		JList listPU1 = new JList();
		listPU1.setBounds(326, 200, 173, 200);
		modificarRoles.add(listPU1);
		
		buttonQ1 = new JButton("<");
		buttonQ1.setBounds(258, 216, 41, 30);
		modificarRoles.add(buttonQ1);
		
		buttonA1 = new JButton(">");
		buttonA1.setBounds(258, 257, 41, 30);
		modificarRoles.add(buttonA1);
		
		JList listPD1 = new JList();
		listPD1.setValueIsAdjusting(true);
		listPD1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listPD1.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listPD1.setBounds(60, 200, 171, 200);
		modificarRoles.add(listPD1);
		
		JLabel label_29 = new JLabel("Permisos Disponibles");
		label_29.setBounds(78, 175, 127, 14);
		modificarRoles.add(label_29);
		
		JLabel label_30 = new JLabel("Permisos Utilizados");
		label_30.setBounds(356, 175, 118, 14);
		modificarRoles.add(label_30);
		
		JButton button_22 = new JButton("Aceptar");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modificarRoles();
			}
		});
		button_22.setBounds(326, 417, 89, 23);
		modificarRoles.add(button_22);
		
		JButton button_23 = new JButton("Cancelar");
		button_23.setBounds(432, 417, 89, 23);
		modificarRoles.add(button_23);
		
		
		modificarUsuarios.setLayout(null);

		
		JLabel lblMostrarUsuario = new JLabel("MOSTRAR USUARIO");
		lblMostrarUsuario.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblMostrarUsuario.setBounds(269, 11, 253, 26);
		modificarUsuarios.add(lblMostrarUsuario);
		
		JLabel lblUsuario_1 = new JLabel("Usuario:");
		lblUsuario_1.setBounds(36, 69, 60, 14);
		modificarUsuarios.add(lblUsuario_1);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(105, 66, 198, 20);
		modificarUsuarios.add(textField_12);
		
		JLabel label_35 = new JLabel("Contraseña:");
		label_35.setBounds(19, 94, 77, 14);
		modificarUsuarios.add(label_35);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(105, 97, 198, 20);
		modificarUsuarios.add(passwordField_2);
		
		JLabel label_36 = new JLabel("<html>Confirmar <br>\r\nContraseña:<html>");
		label_36.setBounds(25, 125, 70, 33);
		modificarUsuarios.add(label_36);
		
		passwordField_3 = new JPasswordField();
		passwordField_3.setBounds(105, 138, 198, 20);
		modificarUsuarios.add(passwordField_3);
		
		JLabel label_37 = new JLabel("Asignar Rol:");
		label_37.setBounds(28, 177, 68, 14);
		modificarUsuarios.add(label_37);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(105, 174, 198, 20);
		modificarUsuarios.add(comboBox_1);
		
		JButton button_24 = new JButton("Cancelar");
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_12.setText(null);
				
				textField_14.setText(null);
				passwordField_2.setText(null);
				passwordField_3.setText(null);
			}
		});
		button_24.setBounds(388, 284, 89, 23);
		modificarUsuarios.add(button_24);
		
		JButton button_25 = new JButton("Aceptar");
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modificarUsuarios();
			}
		});
		button_25.setBounds(289, 284, 89, 23);
		modificarUsuarios.add(button_25);
		
		
		modificarPermisos.setLayout(null);

		
		
		JLabel lblModificarPermiso = new JLabel("MOSTRAR PERMISO");
		lblModificarPermiso.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblModificarPermiso.setBounds(311, 11, 212, 22);
		modificarPermisos.add(lblModificarPermiso);
		
		JLabel label_39 = new JLabel("Nombre:");
		label_39.setBounds(10, 71, 70, 14);
		modificarPermisos.add(label_39);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(90, 68, 292, 20);
		modificarPermisos.add(textField_15);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modificarPermisos();
			}
		});
		btnAceptar.setBounds(338, 107, 89, 23);
		modificarPermisos.add(btnAceptar);
		
		JButton button_27 = new JButton("Cancelar");
		button_27.setBounds(434, 107, 89, 23);
		modificarPermisos.add(button_27);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnArchivo.add(mntmSalir);
		panelPrincipal.add(buscarUsuarios, "buscarUsuarios");
		panelPrincipal.add(buscarRoles, "buscarRoles");
		panelPrincipal.add(buscarPermisos, "buscarPermisos");
		panelPrincipal.add(eliminarUsuarios, "eliminarUsuarios");
		panelPrincipal.add(eliminarRoles, "eliminarRoles");
		panelPrincipal.add(eliminarPermisos, "eliminarPermisos");
		panelPrincipal.add(modificarPermisos, "modificarPermisos");
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Modificar");
		tglbtnNewToggleButton.setSelected(true);
		tglbtnNewToggleButton.setBounds(227, 107, 101, 23);
		modificarPermisos.add(tglbtnNewToggleButton);
		panelPrincipal.add(modificarUsuarios, "modificarUsuarios");
		
		JToggleButton toggleButton = new JToggleButton("Modificar");
		toggleButton.setBounds(202, 284, 77, 23);
		modificarUsuarios.add(toggleButton);
		panelPrincipal.add(modificarRoles, "modificarRoles");
		
		JToggleButton toggleButton_1 = new JToggleButton("Modificar");
		toggleButton_1.setSelected(true);
		toggleButton_1.setBounds(234, 417, 89, 23);
		modificarRoles.add(toggleButton_1);
		panelPrincipal.add(agregarPermisos, "agregarPermisos");
		panelPrincipal.add(agregarUsuarios, "agregarUsuarios");
		
		comboBox1 = new JComboBox();
		comboBox1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				comboBox1.showPopup();
				control.mostrarRoles();
				
			}
		});
		comboBox1.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent arg0) {
				control.mostrarRoles();
				comboBox1.showPopup();
			}
		});
		comboBox1.setBounds(110, 197, 288, 20);
		agregarUsuarios.add(comboBox1);
		panelPrincipal.add(agregarRoles, "agregarRoles");
		
		JPanel agregarPersona = new JPanel();
		panelPrincipal.add(agregarPersona, "name_965605758306900");
		agregarPersona.setLayout(null);
		
		JLabel label_3 = new JLabel("AGREGAR PERSONA");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 21));
		label_3.setBounds(289, 11, 228, 26);
		agregarPersona.add(label_3);
		
		JLabel label_4 = new JLabel("Nombre:");
		label_4.setBounds(26, 69, 60, 14);
		agregarPersona.add(label_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(110, 66, 288, 20);
		agregarPersona.add(textField_2);
		
		JLabel label_5 = new JLabel("Apellido:");
		label_5.setBounds(26, 106, 70, 14);
		agregarPersona.add(label_5);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(110, 103, 288, 20);
		agregarPersona.add(textField_16);
		
		JLabel label_19 = new JLabel("DNI:");
		label_19.setBounds(46, 137, 50, 14);
		agregarPersona.add(label_19);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(110, 134, 288, 20);
		agregarPersona.add(textField_17);
		
		JButton button_4 = new JButton("Cancelar");
		button_4.setBounds(350, 212, 89, 23);
		agregarPersona.add(button_4);
		
		JButton button_5 = new JButton("Aceptar");
		button_5.setBounds(251, 212, 89, 23);
		agregarPersona.add(button_5);
		
		JLabel label_32 = new JLabel("E-Mail:");
		label_32.setBounds(38, 165, 50, 14);
		agregarPersona.add(label_32);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(110, 168, 288, 20);
		agregarPersona.add(textField_14);
		
		JPanel mostrarPersona = new JPanel();
		panelPrincipal.add(mostrarPersona, "name_965605865557200");
		mostrarPersona.setLayout(null);
		
		JLabel lblMostrarPersona = new JLabel("MOSTRAR PERSONA");
		lblMostrarPersona.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblMostrarPersona.setBounds(269, 11, 253, 26);
		mostrarPersona.add(lblMostrarPersona);
		
		JLabel label_26 = new JLabel("Nombre:");
		label_26.setBounds(36, 69, 60, 14);
		mostrarPersona.add(label_26);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(105, 66, 198, 20);
		mostrarPersona.add(textField_18);
		
		JLabel label_31 = new JLabel("Apellido:");
		label_31.setBounds(36, 106, 70, 14);
		mostrarPersona.add(label_31);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(105, 97, 198, 20);
		mostrarPersona.add(textField_19);
		
		JLabel label_38 = new JLabel("DNI:");
		label_38.setBounds(56, 131, 50, 14);
		mostrarPersona.add(label_38);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(105, 128, 198, 20);
		mostrarPersona.add(textField_20);
		
		JButton button_20 = new JButton("Cancelar");
		button_20.setBounds(377, 195, 89, 23);
		mostrarPersona.add(button_20);
		
		JButton button_21 = new JButton("Aceptar");
		button_21.setBounds(278, 195, 89, 23);
		mostrarPersona.add(button_21);
		
		JToggleButton toggleButton_2 = new JToggleButton("Modificar");
		toggleButton_2.setBounds(191, 195, 77, 23);
		mostrarPersona.add(toggleButton_2);
		
		JLabel label_25 = new JLabel("E-Mail:");
		label_25.setBounds(46, 167, 50, 14);
		mostrarPersona.add(label_25);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(105, 164, 198, 20);
		mostrarPersona.add(textField_13);
		
		JPanel buscarPersona = new JPanel();
		panelPrincipal.add(buscarPersona, "name_965605965121400");
		buscarPersona.setLayout(null);
		
		JLabel label_40 = new JLabel("BUSCAR PERSONA");
		label_40.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_40.setBounds(333, 7, 210, 22);
		buscarPersona.add(label_40);
		
		JLabel label_41 = new JLabel("DNI:");
		label_41.setBounds(39, 57, 69, 14);
		buscarPersona.add(label_41);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(97, 54, 309, 20);
		buscarPersona.add(textField_21);
		
		JButton button_26 = new JButton("Buscar");
		button_26.setBounds(313, 98, 89, 23);
		buscarPersona.add(button_26);
		
		JButton button_28 = new JButton("Cancelar");
		button_28.setBounds(419, 98, 89, 23);
		buscarPersona.add(button_28);
		
		JPanel eliminarPersona = new JPanel();
		panelPrincipal.add(eliminarPersona, "name_965606049769500");
		eliminarPersona.setLayout(null);
		
		JLabel label_42 = new JLabel("ELIMINAR PERSONA");
		label_42.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_42.setBounds(338, 11, 191, 22);
		eliminarPersona.add(label_42);
		
		JLabel label_43 = new JLabel("DNI:");
		label_43.setBounds(27, 67, 64, 14);
		eliminarPersona.add(label_43);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(82, 64, 345, 20);
		eliminarPersona.add(textField_22);
		
		JButton button_29 = new JButton("Eliminar");
		button_29.setBounds(338, 95, 89, 23);
		eliminarPersona.add(button_29);
		
		JButton button_30 = new JButton("Cancelar");
		button_30.setBounds(440, 95, 89, 23);
		eliminarPersona.add(button_30);
		
	}

	@Override
	public void mostrarAgregarUsuarios() {
		CardLayout paletas =(CardLayout) ((panelPrincipal.getLayout())); 
		paletas.show(panelPrincipal, "agregarUsuarios"); 
		this.panelPrincipal.repaint();
		
		//this.panelPrincipal.repaint();
	}

	public void mostrarAgregarPersona() {
		CardLayout paletas =(CardLayout) ((panelPrincipal.getLayout())); 
		paletas.show(panelPrincipal, "agregarPersona"); 
		this.panelPrincipal.repaint();
		
		//this.panelPrincipal.repaint();
	}
	
	public void mostrarModificarPersona() {
		CardLayout paletas =(CardLayout) ((panelPrincipal.getLayout())); 
		paletas.show(panelPrincipal, "modificarPersona"); 
		this.panelPrincipal.repaint();
		
		//this.panelPrincipal.repaint();
	}
	
	
	public void mostrarEliminarPersona() {
		CardLayout paletas =(CardLayout) ((panelPrincipal.getLayout())); 
		paletas.show(panelPrincipal, "eliminarPersona"); 
		this.panelPrincipal.repaint();
		
		//this.panelPrincipal.repaint();
	}
	
	
	public void mostrarBuscarPersona() {
		CardLayout paletas =(CardLayout) ((panelPrincipal.getLayout())); 
		paletas.show(panelPrincipal, "buscarPersona"); 
		this.panelPrincipal.repaint();
		
		//this.panelPrincipal.repaint();
	}
	
	
	
	@Override
	public void mostrarAgregarRoles() {
		CardLayout paletas =(CardLayout) ((panelPrincipal.getLayout())); 
		paletas.show(panelPrincipal, "agregarRoles");
		this.panelPrincipal.repaint();
		this.control.mostrarAR();
		
	}

	
	@Override
	public void mostrarAgregarPermisos() {
		CardLayout paletas =(CardLayout) ((panelPrincipal.getLayout())); 
		paletas.show(panelPrincipal, "agregarPermisos"); 
		this.panelPrincipal.repaint();
	
	}
	
	@Override
	public void mostrarModificarPermisos(Permiso p) {
		CardLayout paletas =(CardLayout) ((panelPrincipal.getLayout())); 
		paletas.show(panelPrincipal, "modificarPermisos"); 
		this.textField_15.setText(p.getNombre());	
		//this.textField_15.disable();
		this.panelPrincipal.repaint();
		//this.cargarFormularioPermiso(p);
		System.out.println("nombrep"+p.getNombre());
		
	}

	@Override
	public void mostrarModificarRoles(Rol r) {
		this.cargarFormularioRol(r);
		CardLayout paletas =(CardLayout) ((panelPrincipal.getLayout())); 
		paletas.show(panelPrincipal, "modificarRoles"); 
		this.panelPrincipal.repaint();
		
	}

	@Override
	public void mostrarModificarUsuarios(Usuario u) {
		this.cargarFormularioUsuario(u);
		CardLayout paletas =(CardLayout) ((panelPrincipal.getLayout())); 
		paletas.show(panelPrincipal,"modificarUsuarios"); 
		this.panelPrincipal.repaint();
		
		
	}

	@Override
	public void mostrarEliminarUsuarios() {
		CardLayout paletas =(CardLayout) ((panelPrincipal.getLayout())); 
		paletas.show(panelPrincipal, "eliminarUsuarios"); 
		this.panelPrincipal.repaint();
		
	}

	@Override
	public void mostrarEliminarRoles() { 
		CardLayout paletas =(CardLayout) ((panelPrincipal.getLayout())); 
		paletas.show(panelPrincipal, "eliminarRoles"); 
		this.panelPrincipal.repaint();
	}

	@Override
	public void mostrarEliminarPermisos() { 
		CardLayout paletas =(CardLayout) ((panelPrincipal.getLayout())); 
		paletas.show(panelPrincipal, "eliminarPermisos"); 
		this.panelPrincipal.repaint();
		
		
	}
	
	@Override
	public void mostrarBuscarUsuarios() {
		CardLayout paletas =(CardLayout) ((panelPrincipal.getLayout())); 
		paletas.show(panelPrincipal, "buscarUsuarios"); 
		this.panelPrincipal.repaint();
	}
	
	@Override
	public void mostrarBuscarPermisos() {
		CardLayout paletas =(CardLayout) ((panelPrincipal.getLayout())); 
		paletas.show(panelPrincipal, "buscarPermisos"); 
		this.panelPrincipal.repaint();
		
	} 
	@Override
	public void mostrarBuscarRoles() { 
		CardLayout paletas =(CardLayout) ((panelPrincipal.getLayout())); 
		paletas.show(panelPrincipal, "buscarRoles"); 
		this.panelPrincipal.repaint();
	}
	
	
	

	@Override
	public void agregarUsuarios() {
		if (this.textField_3.getText().length() > 7 ||this.textField_3.getText().length() <=8 ){
		if (this.textField_1.getText().length() > 1 || this.textField_1.getText().length() <= 90 ){
		if (this.textField_2.getText().length() >= 1 && this.textField_2.getText().length() <= 90 ){
		//		if (this.passwordField.getText() ==this.passwordField_1.getText() ){
				String nombre=this.textField_1.getText();
				String apellido=this.textField_2.getText();
				int dni=Integer.parseInt(this.textField_3.getText());
				String password=this.passwordField.getText();
				String passwordc=this.passwordField_1.getText();
				String rol=(String) this.comboBox.getSelectedItem();
				this.control.agregarUser(nombre,apellido,dni,password,rol);
				this.textField_1.setText(null);
				this.textField_2.setText(null);
				this.textField_3.setText(null);
				this.textField_4.setText(null);
				this.textField_5.setText(null);
		} else{
			JOptionPane optionPane = new JOptionPane();
			optionPane.setMessage("Los datos ingresado no son validos " );
			JDialog dialog = optionPane.createDialog("Error");
			dialog.setAlwaysOnTop(true);
			dialog.setVisible(true);
			this.textField_1.setText(null);
			this.textField_2.setText(null);
			this.textField_3.setText(null);
			this.textField_4.setText(null);
			this.textField_5.setText(null);
		}
	}
	}
	}
//	}

	@Override
	public void agregarRoles() {
		if (this.textField_4.getText().length() >= 1 && this.textField_4.getText().length() <= 90 ){
			if (this.textPane.getText().length() >= 1 && this.textPane.getText().length() <= 90 ){
				String nombre=this.textField_4.getText();
				String descripcion=this.textField_4.getText();
				ArrayList<Permiso> p=(ArrayList<Permiso>) this.listPU.getModel();
				this.control.agregarRol(nombre, descripcion,p);
		} else{
			JOptionPane optionPane = new JOptionPane();
			optionPane.setMessage("Los datos ingresado no son validos " );
			JDialog dialog = optionPane.createDialog("Error");
			dialog.setAlwaysOnTop(true);
			dialog.setVisible(true);
			this.textField_4.setText(null);
			this.textPane.setText(null);
		}
	}
	}
		

	@Override
	public void agregarPermisos() {
		if (this.textField.getText().length() >= 1 && this.textField.getText().length() <= 90 ){
				String nombre=this.textField.getText();				
				this.control.agregarPermiso(nombre);
				this.textField.setText(null);
				
		} else{
			JOptionPane optionPane = new JOptionPane();
			optionPane.setMessage("Los datos ingresado no son validos " );
			JDialog dialog = optionPane.createDialog("Error");
			dialog.setAlwaysOnTop(true);
			dialog.setVisible(true);
			this.textField.setText(null);
			
		}
	}
		
	private void cargarFormularioUsuario(Usuario u) {
	/*	this.textField_12.setText(u.getNombre());
		this.textField_13.setText(u.getApellido());
		this.textField_14.setText(String.valueOf(u.getDni()));
		this.passwordField_2.setText(u.getPassword());
		this.passwordField_3.setText(u.getPassword());
		//this.comboBox.addItem(u.getR().getNombre());
		this.textField_12.disable();
		this.textField_13.disable();
		this.textField_14.disable();
		this.passwordField_2.disable();
		this.passwordField_3.disable();
		this.comboBox.disable();*/
	}

	private void cargarFormularioRol(Rol r) {
		this.textField_11.setText(r.getNombre());
		this.textPane_1.setText(r.getDescripcion());
		for(int i=0;i<r.getPermisos().size();i++) {
			modeloUsado.addElement(r.getPermisos().get(i).getNombre());	
		}
		this.listPU1.setModel(modeloUsado);
		//ArrayList<Permiso> p=(ArrayList<Permiso>) this.listPU.getModel();
		this.textField_11.disable();
		this.textPane_1.disable();
		this.listPD1.disable();
		this.listPU1.disable();
		this.buttonA1.disable();
		this.buttonQ1.disable();
		
	}


	private void cargarFormularioPermiso(Permiso p) {
		this.textField.setText(p.getNombre());	
		this.textField.disable();

	}
	


	@Override
	public void mostrarRolesCombo(ArrayList<Rol> a) {
		DefaultComboBoxModel<String> DLM = new DefaultComboBoxModel();
	    for (int i = 0; i < a.size(); i++) {
	    	System.out.println("mostrar combo"+a.get(i).getNombre());
	        DLM.addElement(a.get(i).getNombre());
	    }
	    System.out.println(DLM.getSize());
	    System.out.println(DLM.getElementAt(0));
	    this.comboBox1.setModel(DLM);
	  System.out.println(this.comboBox1.getModel().getElementAt(0));
	    this.comboBox1.show();
	    this.comboBox1.repaint();
	}

	@Override
	public void mostrarPermisosLista(ArrayList<Permiso> a) {
		 for(int i=0;i<a.size();i++) {
			 modeloDisponible.addElement((String)a.get(i).getNombre()); 
			 System.out.println("nombre"+a.get(i).getNombre());
		 }
		 this.listPD.setModel(modeloDisponible);
		 this.listPD.getAutoscrolls();
		 this.listPU.setModel(modeloUsado);
		 this.listPD.repaint();
		 this.panelPrincipal.repaint();
	}
	

	@Override
	public void modificarUsuarios() {
		if (this.textField_12.getText().length() >= 1 && this.textField_12.getText().length() <= 90 ){
		//if (this.textField_13.getText().length() >= 1 && this.textField_13.getText().length() <= 90 ) {
				if (this.passwordField_3.getText() ==this.passwordField_3.getText() ){
				String nombre=this.textField_12.getText();
			//	String apellido=this.textField_13.getText();
				this.textField_14.disable();
				int dni=Integer.parseInt(this.textField_14.getText());
				String password=this.passwordField_2.getText();
				String passwordc=this.passwordField_3.getText();
				String rol=(String) this.comboBox.getSelectedItem();
				//this.control.modificarUser(nombre,apellido,dni,password,rol);
		} else{
			JOptionPane optionPane = new JOptionPane();
			optionPane.setMessage("Los datos ingresado no son validos " );
			JDialog dialog = optionPane.createDialog("Error");
			dialog.setAlwaysOnTop(true);
			dialog.setVisible(true);
		}
	}
	}
		
	

	@Override
	public void modificarRoles() {
		if (this.textField_11.getText().length() >= 1 && this.textField_11.getText().length() <= 90 ){
			if (this.textPane_1.getText().length() >= 1 && this.textPane_1.getText().length() <= 90 ){
				String nombre=this.textField_11.getText();
				String descripcion=this.textPane_1.getText();
				ArrayList<Permiso> p=(ArrayList<Permiso>) this.listPU.getModel();
				this.control.agregarRol(nombre,descripcion,p);
		} else{
			JOptionPane optionPane = new JOptionPane();
			optionPane.setMessage("Los datos ingresado no son validos " );
			JDialog dialog = optionPane.createDialog("Error");
			dialog.setAlwaysOnTop(true);
			dialog.setVisible(true);
			
		}
		}
	}

	@Override
	public void modificarPermisos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarPermisos() {
		if (this.textField_5.getText().length() >= 1 && this.textField_5.getText().length() <= 90 ){
			String nombre=this.textField_5.getText();
			this.control.eliminarPermiso(nombre);
	} else{
		JOptionPane optionPane = new JOptionPane();
		optionPane.setMessage("Los datos ingresado no son validos " );
		JDialog dialog = optionPane.createDialog("Error");
		dialog.setAlwaysOnTop(true);
		dialog.setVisible(true);
		this.textField_5.setText(null);
		
	}
		
	}

	@Override
	public void eliminarRoles() {
		if (this.textField_6.getText().length() >= 1 && this.textField_6.getText().length() <= 90 ){
			String nombre=this.textField_6.getText();
			this.control.eliminarRol(nombre);
	} else{
		JOptionPane optionPane = new JOptionPane();
		optionPane.setMessage("Los datos ingresado no son validos " );
		JDialog dialog = optionPane.createDialog("Error");
		dialog.setAlwaysOnTop(true);
		dialog.setVisible(true);
		this.textField_6.setText(null);
		
	}
	}

	@Override
	public void eliminarUsuario() {
		if (this.textField_7.getText().length() >= 7 && this.textField_7.getText().length() <= 8 ){
			int dni=Integer.parseInt(this.textField_7.getText());
			this.control.eliminarUser(dni);
	} else{
		JOptionPane optionPane = new JOptionPane();
		optionPane.setMessage("Los datos ingresado no son validos " );
		JDialog dialog = optionPane.createDialog("Error");
		dialog.setAlwaysOnTop(true);
		dialog.setVisible(true);
		this.textField_7.setText(null);
		
	}
		
	}

	@Override
	public void buscarPermisos() {
		if (this.textField_8.getText().length() >= 1 && this.textField_8.getText().length() <= 90 ){
			String nombre=this.textField_8.getText();
			this.control.buscarPermiso(nombre);
			this.textField_8.setText(null);
	} else{
		JOptionPane optionPane = new JOptionPane();
		optionPane.setMessage("Los datos ingresado no son validos " );
		JDialog dialog = optionPane.createDialog("Error");
		dialog.setAlwaysOnTop(true);
		dialog.setVisible(true);
		this.textField_8.setText(null);
	}
		
	}

	@Override
	public void buscarRoles() {
		if (this.textField_9.getText().length() >= 1 && this.textField_9.getText().length() <= 90 ){
			String nombre=this.textField_9.getText();
			this.control.buscarRol(nombre);
			this.textField_9.setText(null);
	} else{
		JOptionPane optionPane = new JOptionPane();
		optionPane.setMessage("Los datos ingresado no son validos " );
		JDialog dialog = optionPane.createDialog("Error");
		dialog.setAlwaysOnTop(true);
		dialog.setVisible(true);
		this.textField_9.setText(null);
	}
		
	}

	@Override
	public void buscarUsuarios() {
		if (this.textField_10.getText().length() > 1 && this.textField_10.getText().length() <= 90 ){
			int dni=Integer.parseInt(this.textField_10.getText());
			this.control.buscaruser(dni);
			this.textField_10.setText(null);
	} else{
		JOptionPane optionPane = new JOptionPane();
		optionPane.setMessage("Los datos ingresado no son validos " );
		JDialog dialog = optionPane.createDialog("Error");
		dialog.setAlwaysOnTop(true);
		dialog.setVisible(true);
		this.textField_10.setText(null);
	}
		
	}

	@Override
	public void agregarItemLista() {
		modeloUsado.addElement((String)listPD.getSelectedValue());
		modeloDisponible.removeElement(listPD.getSelectedValue());
		listPU.setModel(modeloUsado);
		listPD.setModel(modeloDisponible);
		
	}

	@Override
	public void quitarItemLista() {
		modeloDisponible.addElement((String) listPU.getSelectedValue());
		//model1.addElement((Permiso) list_1.getSelectedValue());
		modeloUsado.removeElement(listPU.getSelectedValue());
		listPU.setModel(modeloUsado);
		listPD.setModel(modeloDisponible);
		
		
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
	public void crearFrame() {
	window = new VistaUsuarios();
	}

	@Override
	public void hacerVisible() {
		window.frame.setVisible(true);
		
	}


	@Override
	public void ocultar() {
		this.window.frame.setVisible(false);
		
	}
}
