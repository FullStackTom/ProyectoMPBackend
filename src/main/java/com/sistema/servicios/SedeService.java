package com.sistema.servicios;

import java.util.Set;

import com.sistema.modelo.Sede;

public interface SedeService {
	
	Sede agregarSede(Sede sede);
	
	Sede actualizarSede(Sede sede);
	
	Set<Sede> obtenerSedes();
	
	Sede obtenerSede(Long id_sede);
	
	void eliminarSede(Long id_sede);
	

}
