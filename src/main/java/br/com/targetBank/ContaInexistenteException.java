package br.com.targetBank;

public class ContaInexistenteException extends Exception {

	private static final long serialVersionUID = 1L;

	public ContaInexistenteException(String message, Throwable cause) {
		super(message, cause);
	}

	public ContaInexistenteException(String message) {
		super(message);
	}

	
	
}
