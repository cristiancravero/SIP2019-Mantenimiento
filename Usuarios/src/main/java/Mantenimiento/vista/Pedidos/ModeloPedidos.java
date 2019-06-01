package Mantenimiento.vista.Pedidos;

import java.util.Date;
import java.util.LinkedList;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import Mantenimiento.Modelo.Pedido.Estado;
import Mantenimiento.Modelo.Pedido.Pedido;
import Mantenimiento.Modelo.Sectores.Sector;

public class ModeloPedidos implements TableModel{
	private LinkedList suscriptores = new LinkedList(); 
	 private LinkedList datos = new LinkedList();
	
		
		@Override
		public void removeTableModelListener(TableModelListener arg0) {
			suscriptores.remove(arg0);  
			
		}
		@Override
		public void addTableModelListener(TableModelListener l) {
			suscriptores.add (l);
		}
		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return 5;
		}
		@Override
		public String getColumnName(int columnIndex) {
			 switch (columnIndex)
		        {
		            case 0:
		                return "N° Pedido";
		            case 1:
		                return "Sector";
		            case 2:
		                return "Fecha Inicio";
		            case 3:
		                return "Tarea Asignada";
		            case 4:
		                return "Estado";
		            default:
		                return null;
		        }
		    }
		
		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return datos.size();
		}
		@Override
		public boolean isCellEditable(int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public Class<?> getColumnClass(int columnIndex) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public Object getValueAt(int fila, int columna) {
			        // Obtenemos la persona de la fila indicada 
			Pedido aux = (Pedido)datos.get (fila);          
			        switch (columna) {
			        // Nos pasan el Id. 
			           case 0:    
			        	   return aux.getIdPedido();			           
			           // Nos pasan el Sector. 
			           case 1:             
			        	   return aux.Sector.getNombre();			              			               
			           // Nos pasan la edad. 
			           case 2:                        
			        	   return aux.getFechaInicio();			            			       
			           case 3:   
			        	   return aux.getCantTareas();			              			                  
			           case 4:    
			        	   return aux.getEstado().getDescripcion();			            
			        }
			        return null;
			         }
			        
		
		@Override
		public void setValueAt(Object dato, int fila, int columna) {
			// Obtenemos la persona de la fila indicada 
			Pedido aux = (Pedido)datos.get (fila);       
	        switch (columna) {
	           // Nos pasan el Id. 
	           case 0:                                                      
	               aux.setIdPedido((int) dato);
	               break;
	           // Nos pasan el Sector. 
	           case 1:                                                       
	               aux.setSector((Sector) dato);
	               break;
	           // Nos pasan la edad. 
	           case 2:                                                       
	               aux.setFechaInicio((Date) dato);
	               break;
	           case 3:                                                       
	               aux.setCantTareas((int) dato);
	               break;     
	           case 4:                                                       
	               aux.setEstado((Estado) dato);
	               break;         
	        }
	        TableModelEvent evento = new TableModelEvent (this, fila, fila, columna);
	        for (int i=0; i<suscriptores.size(); i++)
	            ((TableModelListener)suscriptores.get(i)).tableChanged(evento);
		}
		
		public void addPedido (Pedido nuevoPedido) { 
		    // Añade la persona al modelo 
		    datos.add (nuevoPedido); 

		    // Avisa a los suscriptores creando un TableModelEvent... 
		    TableModelEvent evento; evento = new TableModelEvent (
		        this, this.getRowCount()-1, this.getRowCount()-1, 
		        TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT); 

		    // ... y avisando a los suscriptores
		    int i;

		    for (i=0; i<suscriptores.size(); i++)
		        ((TableModelListener)suscriptores.get(i)).tableChanged(evento);
		}
		
		public void borraPedido (int fila) {
		    // Se borra la fila datos.remove(fila);

		    // Y se avisa a los suscriptores, creando un TableModelEvent... 
		    TableModelEvent evento = new TableModelEvent (this, fila, fila, 
		        TableModelEvent.ALL_COLUMNS, TableModelEvent.DELETE); 

		    // ... y pasándoselo a los suscriptores
		    int i;

		    for (i=0; i<suscriptores.size(); i++)
		        ((TableModelListener)suscriptores.get(i)).tableChanged(evento);
		}
}

