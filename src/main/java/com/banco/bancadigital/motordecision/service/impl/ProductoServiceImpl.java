package com.banco.bancadigital.motordecision.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.bancadigital.motordecision.entity.Producto;
import com.banco.bancadigital.motordecision.repository.ProductoRepository;
import com.banco.bancadigital.motordecision.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public Producto recuperarProducto(String id) {

		Producto p = null;

		Optional<Producto> datos = productoRepository.findById(Long.valueOf(id));

		if (datos.isEmpty()) {

			for (int i = 0; i < 10; i++) {

				p = new Producto();
				p.setProductId(LocalDateTime.now().toString());
				p.setActive("Si");
				p.setName("Producto".concat(String.valueOf(i)));
				p.setCategoryId("Prueba");
				p.setStock(String.valueOf(i).concat("10"));
				p.setPrice(String.valueOf(i).concat("100.00"));
				productoRepository.save(p);
			}
			
			Optional<Producto> datosaux = productoRepository.findById(Long.valueOf(id));
			if (!datosaux.isEmpty()) {
				p = datosaux.get();
			}

		} else {
			p = datos.get();
		}


		return p;
	}

	@Override
	public List<Producto> recuperarProductos() {
		List<Producto> datos = (List<Producto>) productoRepository.findAll();
		return datos;
	}

	@Override
	public Producto guardarProducto(Producto producto) {
		Producto pr = null;
		pr = productoRepository.save(producto);
		return pr;
	}
}
