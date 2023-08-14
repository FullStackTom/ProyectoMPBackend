package com.sistema.modelo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="pisos")
public class Piso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_piso;
	private String nom_piso;	
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Sede sede;
	
	@OneToMany(mappedBy = "piso",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore
	private Set<Switch>switches=new HashSet<>();

	public Piso() {
		super();
	}

	public Long getId_piso() {
		return id_piso;
	}

	public void setId_piso(Long id_piso) {
		this.id_piso = id_piso;
	}

	public String getNom_piso() {
		return nom_piso;
	}

	public void setNom_piso(String nom_piso) {
		this.nom_piso = nom_piso;
	}


	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	public Set<Switch> getSwitches() {
		return switches;
	}

	public void setSwitches(Set<Switch> switches) {
		this.switches = switches;
	}

	
	
	
}
