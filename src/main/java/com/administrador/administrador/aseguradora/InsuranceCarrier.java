package com.administrador.administrador.aseguradora;

import java.util.ArrayList;
import java.util.List;

import com.administrador.administrador.seguros.enums.CategoriaSeguro;

public class InsuranceCarrier {
	
	private Integer id;
	
	private String nombre;
	
	private List<CategoriaSeguro> asd = new ArrayList<>();
	
	private Integer tlf;

	public InsuranceCarrier(Integer id, String nombre, List<CategoriaSeguro> asd, Integer tlf) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.asd = asd;
		this.tlf = tlf;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<CategoriaSeguro> getAsd() {
		return asd;
	}

	public void setAsd(List<CategoriaSeguro> asd) {
		this.asd = asd;
	}

	public Integer getTlf() {
		return tlf;
	}

	public void setTlf(Integer tlf) {
		this.tlf = tlf;
	}

}
