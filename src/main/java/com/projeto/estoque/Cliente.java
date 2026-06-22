package com.projeto.estoque;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    
    public Cliente(){
    }
    
    public Cliente(String nome){
        this.nome = nome;
    }
    
    public Long getId(){
        return id;
    }
    
    public String getNome(){
        return nome;
    }
    
}