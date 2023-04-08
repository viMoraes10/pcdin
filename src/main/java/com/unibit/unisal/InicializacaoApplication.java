package com.unibit.unisal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class InicializacaoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(InicializacaoApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(InicializacaoApplication.class);
	}

}
