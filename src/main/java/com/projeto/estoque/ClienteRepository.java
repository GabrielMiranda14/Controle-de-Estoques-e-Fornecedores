/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.projeto.estoque;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author gabriel.msouza40
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
    // Busca um cliente no banco usando o e-mail
    Optional<Cliente> findByEmail(String email);    
}
