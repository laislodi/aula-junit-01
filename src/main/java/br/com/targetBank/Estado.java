package br.com.targetBank;

public enum Estado {
	// Região Norte: 7 Estados
	AC("Acre"), AM("Amazonas"), AP("Amapá"), PA("Pará"), RO("Rondônia"), RR("Roraima"),  
	// Nordeste: 9 Estados
	AL("Alagoas"), BA("Bahia"), CE("Ceará"), MA("Maranhão"), PB("Paraíba"), PE("Pernambuco"), PI("Piauí"), 
	RN("Rio Grande do Norte"), SE("Sergipe"),
	// Sudeste: 4 Estados
	ES("Espírito Santo"), MG("Minas Gerais"), RJ("Rio de Janeiro"), SP("São Paulo"),
	// Centro Oeste: 3 Estados + DF
	DF("Distrito Federal"), GO("Goiás"), MT("Mato Grosso"), MS("Mato Grosso do Sul"),
	// Sul: 3 Estados
	PR("Paraná"), RS("Rio Grande do Sul"), SC("Santa Catarina");
	
	private String descricao;
	
	Estado(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
