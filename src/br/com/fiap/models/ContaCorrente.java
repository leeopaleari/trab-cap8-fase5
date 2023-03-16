package br.com.fiap.models;

public class ContaCorrente extends Conta {
	private double limiteChequeEspecial = 0;

	public ContaCorrente(int numero, Cliente titular) {
		super(titular, numero);
	}

	public double getLimiteChequeEspecial() {
		return this.limiteChequeEspecial;
	}

	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}

	public double getSaldoDisponivel() {
		return super.getSaldo() + limiteChequeEspecial;
	}

	@Override
	public void sacar(double valor) {
		if (valor > this.getSaldo() + this.limiteChequeEspecial) {
			System.out.println("Saldo insuficiente!");
		} else {
			double novoSaldo = this.getSaldo() - valor;
			this.setSaldo(novoSaldo);
		}
	}

	@Override
	public String toString() {
		return super.getTitular().toString() + ", " + "\n" + "conta: " + super.getNumeroConta() + ", saldo: " + "R$"
				+ super.getSaldo();
	}

}
