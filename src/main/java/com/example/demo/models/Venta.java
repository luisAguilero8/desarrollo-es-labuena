package com.example.demo.models;

public class Venta {
	private String idVenta;
	private String idUsuario;
	private String fecha;
	private String subTotal;
	private String iva;
	private String costoEnvio;
	private String total;
	
	
	public String getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(String idVenta) {
		this.idVenta = idVenta;
	}
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(String subTotal) {
		this.subTotal = subTotal;
	}
	public String getIva() {
		return iva;
	}
	public void setIva(String iva) {
		this.iva = iva;
	}
	public String getCostoEnvio() {
		return costoEnvio;
	}
	public void setCostoEnvio(String costoEnvio) {
		this.costoEnvio = costoEnvio;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	
	public Venta(String idVenta, String idUsuario, String fecha, String subTotal, String iva, String costoEnvio,
			String total) {
		super();
		this.idVenta = idVenta;
		this.idUsuario = idUsuario;
		this.fecha = fecha;
		this.subTotal = subTotal;
		this.iva = iva;
		this.costoEnvio = costoEnvio;
		this.total = total;
	}
}
 
