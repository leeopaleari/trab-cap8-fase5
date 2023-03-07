package br.com.fiap.models;

public class Cliente {
	private String nome;
	private String cpf;
	private int idade;
	private Conta contaBancaria;

	// Construtor padrão
	public Cliente() {
		this.nome = "";
		this.idade = 0;
		this.contaBancaria = new Conta();
	}

	// Construtor com parâmetros

	public Cliente(String nome, String cpf, int idade) {
		this.nome = nome;
		this.setCpf(cpf);
		this.idade = idade;
	}

	public Cliente(String nome, int idade, Conta contaBancaria) {
		this.nome = nome;
		this.idade = idade;
		this.contaBancaria = contaBancaria;
	}

	// Métodos getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Conta getContaBancaria() {
		return contaBancaria;
	}

	public void setContaBancaria(Conta contaBancaria) {
		this.contaBancaria = contaBancaria;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return this.nome + ", " + this.idade + " anos, " + " documento: " + this.cpf;
	}
}
