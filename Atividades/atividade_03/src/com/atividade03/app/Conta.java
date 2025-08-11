package com.atividade03.app;

public class Conta {
    // atributos
    public  String  titular, cpf, agencia, conta; 
    public  double  saldo;


    //construtores
    public Conta() {
    }

    public Conta(String titular, String cpf, String agencia, String conta, double saldo) {
        this.titular = titular;
        this.cpf = cpf;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }
}

