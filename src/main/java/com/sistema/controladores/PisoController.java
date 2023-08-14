package com.sistema.controladores;

import java.util.List;

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

import com.sistema.modelo.Piso;
import com.sistema.modelo.Sede;
import com.sistema.servicios.PisoService;
import com.sistema.servicios.SwitchService;

@RestController
@RequestMapping("/pisos")
@CrossOrigin("*")
public class PisoController {
	
	@Autowired
	private PisoService pisoService;
	
	
	@Autowired
	private SwitchService switchService;
	
	@PostMapping("/")
	public ResponseEntity<Piso>guardarPiso(@RequestBody Piso piso){
		return ResponseEntity.ok(pisoService.agregarPiso(piso));
	}
	
	@PutMapping("/")
	public ResponseEntity<Piso>actualizarPiso(@RequestBody Piso piso){
		return ResponseEntity.ok(pisoService.actualizarPiso(piso));
	}
	
	@GetMapping("/")
	public ResponseEntity<?>listarPisos(){
		return ResponseEntity.ok(pisoService.obtenerPisos());
	}
	
	@GetMapping("/{id_piso}")
	public Piso listarPiso(@PathVariable("id_piso")Long id_piso) {
		return pisoService.obtenerPiso(id_piso);
	}
	
	@DeleteMapping("/{id_piso}")
	public void eliminarPiso(@PathVariable("id_piso")Long id_piso) {
		pisoService.eliminarPiso(id_piso);
	}
	
	@GetMapping("/sede/{id_sede}")
	public List<Piso>listarPisosDeUnaSede(@PathVariable("id_sede") Long id_Sede){
		Sede sede = new Sede();
		sede.setId_sede(id_Sede);
		return pisoService.listarPisosDeUnaSede(sede);
	}	
	

}
