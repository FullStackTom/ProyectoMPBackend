package com.sistema.servicios;

import java.util.List;
import java.util.Set;

import com.sistema.modelo.Piso;
import com.sistema.modelo.Sede;

public interface PisoService {
	Piso agregarPiso(Piso piso);
	Piso actualizarPiso(Piso piso);
	Set<Piso>obtenerPisos();
	Piso obtenerPiso(Long id_piso);
	void eliminarPiso(Long id_piso);
	
	List<Piso>listarPisosDeUnaSede(Sede sede);

}
