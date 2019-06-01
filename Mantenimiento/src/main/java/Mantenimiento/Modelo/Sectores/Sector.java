package Mantenimiento.Modelo.Sectores;


/**
 * @author Pato-PC
 * @version 1.0
 * @created 29-may.-2019 19:51:57
 */
public class Sector {

	private String email;
	public int idSector;
	private String nombre;
	private String responsable;
	private String telefono;


	
	public Sector(int idSector, String nombre) {
		super();
		this.idSector = idSector;
		this.nombre = nombre;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getIdSector() {
		return idSector;
	}



	public void setIdSector(int idSector) {
		this.idSector = idSector;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getResponsable() {
		return responsable;
	}



	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public Sector(){

	}



	/**
	 * 
	 * @param nombre
	 * @param responsable
	 * @param email
	 * @param telefono
	 * @param tipo
	 */
	public void altaSector(String nombre, String responsable, String email, String telefono, String tipo){

	}

	/**
	 * 
	 * @param sector
	 */
	public void bajaSector(Sector sector){

	}

	/**
	 * 
	 * @param sector
	 */
	public void modificarSector(Sector sector){

	}

}