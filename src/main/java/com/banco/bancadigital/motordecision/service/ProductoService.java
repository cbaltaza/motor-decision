package com.banco.bancadigital.motordecision.service;

import java.util.List;

import com.banco.bancadigital.motordecision.entity.Producto;


public interface ProductoService {

	 /**
     *  recuperar Producto
     */
    Producto recuperarProducto(String id);
    
    /**
     *  recuperar Producto
     */
    List<Producto> recuperarProductos();

	/**
	 * @param producto
	 * @return
	 */
	Producto guardarProducto(Producto producto);
}
