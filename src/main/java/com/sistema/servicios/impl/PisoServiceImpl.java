package com.sistema.servicios.impl;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.modelo.Piso;
import com.sistema.modelo.Sede;
import com.sistema.repositorios.PisoRepository;
import com.sistema.servicios.PisoService;

@Service
public class PisoServiceImpl implements PisoService {

	@Autowired
	private PisoRepository pisoRepository;
	
	
	@Override
	public Piso agregarPiso(Piso piso) {
		
		return pisoRepository.save(piso);
	}

	@Override
	public Piso actualizarPiso(Piso piso) {
		
		return pisoRepository.save(piso);
	}

	@Override
	public Set<Piso> obtenerPisos() {
		
		return new LinkedHashSet<>(pisoRepository.findAll());
	}

	@Override
	public Piso obtenerPiso(Long id_piso) {
		
		return pisoRepository.findById(id_piso).get();
	}

	@Override
	public void eliminarPiso(Long id_piso) {
		Piso piso = new Piso();
		piso.setId_piso(id_piso);
		pisoRepository.delete(piso);
		
	}

	@Override
	public List<Piso> listarPisosDeUnaSede(Sede sede) {
		
		return this.pisoRepository.findBySede(sede);
	}

}
