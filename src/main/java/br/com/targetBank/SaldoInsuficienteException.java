package br.com.targetBank;

public class SaldoInsuficienteException extends Exception {

	private static final long serialVersionUID = 1L;
	private Double valor;
	
	public SaldoInsuficienteException(Double valor) {
		super();
		this.setValor(valor);
	}

	public SaldoInsuficienteException(String message, Throwable cause) {
		super(message, cause);
	}

	public SaldoInsuficienteException(String message) {
		super(message);
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	
}
