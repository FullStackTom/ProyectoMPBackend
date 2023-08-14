package com.sistema.repositorios;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.modelo.Piso;
import com.sistema.modelo.Switch;

public interface SwitchRepository extends JpaRepository<Switch, Long>{
	List<Switch> findByPiso(Piso piso);

}
