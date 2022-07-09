package com.r2g.persona.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class Persona {
	@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nombre;
	private String apellidos;
	private int edad;
	
	@ManyToOne
	@JoinColumn(name="id_pais")
	private Pais pais;
	@ManyToOne
	@JoinColumn(name="id_estado")
	private Estado estado;
		
	public Persona() {
		
	}
	
	public Persona(String nombre, String apellidos, int edad, Pais pais, Estado estado) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.pais = pais;
		this.estado = estado;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
}
