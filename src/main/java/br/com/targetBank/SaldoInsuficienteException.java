package br.com.targetBank;

public class SaldoInsuficienteException extends Exception {

	private static final long serialVersionUID = 1L;
	private Double valor;
	
	public SaldoInsuficienteException(Double valor) {
		super();
		this.valor = valor;
	}

	public SaldoInsuficienteException(String message, Throwable cause) {
		super(message, cause);
	}

	public SaldoInsuficienteException(String message) {
		super(message);
	}
	
	
	
}
