package ar.edu.unju.fi.modelo.dominio;

/**
 * @author Ariel A. Vega
 * Representa el usaurio con el cual el vendedor se conecta a la aplicacion
 */
public class Usuario {
	private String nombre;
	private String password;
	
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Usuario(String nombre, String password) {
		super();
		this.nombre = nombre;
		this.password = password;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
