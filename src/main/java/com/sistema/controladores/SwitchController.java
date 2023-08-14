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
import com.sistema.modelo.Switch;
import com.sistema.servicios.SwitchService;

@RestController
@RequestMapping("/switches")
@CrossOrigin("*")
public class SwitchController {
	
	@Autowired
	private SwitchService switchService;
		
	
	@PostMapping("/")
	public ResponseEntity<Switch>guardarSwitch(@RequestBody Switch sw){
		return ResponseEntity.ok(switchService.agregarSwitch(sw));
	}
	
	@PutMapping("/")
	public ResponseEntity<Switch>actualizarSwitch(@RequestBody Switch sw) {
		return ResponseEntity.ok(switchService.actualizarSwitch(sw));
	}
	
	@GetMapping("/")
	public ResponseEntity<?> listarSwitches(){
		return ResponseEntity.ok(switchService.obtenerSwitches());
	}
	
	@GetMapping("/{id_switch}")
	public Switch listarSwitch(@PathVariable("id_switch") Long id_switch) {
		return switchService.obtenerSwitch(id_switch);
	}
	
	@DeleteMapping("/{id_switch}")
	public void eliminarSwitch(@PathVariable("id_switch") Long id_switch) {
		switchService.eliminarSwitch(id_switch);	}
	
	
	
	@GetMapping("/piso/{id_piso}")
	public List<Switch> listarSwitchesDelPiso(@PathVariable("id_piso")Long id_piso){
		Piso piso = new Piso();
		piso.setId_piso(id_piso);
		return switchService.obtenerSwitchesDelPiso(piso);	
	}
	
	
	
	

}
