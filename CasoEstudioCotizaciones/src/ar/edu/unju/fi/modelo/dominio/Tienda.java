package ar.edu.unju.fi.modelo.dominio;

import java.util.List;

public class Tienda {
	private String nombre;
	private String direccion;
	private List<Vendedor> vendedores;
	private List<Prenda> catalogo;
	
	public Tienda() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Vendedor> getVendedores() {
		return vendedores;
	}

	public void setVendedores(List<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}

	public List<Prenda> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(List<Prenda> catalogo) {
		this.catalogo = catalogo;
	}
	
	
}
