package com.projeto_final.app.repositories;

import com.projeto_final.app.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByNomeContainingIgnoreCase(String nome);
    Cliente findByCpf(String cpf);
    List<Cliente> findByEmailContainingIgnoreCase(String email);
}