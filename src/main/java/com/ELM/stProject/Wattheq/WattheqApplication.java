package com.ELM.stProject.Wattheq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@AutoConfigurationPackage
@EnableAutoConfiguration
@EnableJpaRepositories
@ComponentScan(basePackages = {"com.ELM.stProject.Wattheq.Controller", "com.ELM.stProject.Wattheq.Service", "com.ELM.stProject.Wattheq.View"})
public class WattheqApplication {

	public static void main(String[] args) {
		SpringApplication.run(WattheqApplication.class, args);
	}

}
