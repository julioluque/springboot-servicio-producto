package com.jluque.springboot.app.productos.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jluque.springboot.app.productos.models.entity.Producto;
import com.jluque.springboot.app.productos.models.service.IProductoService;

@RestController
public class ProductoController {

	@SuppressWarnings("unused")
	@Autowired
	private Environment env;

	@Value("${server.port}")
	private Integer port;

	@Autowired
	private IProductoService productoService;

	@GetMapping("/listar")
	public List<Producto> listar() {
		return productoService.findAll().stream().map(producto -> {
//			producto.setPort(Integer.parseInt(env.getProperty("local.server.port")));
			producto.setPort(port);
			return producto;
		}).collect(Collectors.toList());
	}

	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable Long id) throws Exception {
		Producto producto = productoService.findById(id);
//		producto.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		producto.setPort(port);
		
		boolean ok = false;
		if (ok == false) {
			throw new Exception("No se pudo cargar el producto...");
		}
		
		
		return producto;
	}
}
