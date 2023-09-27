package ar.edu.unju.fi.modelo.dominio;

import java.time.LocalDateTime;

/**
 * @author Ariel A Vega
 * Contiene la información y operaciones necesarias para realizar cotizaciones
 * de prendas
 */
public class Cotizacion {
	private int nroIdentificacion;
	private LocalDateTime fechaHora;
	private Vendedor vendedor;
	private Prenda prendaCotizada;
	private int cantUnidadesCotizadas;
	private double totalCotizacion;
	private double precioCotizadoUnidad;
	
	public Cotizacion() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * Permite generar el valor para el atributo totalCotizcion
	 * Importante: Debe estar previamente seteado el valor de precioCotizadoUnidad
	 */
	public void generarTotalCotizacion() {
		this.totalCotizacion = this.cantUnidadesCotizadas * this.precioCotizadoUnidad;
	}
	
	public int getNroIdentificacion() {
		return nroIdentificacion;
	}

	public void setNroIdentificacion(int nroIdentificacion) {
		this.nroIdentificacion = nroIdentificacion;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Prenda getPrendaCotizada() {
		return prendaCotizada;
	}

	public void setPrendaCotizada(Prenda prendaCotizada) {
		this.prendaCotizada = prendaCotizada;
	}

	public double getTotalCotizacion() {
		return totalCotizacion;
	}

	public void setTotalCotizacion(double totalCotizacion) {
		this.totalCotizacion = totalCotizacion;
	}

	public double getPrecioCotizadoUnidad() {
		return precioCotizadoUnidad;
	}

	public void setPrecioCotizadoUnidad(double precioCotizadoUnidad) {
		this.precioCotizadoUnidad = precioCotizadoUnidad;
	}


	public int getCantUnidadesCotizadas() {
		return cantUnidadesCotizadas;
	}


	public void setCantUnidadesCotizadas(int cantUnidadesCotizadas) {
		this.cantUnidadesCotizadas = cantUnidadesCotizadas;
	}
	
	
}
