package br.com.targetBank;

public class Cliente {

	private Long id;
	private String nome;
	private Endereco endereco;
	
	public Cliente(String nome) {
		super();
		this.nome = nome;
		this.endereco = new Endereco("Av Cavalhada", "Cavalhada", "3559", "91.740-000");
	}

	public Cliente(String nome, Endereco endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
