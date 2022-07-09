package com.r2g.persona.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="persona")
public class Persona implements Serializable {
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
	
}
