package ar.edu.unju.fi.modelo.dominio;

import java.util.List;

/**
 * Es la persona que utiliza la aplicación
 */
public class Vendedor {
	private int codigo;
	private String apellidos;
	private String nombres;
	private Usuario usuario; 
	private List<Cotizacion> historialCotizaciones;
	
	public Vendedor() {
		// TODO Auto-generated constructor stub
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Cotizacion> getHistorialCotizaciones() {
		return historialCotizaciones;
	}

	public void setHistorialCotizaciones(List<Cotizacion> historialCotizaciones) {
		this.historialCotizaciones = historialCotizaciones;
	}
	
	

}
