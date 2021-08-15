package com.administrador.administrador.seguros;

import java.util.Date;

import com.administrador.administrador.seguros.enums.CategoriaSeguro;

public class Insurance extends InsuranceSummary {
	
	private Integer userId;
	
	private String periodicidad;
	
	private Integer idAseguradora;
	
	private Long telefonoAseguradora;
	
	private String detalle;
	
	private Date finCobertura;
	

	
	public Insurance(String nombreAseguradora, CategoriaSeguro categoriaSeguro, Float cantidadSeguro, Integer userId,
			String periodicidad, Integer idAseguradora, Long telefonoAseguradora, String detalle, Date finCobertura) {
		super(nombreAseguradora, categoriaSeguro, cantidadSeguro);
		this.userId = userId;
		this.periodicidad = periodicidad;
		this.idAseguradora = idAseguradora;
		this.telefonoAseguradora = telefonoAseguradora;
		this.detalle = detalle;
		this.finCobertura = finCobertura;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getPeriodicidad() {
		return periodicidad;
	}

	public void setPeriodicidad(String periodicidad) {
		this.periodicidad = periodicidad;
	}

	public Integer getIdAseguradora() {
		return idAseguradora;
	}

	public void setIdAseguradora(Integer idAseguradora) {
		this.idAseguradora = idAseguradora;
	}

	public Long getTelefonoAseguradora() {
		return telefonoAseguradora;
	}

	public void setTelefonoAseguradora(Long telefonoAseguradora) {
		this.telefonoAseguradora = telefonoAseguradora;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Date getFinCobertura() {
		return finCobertura;
	}

	public void setFinCobertura(Date finCobertura) {
		this.finCobertura = finCobertura;
	}


}
