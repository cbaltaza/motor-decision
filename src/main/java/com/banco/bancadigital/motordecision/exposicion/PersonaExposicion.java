/**
 * 
 */
package com.banco.bancadigital.motordecision.exposicion;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.bancadigital.motordecision.entity.Person;
import com.banco.bancadigital.motordecision.service.PersonaService;

/**
 * @author BalMen
 *
 */
@RestController
@RequestMapping("/person")
@CrossOrigin(origins = { "http://localhost:80", "http://localhost:4200", "http://localhost:8080", "http://localhost" })
public class PersonaExposicion {

    public static final Logger log = LoggerFactory.getLogger(PersonaExposicion.class);

	@Autowired
	private PersonaService service;

	@GetMapping("/hola")
	public String saludar() {
		return "Hola Mundo Carlos1";
	}

	@GetMapping("/get/{id}")
	public Person getProduct(@PathVariable("id") Long id, @RequestHeader("token") String token) {
		
		log.info("Datos de entrada {}, {}.", id, token);
		return service.recuperarPerson( id );
	}

	@GetMapping("/all")
	public List<Person> getAll() {
        return service.recuperarPersons();
        }
	
	@PostMapping("/salvar")
    public Person guardarProducto(Person producto) {
        return  service.guardar(producto);
    }
}
