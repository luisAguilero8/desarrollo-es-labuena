package com.example.demo.models;

public class Ticket {
	private String idTicket;
	private String idVenta;
	private String noSerie;
	private String cantidad;
	private String precio;
	
	
	public String getIdTicket() {
		return idTicket;
	}
	public void setIdTicket(String idTicket) {
		this.idTicket = idTicket;
	}
	public String getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(String idVenta) {
		this.idVenta = idVenta;
	}
	public String getNoSerie() {
		return noSerie;
	}
	public void setNoSerie(String noSerie) {
		this.noSerie = noSerie;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	
	
	public Ticket(String idTicket, String idVenta, String noSerie, String cantidad, String precio) {
		super();
		this.idTicket = idTicket;
		this.idVenta = idVenta;
		this.noSerie = noSerie;
		this.cantidad = cantidad;
		this.precio = precio;
	}
}
