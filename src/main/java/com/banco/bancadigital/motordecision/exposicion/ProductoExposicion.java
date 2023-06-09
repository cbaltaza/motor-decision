/**
 * 
 */
package com.banco.bancadigital.motordecision.exposicion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.bancadigital.motordecision.entity.Person;
import com.banco.bancadigital.motordecision.entity.Producto;
import com.banco.bancadigital.motordecision.service.ProductoService;

/**
 * @author BalMen
 *
 */
@RestController
@RequestMapping("/producto")
@CrossOrigin(origins = { "http://localhost:80", "http://localhost:4200", "http://localhost:8080",
"http://localhost" })
public class ProductoExposicion {

	@Autowired
	private ProductoService productoService;

	@GetMapping("/get/{id}")
	public Producto getProduct(@PathVariable("id") String productId) {
		return productoService.recuperarProducto( productId );
	}

	@GetMapping("/all")
	public List<Producto> getAll() {
        return productoService.recuperarProductos();
        }
	
	@PostMapping("/salvar")
    public Producto guardarProducto(Producto producto) {
        return  productoService.guardarProducto(producto);
    }
}
