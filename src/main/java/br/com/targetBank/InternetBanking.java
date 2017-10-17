package br.com.targetBank;

public class InternetBanking {
	
	public void transferir(Double valor, Conta origem, Conta destino) throws SaldoInsuficienteException {
		if (valor <= origem.getSaldo()) {
			debitar(valor, origem);
			creditar(valor, destino);
		}else {
			throw new SaldoInsuficienteException(valor);
		}
	}

	private void creditar(Double valor, Conta destino) {
		destino.setSaldo(destino.getSaldo() + valor);
	}

	private void debitar(Double valor, Conta origem) {
		origem.setSaldo(origem.getSaldo() - valor);
	}
	
	
	
}
