package com.atividade03.app;
public class Conta {
    private String titular;
    private String cpf;
    private String agencia;
    private String numeroConta;
    private double saldo;
    
    public Conta(){}

    public Conta(String titular, String cpf, String agencia, String numeroConta, double saldoInicial) {
        this.titular = titular;
        this.cpf = cpf;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("CPF: " + cpf);
        System.out.println("Agência: " + agencia);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("Novo saldo: R$ %f%n", valor);

    }
}