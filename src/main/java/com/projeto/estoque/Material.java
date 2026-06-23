package com.projeto.estoque;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private String tipo;       // Ex: Chapa, Viga, Tubo, Barra
    private Integer quantidade;
    private Double pesoKg;     // Peso em kg (pode usar ponto flutuante)
    private Double preco;

    // Construtor padrão (obrigatório para o Hibernate)
    public Material() {
    }

    // Construtor completo atualizado
    public Material(String nome, String tipo, Integer quantidade, Double pesoKg, Double preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.pesoKg = pesoKg;
        this.preco = preco;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public Integer getQuantidade() { return quantidade; }
    public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }

    public Double getPesoKg() { return pesoKg; }
    public void setPesoKg(Double pesoKg) { this.pesoKg = pesoKg; }

    public Double getPreco() { return preco; }
    public void setPreco(Double preco) { this.preco = preco; }
}