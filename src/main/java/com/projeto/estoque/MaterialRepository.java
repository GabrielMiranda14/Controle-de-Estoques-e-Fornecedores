package com.projeto.estoque;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Long> {
    // Aqui o Spring já nos dá os métodos salvar(), buscarTodos(), deletar() de graça!
}