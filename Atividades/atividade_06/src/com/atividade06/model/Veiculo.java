package com.atividade06.model;

// import com.atividade06.model.Pessoa;

public class Veiculo{
    private String fabricante;
    private String modelo;
    private String placa;
    private String cor;
    private String ano;
    private Pessoa propietario;


    public Veiculo(String fabricante, String modelo, String placa, String cor, String ano, Pessoa propietario) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.ano = ano;
        this.propietario = propietario;
    }


    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Pessoa getPropietario() {
        return this.propietario;
    }

    public void setPropietario(Pessoa propietario) {
        this.propietario = propietario;
    }






}
