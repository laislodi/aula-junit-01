package br.com.targetBank;

import org.junit.Assert;
import org.junit.Test;

public class InternetBankingTest {

	@Test
	public void testTrasferencia() throws SaldoInsuficienteException, ContaInexistenteException {
		InternetBanking ib = new InternetBanking();
		Conta origem = new Conta(new Cliente("Lais Gabrielle Lodi"), 4000d, "11.111-1", "1111-1");
		Conta destino = new Conta(new Cliente("Aline Alves da Silva"), 1000d, "22.222-2", "1111-1");
		Double valor = 500d;

		ib.transferir(valor, origem, destino);

		Assert.assertEquals(new Double(3500d), origem.getSaldo());
		Assert.assertEquals(new Double(1500d), destino.getSaldo());
	}

	@Test(expected = SaldoInsuficienteException.class)
	public void testTransferenciaSemSaldo() throws SaldoInsuficienteException, ContaInexistenteException {
		InternetBanking ib = new InternetBanking();
		Conta origem = new Conta(new Cliente("Lais Gabrielle Lodi"), 4000d, "11.111-1", "1111-1");
		Conta destino = new Conta(new Cliente("Aline Alves da Silva"), 1000d, "22.222-2", "1111-1");
		Double valor = 5000d;

		ib.transferir(valor, origem, destino);
	}
}
