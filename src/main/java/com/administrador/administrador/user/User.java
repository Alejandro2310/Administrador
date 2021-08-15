package com.administrador.administrador.user;

public class User {
	
	private Integer id;
	
	private String email;
	
	private String nombre;
	
	// tiene que ser de 4 dígitos
	private Integer password;
	
	public User(String email, Integer password, String nombre) {
		super();
		this.email = email;
		this.password = password;
		this.nombre = nombre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPassword() {
		return password;
	}

	public void setPassword(Integer password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	

}
