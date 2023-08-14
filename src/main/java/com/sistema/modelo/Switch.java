package com.sistema.modelo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="switches")
public class Switch {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_switch;
	private String marca;
	private String modelo;
	private String ip_switch;
	private String serie;
	private String version;
	private String cant_puertos;
	private String poe;
	private String mac;
	private String sede;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Piso piso;

	public Switch() {
		super();
	}

	public Long getId_switch() {
		return id_switch;
	}

	public void setId_switch(Long id_switch) {
		this.id_switch = id_switch;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getIp_switch() {
		return ip_switch;
	}

	public void setIp_switch(String ip_switch) {
		this.ip_switch = ip_switch;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getCant_puertos() {
		return cant_puertos;
	}

	public void setCant_puertos(String cant_puertos) {
		this.cant_puertos = cant_puertos;
	}

	public String getPoe() {
		return poe;
	}

	public void setPoe(String poe) {
		this.poe = poe;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public Piso getPiso() {
		return piso;
	}

	public void setPiso(Piso piso) {
		this.piso = piso;
	}

	
	

}
