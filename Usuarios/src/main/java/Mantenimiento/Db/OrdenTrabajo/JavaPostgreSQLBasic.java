package Mantenimiento.Db.OrdenTrabajo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Mantenimiento.Modelo.Usuarios.Permiso;
import Mantenimiento.Modelo.Usuarios.Persona;
import Mantenimiento.Modelo.Usuarios.Rol;
import Mantenimiento.Modelo.Usuarios.Usuario;
import Mantenimiento.Modelo.Usuarios.estado;

/**
 * 
 * Conexión básica a la base de datos PostgreSQL.
 * 
 */
public class JavaPostgreSQLBasic {
	public Connection connection = null;
	public estado operacion;
	/**
	 *
	 * Establecemos la conexión con la base de datos <b>Mantenimiento</b>.
	 * 
	 */
	public void connectDatabase() {
		try {
			// Registramos el driver de PostgresSQL
			try { 
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException ex) {
				System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
			}
			// Database connect
			// Conectamos con la base de datos
			connection = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/Man",
					"postgres", "123579");

			boolean valid = connection.isValid(50000);
			System.out.println(valid ? "TEST OK" : "TEST FAIL");
		} catch (java.sql.SQLException sqle) {
			System.out.println("Error: " + sqle);
		}
	}    
	
	public estado getOperacion() {
		return operacion;
	}

	public Permiso usuariosAsignados(int idRol) {
		Permiso p= new Permiso(0,null);
		PreparedStatement consulta1;
		try {
			consulta1 = connection.prepareStatement("SELECT id, nombre FROM public.roles_asignados where id_rol="+idRol+";");
			ResultSet result1 = consulta1.executeQuery();
			if ( result1.getRow() == 0 ) { 
				return null;
			}
		} catch (SQLException e) {
			operacion=estado.ERROR;		
			return null;
		}
		operacion=estado.ACEPTADO;
		return p;
	}

	public Permiso rolAsignado(int idPermiso) {
		Permiso p= new Permiso(0,null);
		PreparedStatement consulta1;
		try {
			consulta1 = connection.prepareStatement("SELECT id, nombre FROM public.permisos_asignados where id_rol="+idPermiso+";");
			ResultSet result1 = consulta1.executeQuery();
			if ( result1.getRow() == 0 ) { 
				return null;
			}
		} catch (SQLException e) {
			operacion=estado.ERROR;		
			return null;
		}
		operacion=estado.ACEPTADO;
		return p;
	}

	public void validarUsuario(String usuario) {
		ArrayList<Permiso> p= new ArrayList<Permiso>();
		PreparedStatement consulta1;
		try {
			consulta1 = connection.prepareStatement("SELECT usuario FROM public.usuarios WHERE"+ "usuario="+usuario+");");
			ResultSet result1 = consulta1.executeQuery();
			if(result1.getRow()==0) { 
					operacion=estado.ACEPTADO;
				}else {
					operacion=estado.ERROR;
				}
				//System.out.println(sql);
			} catch (SQLException e) {
				operacion=estado.ERROR;	}
		}



	public void validarPassword(String password) {
		ArrayList<Permiso> p= new ArrayList<Permiso>();
		PreparedStatement consulta1;
		try {
			consulta1 = connection.prepareStatement("SELECT password FROM public.usuarios WHERE"+ "password="+password+");");
			ResultSet result1 = consulta1.executeQuery();
			if(result1.getRow()==0) {
					operacion=estado.ACEPTADO;
				}else {
					operacion=estado.ERROR;
				}
				//System.out.println(sql);
			} catch (SQLException e) {
				operacion=estado.ERROR;	}
		}

	
	public void validarAcceso(String usuario,String password) {
		Statement st;
		try {
			st =   connection.createStatement();
			String sql="SELECT usuario,password FROM public.usuarios WHERE"+ 
					"usuario="+usuario+"AND password="+password+");";
			st.executeUpdate(sql);
			System.out.println(sql);
		} catch (SQLException e) {
			operacion=estado.ERROR;	}
		operacion=estado.ACEPTADO;

	}

	public void AsignarRol(int id,int dni) {
		Statement st;
		try {
			st =   connection.createStatement();
			String sql="INSERT INTO public.roles_asignados(id_rol, dni)" 
					+"VALUES ("+id+","+dni+");";
			st.executeUpdate(sql);
		} catch (SQLException e) {
			operacion=estado.ERROR;		}
		operacion=estado.ACEPTADO;

	}
	
	public void desasignarRol(int dni) {
		Statement st;
		try {
			st =   connection.createStatement();
			String sql="DELETE FROM public.roles_asignados WHERE dni="+dni+");";
			st.executeUpdate(sql);
		} catch (SQLException e) {
			operacion=estado.ERROR;		}
		operacion=estado.ACEPTADO;

	}

	public  void AsignarPermisos(int idR,ArrayList<Permiso> p) {
		Statement st;
		try {
			st =   connection.createStatement();
			for(int i=0;i<p.size();i++) {
				String sql="INSERT INTO public.permisos_asignados(id_rol, dni)" 
						+"VALUES ("+idR+","+p.get(i).getId()+");";
				st.executeUpdate(sql);	
			}
			
		} catch (SQLException e) {
			operacion=estado.ERROR;		}
		operacion=estado.ACEPTADO;

	}
	
	public  void desasignarPermisos(int idR,int idP) {
		Statement st;
		try {
			st =   connection.createStatement();
			String sql="DELETE FROM public.permisos_asignados(id_rol, dni) WHERE"+ 
					idR+"AND"+idP+");";
			st.executeUpdate(sql);
		} catch (SQLException e) {
			operacion=estado.ERROR;		}
		operacion=estado.ACEPTADO;

	}

	public  void agregarPersona(Persona p) {
		Statement st;
		try {
			st =   connection.createStatement();
			String sql ="INSERT INTO public.persona(dni,nombre,apellido) "
					+ "VALUES ("+p.getDni()+",'"+ p.getNombre()+"','"+p.getApellido()+"'');";
			st.executeUpdate(sql);
		} catch (SQLException e) {
			operacion=estado.ERROR;	}
		operacion=estado.ACEPTADO;
	}
	
	public  void modificarPersona(Persona p) {
		Statement st;
		try {
			PreparedStatement consulta1 = connection.prepareStatement( "UPDATE public.usuarios SET nombre='"+p.getNombre()+"' apellido='"+p.getApellido()+"' WHERE id="+ p.getDni()+";");
			ResultSet result1 = consulta1.executeQuery();
		} catch (SQLException e) {
			operacion=estado.ERROR;		}
		operacion=estado.ACEPTADO;
	}
	
	public  void eliminarPersona(Persona p) {
			Statement st;
		try {
			st = connection.createStatement();
			String sql = "DELETE FROM public.persona WHERE dni="+p.getDni()+";";
			st.executeUpdate(sql);
		} catch (SQLException e) {
			operacion=estado.ERROR;		}
		operacion=estado.ACEPTADO;

	}
	
	
	public ArrayList<Persona> buscarPersona() {
			ArrayList<Persona> p= new ArrayList<Persona>();
			PreparedStatement consulta1;
			try {
				consulta1 = connection.prepareStatement("SELECT dni, nombre,apellido FROM public.persona;");
				ResultSet result1 = consulta1.executeQuery();
				while(result1.next()){
					// Lo que va entre comillas es el nombre del campo de tu bd
					int dni=result1.getInt("dni");
					String nombre= result1.getString("nombre");
					String apellido= result1.getString("Apellido");
					//Creas un objeto del tipo que ste estas trayendo de la bd
					Persona p1=new Persona(nombre,apellido,dni);//le mandas los parametros necesarios al constructor
					p.add(p1); //agregas ese objeto a la lista
				}
			} catch (SQLException e) {
				operacion=estado.ERROR;		
			}
			operacion=estado.ACEPTADO;
			return p;
		}

	public  void agregarUsuario(Usuario u) {
		Statement st;
		try {
			st =   connection.createStatement();
			String sql = "INSERT INTO public.usuarios(usuario,password) "
					+ "VALUES ('"+ u.getUsuario()+"','"+u.getPassword()+"');";
			st.executeUpdate(sql);
			//this.AsignarRol(u.getR().getId(), u.getDni());
		} catch (SQLException e) {
			operacion=estado.ERROR;		}
		operacion=estado.ACEPTADO;

	}

	public void modificarUsuario(Usuario u) {
		try {
			PreparedStatement consulta1 = connection.prepareStatement( "UPDATE public.usuarios SET  password='"+u.getPassword()+"' WHERE id="+ u.getUsuario()+";");
			ResultSet result1 = consulta1.executeQuery();
		} catch (SQLException e) {
			operacion=estado.ERROR;		}
		operacion=estado.ACEPTADO;

	}

	public void eliminarUsuario(Usuario u) {
		Statement st;
		try {
			st = connection.createStatement();
			String sql = "DELETE FROM public.usuarios WHERE dni="+u.getUsuario()+";";
			st.executeUpdate(sql);
		} catch (SQLException e) {
			operacion=estado.ERROR;		}
		operacion=estado.ACEPTADO;

	}

	public ArrayList<Usuario> buscarUsuarios(){
		ArrayList<Usuario> p= new ArrayList<Usuario>();
/*		PreparedStatement consulta1;
		try {
			consulta1 = connection.prepareStatement("SELECT dni, nombre,apellido,password FROM public.usuarios;");
			ResultSet result1 = consulta1.executeQuery();
			while(result1.next()){
				// Lo que va entre comillas es el nombre del campo de tu bd
				int dni=result1.getInt("dni");
				String nombre= result1.getString("nombre");
				String apellido= result1.getString("Apellido");
				String password=result1.getString("password");
				//Creas un objeto del tipo que ste estas trayendo de la bd
				Usuario u1=new Usuario(nombre,apellido,dni,password);//le mandas los parametros necesarios al constructor
				p.add(u1); //agregas ese objeto a la lista
			}
		} catch (SQLException e) {
			operacion=estado.ERROR;		
			return null;
		}
		operacion=estado.ACEPTADO;*/
		return p;
	}

	public  void agregarRol(Rol u) {
		// public void agregarRol() {
		Statement st;
		try {
			st =   connection.createStatement();
			String sql = "INSERT INTO public.roles(nombre) "
					+ "VALUES ("+u.getNombre()+"');";
			st.executeUpdate(sql);
			this.AsignarPermisos(u.getId(), u.getPermisos());
		} catch (SQLException e) {
			operacion=estado.ERROR;		}
		operacion=estado.ACEPTADO;

	}


	public  void modificarRoles(Rol u) {
		Statement st;
		try {
			//UPDATE public.permisos SET nombre=u.getNombre(); WHERE u.getId();
			PreparedStatement consulta1 = connection.prepareStatement( "UPDATE public.roles SET nombre='"+u.getNombre()+"' WHERE id="+ u.getNombre()+";");
			ResultSet result1 = consulta1.executeQuery();
		} catch (SQLException e) {
			operacion=estado.ERROR;		}
		operacion=estado.ACEPTADO;

	}

	public  void eliminarRoles(Rol u) {
		Statement st;
		try {
			st =   connection.createStatement();
			String sql = "DELETE FROM public.roles WHERE nombre='"+u.getNombre()+"';";
			st.executeUpdate(sql);
		} catch (SQLException e) {
			operacion=estado.ERROR;		}
		operacion=estado.ACEPTADO;

	}


	public ArrayList<Rol> buscarRoles(){
		ArrayList<Rol> p= new ArrayList<Rol>();
		PreparedStatement consulta1;
		try {
			consulta1 = connection.prepareStatement("SELECT id, nombre, descripcion FROM public.roles;");
			ResultSet result1 = consulta1.executeQuery();
			while(result1.next()){
				result1.toString();
				int id=result1.getInt("id");
				String nombre= result1.getString("nombre");
				String descripcion= result1.getString("descripcion");
				System.out.println("id="+id+"nombre"+nombre+"descripcion="+descripcion);
				Rol p1=new Rol(nombre,descripcion);
				p.add(p1);
			}
		} catch (SQLException e) {
			operacion=estado.ERROR;		
			return null;
		}
		operacion=estado.ACEPTADO;
		return p;
	}

	public  void agregarPermiso(Permiso p) {
		// public void agregarRol() {
		Statement st;
		try {
			st =   connection.createStatement();
			String sql = "INSERT INTO public.permisos(nombre) VALUES ('"+ p.getNombre()+"');";
			st.executeUpdate(sql);
		} catch (SQLException e) {
			operacion=estado.ERROR;		}
		operacion=estado.ACEPTADO;

	}


	public  void modificarPermiso(Permiso u) {
		// public void agregarRol() {
		Statement st;
		try {
			//UPDATE public.permisos SET nombre=u.getNombre(); WHERE u.getId();
			PreparedStatement consulta1 = connection.prepareStatement( "UPDATE public.permisos SET nombre='"+u.getNombre()+"' WHERE id="+ u.getId()+";");
			ResultSet result1 = consulta1.executeQuery();
		} catch (SQLException e) {
			operacion=estado.ERROR;		}
		operacion=estado.ACEPTADO;

	}

	public  void eliminarPermiso(Permiso u) {
		Statement st;
		try {
			st =   connection.createStatement();
			String sql = "DELETE FROM public.permisos WHERE id="+u.getId()+";";
			st.executeUpdate(sql);
		} catch (SQLException e) {
			operacion=estado.ERROR;		}
		operacion=estado.ACEPTADO;

	}



	public ArrayList<Permiso> buscarPermisos(){
		ArrayList<Permiso> p= new ArrayList<Permiso>();
		PreparedStatement consulta1;
		try {
			consulta1 = connection.prepareStatement("SELECT id, nombre FROM public.permisos;");
			ResultSet result1 = consulta1.executeQuery();
			while(result1.next()){
				int id= result1.getInt("id");
				String nombre= result1.getString("nombre");
				System.out.println("Nombre permiso"+nombre+"id permiso"+id);
				Permiso p1=new Permiso(id,nombre);
				p.add(p1);
			}
		} catch (SQLException e) {
			operacion=estado.ERROR;		
			return null;
		}
		operacion=estado.ACEPTADO;
		return p;
	}
	
}