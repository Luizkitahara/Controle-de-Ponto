package com.project.controledeponto;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Controle de Ponto",
				description = "API Rest para controle de ponto e acesso",
				version = "1.0.0",
				contact = @Contact(
						name = "Luiz Kitahara",
						url = "https://github.com/Luizkitahara",
						email = "luiz.kitahara@gmail.com"),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.apache.org/licenses/LICENSE-2.0.html")))

public class ControledepontoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControledepontoApplication.class, args);
	}

}
