package com.projeto.estoque;

import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
public class ClienteController {

    private final ClienteRepository repository;

    // O Spring injeta o repositório automaticamente aqui
    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

    // Endpoint Web para testar o login
    // Você vai acessar: http://localhost:8080/api/auth/login?email=teste@email.com&senha=123
    @GetMapping("/login")
    public String loginWeb(@RequestParam String email, @RequestParam String senha) {
        Optional<Cliente> clienteOpt = repository.findByEmail(email);

        if (clienteOpt.isPresent()) {
            Cliente cliente = clienteOpt.get();
            if (cliente.getSenha().equals(senha)) {
                return "Login efetuado com sucesso web! Bem-vindo, " + cliente.getNome();
            }
        }
        return "Erro: E-mail ou senha incorretos na Web.";
    }
}