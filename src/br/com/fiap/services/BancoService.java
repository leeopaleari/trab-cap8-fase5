package br.com.fiap.services;

import br.com.fiap.models.Cliente;
import br.com.fiap.models.ContaCorrente;
import br.com.fiap.models.ContaPoupanca;

public class BancoService {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Leonardo Paleari Loge", "0987654321", 27);
		ContaCorrente conta1 = new ContaCorrente(54321, cliente1);

		conta1.depositar(1000);
		System.out.println(conta1.toString());
		System.out.println();
		conta1.sacar(1500);
		System.out.println();
		System.out.println(conta1.toString());
		System.out.println();
		conta1.sacar(100);
		System.out.println(conta1.toString());

		Cliente cliente2 = new Cliente("Jade França", "12345678901", 27);
		ContaPoupanca conta2 = new ContaPoupanca(cliente2, 12345, 3);

		conta2.depositar(150);
		conta2.calcularJuros();
		System.out.println();
		System.out.println(conta2.toString());
		System.out.println("Taxa de juros de " + conta2.calcularJuros()+ "%");

	}

}
