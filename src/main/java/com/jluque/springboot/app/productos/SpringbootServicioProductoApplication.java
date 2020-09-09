package com.jluque.springboot.app.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringbootServicioProductoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioProductoApplication.class, args);
	}

}
