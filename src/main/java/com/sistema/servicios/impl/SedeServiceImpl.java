package com.sistema.servicios.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.modelo.Sede;
import com.sistema.repositorios.SedeRepository;
import com.sistema.servicios.SedeService;

@Service
public class SedeServiceImpl implements SedeService {
	
	@Autowired
	private SedeRepository sedeRepository;

	@Override
	public Sede agregarSede(Sede sede) {
		return sedeRepository.save(sede);
	}

	@Override
	public Sede actualizarSede(Sede sede) {
		
		return sedeRepository.save(sede);
	}

	@Override
	public Set<Sede> obtenerSedes() {
		
		return new LinkedHashSet<>(sedeRepository.findAll());
	}

	@Override
	public Sede obtenerSede(Long id_sede) {		
		return sedeRepository.findById(id_sede).get();
	}

	@Override
	public void eliminarSede(Long id_sede) {
		Sede sede = new Sede();
		sede.setId_sede(id_sede);
		sedeRepository.delete(sede);
		
	}

}
