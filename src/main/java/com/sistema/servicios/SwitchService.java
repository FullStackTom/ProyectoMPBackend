package com.sistema.servicios;

import java.util.List;
import java.util.Set;

import com.sistema.modelo.Piso;
import com.sistema.modelo.Switch;

public interface SwitchService {
	
	Switch agregarSwitch(Switch sw);
	Switch actualizarSwitch(Switch sw);
	Set<Switch> obtenerSwitches();
	Switch obtenerSwitch(Long id_switch);	
	void eliminarSwitch(Long id_switch);
	

	List<Switch> obtenerSwitchesDelPiso(Piso piso);
}
