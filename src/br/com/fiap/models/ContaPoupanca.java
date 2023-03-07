package br.com.fiap.models;

public class ContaPoupanca extends Conta {
	private double taxaJuros;

	public ContaPoupanca(Cliente titular, int numeroConta, double taxaJuros) {
		super(titular, numeroConta);
		this.taxaJuros = taxaJuros;
	}

	public double calcularJuros() {
		double juros = this.getSaldo() * (taxaJuros / 100.0);
		return juros;
	}

	@Override
	public String toString() {
		return this.getTitular().toString() + ", " + "\n" + "conta: " + this.getNumeroConta() + ", saldo: " + "R$"
				+ this.getSaldo();
	}
}
