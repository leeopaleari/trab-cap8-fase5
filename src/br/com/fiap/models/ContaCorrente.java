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

	@Override
	public void sacar(double valor) {
		if (valor > this.getSaldo() + this.limiteChequeEspecial) {
			System.out.println("Saldo insuficiente!");
		} else {
			this.saldo -= valor;
		}
	}

	@Override
	public String toString() {
		return this.getTitular().toString() + ", " + "\n" + "conta: " + this.getNumeroConta() + ", saldo: "
				+ "R$" + this.getSaldo();
	}

}
