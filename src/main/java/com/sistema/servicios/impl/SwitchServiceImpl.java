package com.sistema.servicios.impl;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.modelo.Piso;
import com.sistema.modelo.Switch;
import com.sistema.repositorios.SwitchRepository;
import com.sistema.servicios.SwitchService;

@Service
public class SwitchServiceImpl implements SwitchService {

	@Autowired
	private SwitchRepository switchRepository;

	@Override
	public Switch agregarSwitch(Switch sw) {
		// TODO Auto-generated method stub
		return switchRepository.save(sw);
	}

	@Override
	public Switch actualizarSwitch(Switch sw) {
		// TODO Auto-generated method stub
		return switchRepository.save(sw);
	}

	@Override
	public Set<Switch> obtenerSwitches() {
		// TODO Auto-generated method stub
		return new LinkedHashSet<>(switchRepository.findAll());
	}

	@Override
	public Switch obtenerSwitch(Long id_switch) {
		// TODO Auto-generated method stub
		return switchRepository.findById(id_switch).get();
	}

	@Override
	public void eliminarSwitch(Long id_switch) {
		Switch sw= new Switch();
		sw.setId_switch(id_switch);
		switchRepository.delete(sw);
		
	}

	@Override
	public List<Switch> obtenerSwitchesDelPiso(Piso piso) {
		// TODO Auto-generated method stub
		return this.switchRepository.findByPiso(piso);
	}
	
	
	
	

}
