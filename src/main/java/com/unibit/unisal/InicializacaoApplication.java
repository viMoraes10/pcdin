package com.unibit.unisal;

import com.unibit.unisal.config.ConfiguracaoWeb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ConfiguracaoWeb.class})
public class InicializacaoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(InicializacaoApplication.class, args);
	}

}
