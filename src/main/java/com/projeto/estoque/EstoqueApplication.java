package com.projeto.estoque;

import javax.swing.JOptionPane;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EstoqueApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new
                SpringApplicationBuilder(EstoqueApplication.class).headless(false).run(args);                                              
	}
        
        @Bean 
        CommandLineRunner iniciar(ClienteRepository repositorio) {
            return args -> {           
                
                if (repositorio.findByEmail("admin@empresa.com").isEmpty()) {
                    // Cria o usuário padrão (Nome, Email, Senha)
                    Cliente admin = new Cliente("Administrador Aço", "admin@empresa.com", "123456");
                    repositorio.save(admin);
                    System.out.println("Usuário padrão criado com sucesso no banco H2!");
                }

            };
        
        }

}
