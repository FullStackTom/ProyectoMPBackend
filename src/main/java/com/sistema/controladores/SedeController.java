package com.sistema.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.modelo.Sede;
import com.sistema.servicios.SedeService;

@RestController
@RequestMapping("/sedes")
@CrossOrigin("*")
public class SedeController {
	
	@Autowired
	private SedeService sedeService;
	
	@PostMapping("/")
	public ResponseEntity<Sede>guardarSede(@RequestBody Sede sede){
		Sede sedeGuardada = sedeService.agregarSede(sede);
		return ResponseEntity.ok(sedeGuardada);
	}
	
	@GetMapping("/{id_sede}")
	public Sede listarSedePorId(@PathVariable("id_sede") Long id_sede) {
		return sedeService.obtenerSede(id_sede);
	}

	
	@GetMapping("/")
	public ResponseEntity<?>listarSedes(){
		return ResponseEntity.ok(sedeService.obtenerSedes());
				
	}
	
	@PutMapping("/")
	public Sede actualizarSede(@RequestBody Sede sede) {
		return sedeService.actualizarSede(sede);
	}
	
	@DeleteMapping("/{id_sede}")
	public void eliminarSede(@PathVariable("id_sede") Long id_sede) {
		sedeService.eliminarSede(id_sede);
	}
	
	
}
