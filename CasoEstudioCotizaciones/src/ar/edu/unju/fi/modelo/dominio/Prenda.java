package ar.edu.unju.fi.modelo.dominio;

import ar.edu.unju.fi.modelo.util.CalidadPrenda;

/**
 * Representa a una prenda que puede ser cotizada
 */
public class Prenda {
	private int codigo;
	private String nombre;
	private double precioLista;
	private int stock;
	private CalidadPrenda calidad;
	
	public Prenda() {
		// TODO Auto-generated constructor stub
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioLista() {
		return precioLista;
	}

	public void setPrecioLista(double precioLista) {
		this.precioLista = precioLista;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public CalidadPrenda getCalidad() {
		return calidad;
	}

	public void setCalidad(CalidadPrenda calidad) {
		this.calidad = calidad;
	}
	
	

}
