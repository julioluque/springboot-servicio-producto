package com.jluque.springboot.app.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EntityScan({ "com.jluque.springboot.app.commons.models.entity" }) // incluimos dentro del contexto
public class SpringbootServicioProductoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioProductoApplication.class, args);
	}

}
