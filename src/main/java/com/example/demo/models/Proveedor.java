package com.example.demo.models;

public class Proveedor {
	private String idProveedor;
	private String nombreCompania;
	private String nombreContacto;
	private String email;
	private String rfc;
	private String telefono;
	private String direccion;
	
	
	public String getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(String idProveedor) {
		this.idProveedor = idProveedor;
	}
	public String getNombreCompania() {
		return nombreCompania;
	}
	public void setNombreCompania(String nombreCompania) {
		this.nombreCompania = nombreCompania;
	}
	public String getNombreContacto() {
		return nombreContacto;
	}
	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public Proveedor(String idProveedor, String nombreCompania, String nombreContacto, String email, String rfc,
			String telefono, String direccion) {
		super();
		this.idProveedor = idProveedor;
		this.nombreCompania = nombreCompania;
		this.nombreContacto = nombreContacto;
		this.email = email;
		this.rfc = rfc;
		this.telefono = telefono;
		this.direccion = direccion;
	}
}
