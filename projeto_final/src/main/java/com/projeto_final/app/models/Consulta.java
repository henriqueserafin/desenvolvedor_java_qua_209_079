package com.projeto_final.app.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Consulta implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idConsulta;
    private LocalDateTime data;
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "id_pet")
    private Pet pet;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_veterinario")
    private Veterinario veterinario;

    public Consulta() {}

    public long getIdConsulta() { return idConsulta; }
    public void setIdConsulta(long idConsulta) { this.idConsulta = idConsulta; }

    public LocalDateTime getData() { return data; }
    public void setData(LocalDateTime data) { this.data = data; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Pet getPet() { return pet; }
    public void setPet(Pet pet) { this.pet = pet; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Veterinario getVeterinario() { return veterinario; }
    public void setVeterinario(Veterinario veterinario) { this.veterinario = veterinario; }
}