package com.sistema.excepciones;

public class UsuarioFoundException extends Exception {

	public UsuarioFoundException() {
		super("El usuario ya existe en la base de datos, vuelva a intentar!");
	}
	
	public UsuarioFoundException(String mensaje){
		super(mensaje);		
	}
	
	
}
