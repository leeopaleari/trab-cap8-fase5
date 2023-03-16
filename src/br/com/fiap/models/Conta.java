package br.com.fiap.models;

public class Conta implements Transacao {
	private Cliente titular;
	private int numeroConta;
	private double saldo;

	// Construtor padrão
	public Conta() {
		this.titular = new Cliente();
		this.numeroConta = 0;
		this.saldo = 0.0;
	}

	// Construtor com parâmetros
	public Conta(Cliente titular, int numeroConta) {
		this.titular = titular;
		this.numeroConta = numeroConta;
		this.saldo = 0.0;
	}

	public Conta(Cliente titular, int numeroConta, double saldo) {
		this.titular = titular;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	// Métodos getters e setters
	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			System.out.println("Saldo atual: " + this.saldo);
		} else {
			System.out.println("Saldo insuficiente");
		}
	}

	@Override
	public boolean transferir(Conta contaDestino, double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			contaDestino.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
}
