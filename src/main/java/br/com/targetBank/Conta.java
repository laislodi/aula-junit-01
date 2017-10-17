package br.com.targetBank;

public class Conta {

	private Long id;
	private Cliente cliente;
	private Double saldo;
	private String numero;
	private String agencia;

	public Conta(Cliente cliente, Double saldo, String numero, String agencia) {
		super();
		this.cliente = cliente;
		this.saldo = saldo;
		this.numero = numero;
		this.agencia = agencia;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

}
