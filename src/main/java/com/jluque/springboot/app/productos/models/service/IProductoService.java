package com.jluque.springboot.app.productos.models.service;

import java.util.List;

import com.jluque.springboot.app.commons.models.entity.Producto;


public interface IProductoService {

	public List<Producto> findAll();

	public Producto findById(Long id);

	public Producto save(Producto producto);

	public void deleteById(Long id);
}
