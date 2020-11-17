package com.example.demo.models;

public class Computadora {
	private String noSerie;
	private String marca;
	private String procesador;
	private String Sistema_Operativo;
	private String RAM;
	private String Nucleos;
	
	public String getNoSerie() {
		return noSerie;
	}
	public void setNoSerie(String noSerie) {
		this.noSerie = noSerie;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public String getSistema_Operativo() {
		return Sistema_Operativo;
	}
	public void setSistema_Operativo(String sistema_Operativo) {
		Sistema_Operativo = sistema_Operativo;
	}
	public String getRAM() {
		return RAM;
	}
	public void setRAM(String rAM) {
		RAM = rAM;
	}
	public String getNucleos() {
		return Nucleos;
	}
	public void setNucleos(String nucleos) {
		Nucleos = nucleos;
	}
	public Computadora(String noSerie, String marca, String procesador, String sistema_Operativo, String rAM,
			String nucleos) {
		super();
		this.noSerie = noSerie;
		this.marca = marca;
		this.procesador = procesador;
		this.Sistema_Operativo = sistema_Operativo;
		this.RAM = rAM;
		this.Nucleos = nucleos;
	}
}
