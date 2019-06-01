package Mantenimiento.vista.Pedidos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;

import Mantenimiento.Controlador.ControladorPedidos;
import Mantenimiento.Controlador.controladorUsuarios;
import Mantenimiento.Modelo.Pedido.Pedido;
import Mantenimiento.vista.Usuarios.VistaUsuarios;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class AdmPedidos {
	AdmPedidos window;
	DefaultTableModel modelo= new DefaultTableModel(); 
	private ControladorPedidos control=new ControladorPedidos();
	private AltaPedido ap=new AltaPedido();
	private ModificarPedido mp= new ModificarPedido();
	private VisualizarPedido vp=new VisualizarPedido();
	private JFrame frame;
	private JTable table;
	private JTextField textField;
	private int indiceFilaSeleccionada;
	private Object os[];
	ArrayList<Pedido> lista= new  ArrayList<Pedido>();
	
	 //* Launch the application.
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdmPedidos window = new AdmPedidos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

//	 * Create the application.
	public AdmPedidos() {
		initialize();

	}

	 //* Initialize the contents of the frame.
	 
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Gestión de Pedidos");
		frame.setBounds(100, 100, 741, 462);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnNewButton = new JButton("Alta Pedido");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarAlta();
			}
		});
		
		JButton btnNewButton_1 = new JButton("Ver Pedidos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionVer();
			}
		});
		
		JButton btnNewButton_2 = new JButton("Modificar Pedido");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionModificar();
			}
		});
		
		ap.btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				seleccionAltaCrear();
			}
		});
		
		ap.btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ap.ocultar();
				hacerVisible();
			}
		});
		
		JButton btnNewButton_3 = new JButton("Emitir Pedido");
		
		JLabel lblFiltrar = new JLabel("Filtrar  Pedidos por:");
		
		JComboBox comboBox = new JComboBox();
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnFiltrar = new JButton("Filtrar");
		btnFiltrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				control.RecuperarListaPedido("id");
			}
		});
		
		JButton btnSalir = new JButton("Salir");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addGap(80)
							.addComponent(lblFiltrar, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnFiltrar))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(39)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
								.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
								.addGroup(gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
								.addComponent(btnNewButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(18)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 497, GroupLayout.PREFERRED_SIZE)
							.addGap(14)))
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(595, Short.MAX_VALUE)
					.addComponent(btnSalir)
					.addGap(19))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFiltrar)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnFiltrar)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(65)
							.addComponent(btnNewButton)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNewButton_1)
							.addGap(18)
							.addComponent(btnNewButton_2)
							.addGap(18)
							.addComponent(btnNewButton_3)
							.addGap(27))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
							.addGap(30)))
					.addComponent(btnSalir)
					.addContainerGap(28, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

		    //El método valueChange se debe sobreescribir obligatoriamente. 
		    //Se ejecuta automáticamente cada vez que se hace una nueva selección. 
		    @Override 
		    public void valueChanged(ListSelectionEvent e) { 
		        //Obtener el número de filas seleccionadas 
		        int cuentaFilasSeleccionadas = table.getSelectedRowCount(); 
		    //    System.out.println("Hay seleccionadas: " + cuentaFilasSeleccionadas + " filas");

		        if (cuentaFilasSeleccionadas == 1) { 
		            //Sólo hay una fila seleccionada 
		            indiceFilaSeleccionada = table.getSelectedRow(); 
		     //       System.out.println("Fila seleccionada: " + indiceFilaSeleccionada);
		        } else {
		        	indiceFilaSeleccionada=-1;
		            //Hay varias filas seleccionadas 
		        } 
		    }

		});
		
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
		this.cargarTitulosColumas();
		mostrarPedidos(lista);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null,null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"N\u00B0 Pedido", "Sector", "Fecha Inicio", "Tarea Asignada", "Estado"
			}
		));
		scrollPane.setViewportView(table);
		panel.setLayout(gl_panel);
	
	}
	
	
	
	public void cargarTitulosColumas(){
		modelo = new DefaultTableModel(); 
		this.modelo.addTableModelListener(table);
		modelo.addColumn("N° Pedido");
		modelo.addColumn("Sector");
		modelo.addColumn("Fecha Inicio");
		modelo.addColumn("Tareas Asignadas");
		modelo.addColumn("Estado");
		modelo.addRow(new Vector());
		
        this.table.setModel(modelo);
    } 

	
	@SuppressWarnings("unchecked")
	public void mostrarPedidos(ArrayList<Pedido> pedidos) {
		modelo = new DefaultTableModel(); 
		this.modelo.addTableModelListener(table);
		modelo.addColumn("N° Pedido");
		modelo.addColumn("Sector");
		modelo.addColumn("Fecha Inicio");
		modelo.addColumn("Tareas Asignadas");
		modelo.addColumn("Estado");
		String [] os= new String[5];
		 for (int i = 0; i< pedidos.size(); i++) {
			 Pedido getP = (Pedido) pedidos.get(i);
			 Vector v= new Vector();
			 v.insertElementAt(getP.getIdPedido(), 0);
			 v.insertElementAt(getP.getSector().getNombre(), 1);
			 v.insertElementAt(getP.getFechaInicio(), 2);
			 v.insertElementAt(getP.m_Tareas.size(), 3);
			 v.insertElementAt(getP.getEstado().getDescripcion(), 4);
		 modelo.addRow(v);
		 this.modelo.fireTableCellUpdated(i, 0);
		 this.modelo.fireTableCellUpdated(i, 1);
		 this.modelo.fireTableCellUpdated(i, 2);
		 this.modelo.fireTableCellUpdated(i, 3);
		 this.modelo.fireTableCellUpdated(i, 4);
		 }
		// this.table.action(TableModelEvent.UPDATE, modelo);
		// this.modelo.newRowsAdded(TableModelEvent.UPDATE);
//		 this.modelo.fireTableDataChanged();
	//	 this.modelo.fireTableCellUpdated(i, 0);
		this.table.setModel(modelo);
		
	}
	
	public void mostrarMensaje(String mensaje) {
		JOptionPane optionPane = new JOptionPane();
		optionPane.setMessage(mensaje);
		JDialog dialog = optionPane.createDialog(mensaje);
		dialog.setAlwaysOnTop(true);
		dialog.setVisible(true);
		dialog.setModal(true);
		
	}

	public void seleccionAlta() {

	}


	public void seleccionAltaCrear() {
		//this.ap.textField_2;
		//this.ap.textField_1;
		//this.ap.textField;
		//this.ap.textPane;
	}

	public void seleccionAltaInsumos() {

	}

	public void seleccionAltaSalir() {

	}

	public void seleccionAltaAgregarTareas() {

	}

	public void seleccionAltaQuitarTareas() {

	}

	public void seleccionAltaNuevaTareas() {

	}

	public void seleccionVisualizarSalir() {

	}


	public void seleccionModificarGuardar() {

	}


	public void seleccionModificarSalir() {

	}

	public void seleccionModificarAgregarTareas() {

	}

	public void seleccionModificarQuitarTareas() {

	}

	public void seleccionModificarModificarTareas() {

	}

	public void seleccionVer() {
		if(this.indiceFilaSeleccionada>0) {
			DefaultTableModel modelo = (DefaultTableModel) table.getModel();
			//this.control.RecuperarPedido("id", (String) modelo.getValueAt(this.indiceFilaSeleccionada,0));
			this.control.RecuperarPedido("id", "2341");

		}else {
			this.mostrarMensaje("Ningun Pedido fue seleccionado");
		}

	}


	public void seleccionModificar() {
		if(this.indiceFilaSeleccionada>0) {
			DefaultTableModel modelo = (DefaultTableModel) table.getModel();
		//	this.control.RecuperarPedido("id", (String) modelo.getValueAt(this.indiceFilaSeleccionada,0));
			this.control.RecuperarPedido("id", "2341");
		}else {
			this.mostrarMensaje("Ningun Pedido fue seleccionado");
		}

	}

	public void seleccionFiltrar() {

	}

	public void seleccionSalir() {

	}

	public void mostrarModificar(Pedido p) {
		mp.textField.setText(String.valueOf(p.getIdPedido()) );
		mp.textPane.setText(p.getDescripcion());
		
		mp.crearFrame();
		mp.hacerVisible();
		this.ocultar();
	}



	public void mostrarVisualizar() {
		vp.crearFrame();
		vp.hacerVisible();
		this.ocultar();
	}

	public void mostrarAlta() {
		ap.crearFrame();
		ap.hacerVisible();
		this.ocultar();
	}

	public void crearFrame() {
		
		window = new AdmPedidos();

	}


	public void hacerVisible() {

		window.frame.setVisible(true);

	}



	public void ocultar() {
		this.window.frame.setVisible(false);

	}


}
