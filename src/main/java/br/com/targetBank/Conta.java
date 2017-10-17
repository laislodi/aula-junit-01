package br.com.targetBank;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne(cascade = CascadeType.ALL)
	private Cliente cliente;
	@Column(name = "saldo")
	private Double saldo;
	@Column(name = "numero")
	private String numero;
	@Column(name = "agencia")
	private String agencia;
	@Column(name = "limite")
	private Double limite;

	public Conta(Cliente cliente, String numero, String agencia) {
		super();
		this.cliente = cliente;
		this.saldo = 0d;
		this.numero = numero;
		this.agencia = agencia;
		this.limite = 0d;
	}
	
	public Conta(Cliente cliente, Double saldo, String numero, String agencia) {
		super();
		this.cliente = cliente;
		this.saldo = saldo;
		this.numero = numero;
		this.agencia = agencia;
		this.limite = 0d;
	}

	public Conta(Cliente cliente, Double saldo, String numero, String agencia, Double limite) {
		super();
		this.cliente = cliente;
		this.saldo = saldo;
		this.numero = numero;
		this.agencia = agencia;
		this.limite = limite;
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

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

}
