package com.correcaoatv3.app;

public class Conta {
    public String titular;
    public String cpf;
    public String agencia;
    public String nConta;
    public double saldo;


    //constructor
    public Conta(String titular, String cpf, String agencia, String nConta, double saldo) {
        this.titular = titular;
        this.cpf = cpf;
        this.agencia = agencia;
        this.nConta = nConta;
        this.saldo = saldo;
    }
    //metodos
    public void exibirDados(){
        System.out.println("Nome do titular: " + this.titular);
        System.out.println("CPF do titular: "+this.cpf);
        System.out.println("agência: "+this.agencia);
        System.out.println("Número da conta: "+this.nConta);
        System.out.println("Saldo da conta: R$ "+String.format("%.2f",this.saldo));
    }
    public double fazerDeposito(double valor){
        this.saldo += valor;
        return this.saldo;
    }
    public double fazerSaque(double valor){
        this.saldo-=valor;
        return this.saldo;
    }


}
