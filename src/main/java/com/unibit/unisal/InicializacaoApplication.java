package com.unibit.unisal;

import com.unibit.unisal.config.ConfiguracaoWeb;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ConfiguracaoWeb.class})
@OpenAPIDefinition(info = @Info(title = "Swagger OpenApi", version = "1", description = "API desenvolvida para unicialização Cientifica"))
public class InicializacaoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(InicializacaoApplication.class, args);
	}

}
