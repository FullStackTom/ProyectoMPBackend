package com.sistema.modelo;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="sedes")
public class Sede {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_sede;
	private String nom_sede;
	private String direccion;
	private String descripcion;
	private String imagen;
	
	@OneToMany(mappedBy = "sede",cascade = CascadeType.ALL)
    @JsonIgnore
	private Set<Piso> pisos = new LinkedHashSet<>();

	public Sede() {
		super();
	}

	public Long getId_sede() {
		return id_sede;
	}

	public void setId_sede(Long id_sede) {
		this.id_sede = id_sede;
	}

	public String getNom_sede() {
		return nom_sede;
	}

	public void setNom_sede(String nom_sede) {
		this.nom_sede = nom_sede;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Set<Piso> getPisos() {
		return pisos;
	}

	public void setPisos(Set<Piso> pisos) {
		this.pisos = pisos;
	}

	
	

}
