package com.projeto_final.app.repositories;

import com.projeto_final.app.models.Consulta;
import com.projeto_final.app.models.Cliente;
import com.projeto_final.app.models.Pet;
import com.projeto_final.app.models.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    List<Consulta> findByCliente(Cliente cliente);
    List<Consulta> findByPet(Pet pet);
    List<Consulta> findByVeterinario(Veterinario veterinario);
    List<Consulta> findByDataBetween(LocalDateTime inicio, LocalDateTime fim);
    @Query("SELECT c FROM Consulta c WHERE c.data >= :dataInicio ORDER BY c.data ASC")
    List<Consulta> findConsultasFuturas(LocalDateTime dataInicio);
}