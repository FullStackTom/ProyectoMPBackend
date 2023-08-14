package com.sistema;

import java.util.HashSet;
import java.util.Set;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.sistema.*;
import com.sistema.excepciones.UsuarioFoundException;
import com.sistema.modelo.Rol;
import com.sistema.modelo.Usuario;
import com.sistema.modelo.UsuarioRol;
import com.sistema.servicios.UsuarioService;

@SpringBootApplication
public class SistemaBackendApplication implements CommandLineRunner {

	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SistemaBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*try{
			Usuario usuario = new Usuario();

			usuario.setNombre("Tomas");
			usuario.setApellido("Olortegui");
			usuario.setUsername("tomas");
			usuario.setPassword(bCryptPasswordEncoder.encode("123456"));
			usuario.setEmail("tolortegui@gmail.com");
			usuario.setTelefono("969089708");
			usuario.setPerfil("foto.png");

			Rol rol = new Rol();
			rol.setRolId(1L);
			rol.setRolNombre("Administrador");

			Set<UsuarioRol> usuariosRoles = new HashSet<>();
			UsuarioRol usuarioRol = new UsuarioRol();
			usuarioRol.setRol(rol);
			usuarioRol.setUsuario(usuario);
			usuariosRoles.add(usuarioRol);

			Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario,usuariosRoles);
			System.out.println(usuarioGuardado.getUsername());
		}catch (UsuarioFoundException exception){
			exception.printStackTrace();
		}*/
	}
}
