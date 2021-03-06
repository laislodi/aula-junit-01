package br.com.targetBank;

public class Endereco {

	private String rua;
	private String bairro;
	private String numero;
	private String cidade;
	private Estado estado;
	private String cep;
	private String pais;

	public Endereco(String rua, String bairro, String numero, String cep) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
		this.cidade = "Porto Alegre";
		this.estado = Estado.RS;
		this.cep = cep;
		this.pais = "Brasil";
	}

	public Endereco(String rua, String bairro, String numero, String cidade, Estado estado, String cep) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.pais = "Brasil";
	}

	public Endereco(String rua, String bairro, String numero, String cidade, Estado estado, String cep, String pais) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.pais = pais;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String toString() {
		String endereco = "";
		if (rua != null) {
			endereco += rua;
		}
		if (numero != null) {
			endereco += " n. " + numero;
		}
		if (bairro != null) {
			endereco += " Bairro: " + bairro + "\n";
		}
		if (cidade != null) {
			endereco += cidade;
		}
		if (estado != null) {
			endereco += " - " + estado.getDescricao() + ",";
		}
		if (cep != null) {
			endereco += " " + cep + ",";
		}
		if (pais != null) {
			endereco += " " + pais;
		}

		return endereco;
	}

}
