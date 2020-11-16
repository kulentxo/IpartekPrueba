package com.ipartek.pojo;

public class Perro {

	private int id;
	private String nombre;
	private String raza;
	private float peso;
	private boolean isVacunado;
	private String historia;

	public Perro() {
		super();
		this.id = 0;
		this.nombre = "";
		this.raza = "cruce";
		this.peso = 0f;
		this.isVacunado = false;
		this.historia = "Erase una vez...";
	}

	public Perro(int id, boolean isVacunado) {
		super();
		this.id = id;
		this.isVacunado = isVacunado;
	}

	public Perro(String nombre, String raza, float peso, String historia) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.historia = historia;
		this.peso = peso;
	}

	public Perro(int id, String nombre, String raza) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.raza = raza;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		if (peso < 0) {
			peso = 0;
		} else {
			this.peso = peso;
		}

	}

	public boolean isVacunado() {
		return isVacunado;
	}

	public void setVacunado(boolean isVacunado) {
		this.isVacunado = isVacunado;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	@Override
	public String toString() {
		return "Perro [id=" + id + ", nombre=" + nombre + ", raza=" + raza + ", peso=" + peso + ", isVacunado="
				+ isVacunado + ", historia=" + historia + "]";
	}

}
