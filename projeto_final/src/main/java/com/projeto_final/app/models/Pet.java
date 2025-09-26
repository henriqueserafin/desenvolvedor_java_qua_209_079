package com.projeto_final.app.models;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.CascadeType;

@Entity
public class Pet implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPet;
    private String nome;
    private String especie;
    private String raca;
    private int idade;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente proprietario;

    @OneToMany(mappedBy = "pet", cascade = CascadeType.ALL)
    private List<Consulta> consultas;

    public Pet() {}

    public long getIdPet() { return idPet; }
    public void setIdPet(long idPet) { this.idPet = idPet; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    public String getRaca() { return raca; }
    public void setRaca(String raca) { this.raca = raca; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public Cliente getProprietario() { return proprietario; }
    public void setProprietario(Cliente proprietario) { this.proprietario = proprietario; }

    public List<Consulta> getConsultas() { return consultas; }
    public void setConsultas(List<Consulta> consultas) { this.consultas = consultas; }
}