package br.com.targetBank;

public class InternetBanking {
	
	public void transferir(Double valor, Conta origem, Conta destino) throws SaldoInsuficienteException, ContaInexistenteException {
		if (origem == null || destino == null) {
			throw new ContaInexistenteException("Não foi possível realizar a transferência. Conta inexistente.");
		}
		
		if (origem.getAgencia() == null) {
			throw new ContaInexistenteException("Não foi possível realizar a transferência. Agência de origem inexistente");
		}
		
		if (destino.getAgencia() == null) {
			throw new ContaInexistenteException("Não foi possível realizar a transferência. Agência de destino inexistente");
		}
		
		if (valor <= origem.getSaldo() + origem.getLimite()) {
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
