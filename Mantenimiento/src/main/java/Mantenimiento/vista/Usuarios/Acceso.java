package Mantenimiento.vista.Usuarios;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import Mantenimiento.Controlador.IVista;
import Mantenimiento.Controlador.IVistaAcceso;
import Mantenimiento.Controlador.ControladorAcceso;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Toolkit;


public class Acceso implements IVista, IVistaAcceso{
	private ControladorAcceso control=new ControladorAcceso();
	private Principal panelP=new Principal();
	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private Acceso window;

	/**
	 * Create the application.
	 */
	public Acceso() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		 
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Acceso.class.getResource("/Mantenimiento/Imagenes/10438606_820406954649079_3196769624694590562_n.jpg")));
		frame.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frame.setResizable(false);
		frame.setBounds(100, 100, 601, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		frame.setTitle("Acceso a Mantenimiento");
		JLabel lblNewLabel_1 = new JLabel("aquí");
		lblNewLabel_1.setForeground(new Color(0, 51, 204));
		lblNewLabel_1.setBounds(297, 272, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblHospitalNacional = new JLabel("HOSPITAL NACIONAL \r\n\"Dr. Baldomero Sommer\"");
		lblHospitalNacional.setForeground(new Color(0, 51, 255));
		lblHospitalNacional.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblHospitalNacional.setBounds(77, 0, 448, 68);
		panel.add(lblHospitalNacional);
		
		JLabel lblIngresoAMantenimiento = new JLabel("INGRESO A MANTENIMIENTO");
		lblIngresoAMantenimiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIngresoAMantenimiento.setBounds(185, 54, 255, 14);
		panel.add(lblIngresoAMantenimiento);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsuario.setBounds(130, 93, 78, 14);
		panel.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContrasea.setBounds(107, 134, 101, 14);
		panel.add(lblContrasea);
		
		textField = new JTextField();
		textField.setBounds(218, 90, 209, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(218, 131, 209, 20);
		panel.add(passwordField);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			validarAcceso();
			}
		});
		btnIngresar.setBounds(133, 180, 294, 35);
		panel.add(btnIngresar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(133, 226, 294, 35);
		panel.add(btnSalir);
	        
		this.panelP.btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarAcceso();
			}
		});
		
	        JLabel lblhasOlvidadoLa = new JLabel("¿No recordás tu clave? Hace click ");
	        lblhasOlvidadoLa.setBounds(133, 272, 225, 14);
	        panel.add(lblhasOlvidadoLa);
	        
	        // ImageIcon icono = new javax.swing.ImageIcon(getClass().getResource("/src/main/java/Mantenimiento.Imagenes/sommer.png"));
	       // Image imagen = icono.getImage();
	        //ImageIcon iconoEscalado = new ImageIcon (imagen.getScaledInstance(100,100,Image.SCALE_SMOOTH));
	        
	        JLabel lblNewLabel = new JLabel("");
	        lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
	        lblNewLabel.setBounds(130, -28, 468, 569);
	        panel.add(lblNewLabel);
	        lblNewLabel.setIcon(new ImageIcon(Acceso.class.getResource("/Mantenimiento/Imagenes/sommer.png")));
	        
	        JLabel lbldrBaldomeroSommer = new JLabel("");
	        lbldrBaldomeroSommer.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        lbldrBaldomeroSommer.setBounds(185, 36, 201, 14);
	        panel.add(lbldrBaldomeroSommer);
	}
	
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

	public void mostrarPanel() {
		this.ocultar();
		this.panelP.crearFrame();
		this.panelP.hacerVisible();
	}
	
	public void mostrarAcceso() {
		this.hacerVisible();
		//this.panelP.crearFrame();
		this.panelP.ocultar();
	}

	@Override
	public void ocultar() {
		this.window.frame.setVisible(false);
		
	}

	@Override
	public void crearFrame() {
		window = new Acceso();
		
	}

	@Override
	public void validarAcceso() {
		if((this.textField.getText().length()==0 && this.passwordField.getText().length()==0)||(this.textField.getText().length()==0 || this.passwordField.getText().length()==0) ) {
			JOptionPane optionPane = new JOptionPane();
			optionPane.setMessage("Los campos usuario y contraseña son obligatorios" );
			JDialog dialog = optionPane.createDialog("Error");
			dialog.setAlwaysOnTop(true);
			dialog.setVisible(true);
			this.textField.setText(null);
		}else if (this.textField.getText().length() >= 1 && this.passwordField.getText().length() <= 90 ){
			String nombre=this.textField.getText();				
			String password =this.passwordField.getText();
			this.control.validarAcceso(nombre, password);
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
}
