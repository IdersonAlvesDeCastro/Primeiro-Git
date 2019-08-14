package Exercicio2;

public class ContaInvestimento extends ContaBancaria {

	public double calcularSaldo() {
		return saldo + (saldo * 0.05);
	}
}
