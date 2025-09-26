package com.projeto_final.app.models;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;

@Entity
public class Veterinario implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idVeterinario;
    private String nome;
    private String especialidade;
    private String crmv;
    private String email;
    private String telefone;

    @OneToMany(mappedBy = "veterinario", cascade = CascadeType.ALL)
    private List<Consulta> consultas;

    public Veterinario() {}

    public long getIdVeterinario() { return idVeterinario; }
    public void setIdVeterinario(long idVeterinario) { this.idVeterinario = idVeterinario; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }

    public String getCrmv() { return crmv; }
    public void setCrmv(String crmv) { this.crmv = crmv; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public List<Consulta> getConsultas() { return consultas; }
    public void setConsultas(List<Consulta> consultas) { this.consultas = consultas; }
}