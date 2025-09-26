package com.projeto_final.app.repositories;

import com.projeto_final.app.models.Pet;
import com.projeto_final.app.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
    List<Pet> findByNomeContainingIgnoreCase(String nome);
    List<Pet> findByEspecie(String especie);
    List<Pet> findByRaca(String raca);
    List<Pet> findByProprietario(Cliente proprietario);
    List<Pet> findByProprietario_IdCliente(Long idCliente);
}