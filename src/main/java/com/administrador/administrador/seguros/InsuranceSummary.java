package com.administrador.administrador.seguros;

import com.administrador.administrador.seguros.enums.CategoriaSeguro;

public class InsuranceSummary {
	
	private Integer id;
	
	private String nombreAseguradora;
	
	private CategoriaSeguro categoriaSeguro;
	
	private Float cantidadSeguro;

	public InsuranceSummary(String nombreAseguradora, CategoriaSeguro categoriaSeguro, Float cantidadSeguro) {
		super();
		this.nombreAseguradora = nombreAseguradora;
		this.categoriaSeguro = categoriaSeguro;
		this.cantidadSeguro = cantidadSeguro;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreAseguradora() {
		return nombreAseguradora;
	}

	public void setNombreAseguradora(String nombreAseguradora) {
		this.nombreAseguradora = nombreAseguradora;
	}

	public CategoriaSeguro getCategoriaSeguro() {
		return categoriaSeguro;
	}

	public void setCategoriaSeguro(CategoriaSeguro categoriaSeguro) {
		this.categoriaSeguro = categoriaSeguro;
	}

	public Float getCantidadSeguro() {
		return cantidadSeguro;
	}

	public void setCantidadSeguro(Float cantidadSeguro) {
		this.cantidadSeguro = cantidadSeguro;
	}

}
