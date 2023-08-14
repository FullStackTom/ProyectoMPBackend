package com.sistema.excepciones;

public class UsuarioNotFoundException extends Exception {
	
	public UsuarioNotFoundException() {
		super("El usuario no existe en la base de datos, vuelva a intentar!");
	}
	
	public UsuarioNotFoundException(String mensaje){
		super(mensaje);		
	}

}
