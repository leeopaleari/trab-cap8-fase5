package br.com.fiap.models;

public interface Transacao {
    void depositar(double valor);
    void sacar(double valor);
    boolean transferir(Conta contaDestino, double valor);
}