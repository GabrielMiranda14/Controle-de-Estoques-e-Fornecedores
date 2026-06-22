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
            
                String nome = JOptionPane.showInputDialog("Digite o nome do Cliente:");
                
                if (nome == null || nome.isBlank()) {
                    JOptionPane.showMessageDialog(null, "Nome não infomado.");
                    return;
                }
                
                Cliente cliente = new Cliente(nome);
                
                repositorio.save(cliente);                              
                        
                JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!");
                
            };
        
        }

}
