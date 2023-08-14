package com.sistema.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.modelo.Piso;
import com.sistema.modelo.Sede;

public interface PisoRepository extends JpaRepository<Piso, Long> {
	List<Piso> findBySede(Sede sede);

}
