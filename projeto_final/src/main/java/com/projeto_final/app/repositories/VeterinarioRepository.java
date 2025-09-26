package com.projeto_final.app.repositories;

import com.projeto_final.app.models.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface VeterinarioRepository extends JpaRepository<Veterinario, Long> {
    List<Veterinario> findByNomeContainingIgnoreCase(String nome);
    Veterinario findByCrmv(String crmv);
    List<Veterinario> findByEspecialidade(String especialidade);
    List<Veterinario> findByEmailContainingIgnoreCase(String email);
}