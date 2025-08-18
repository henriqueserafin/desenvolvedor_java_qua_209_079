package com.atividade04.model;

public class ColetaDados {
    private double altura;
    private double peso;
    private double imc;
    private String nome;


    public ColetaDados(double altura, double peso, double imc, String nome) {
        this.altura = altura;
        this.peso = peso;
        this.imc = peso/(altura*altura);
        this.nome = nome;
    }
    


    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return this.imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
