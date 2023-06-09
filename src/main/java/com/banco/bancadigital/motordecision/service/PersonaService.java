package com.banco.bancadigital.motordecision.service;

import java.util.List;

import com.banco.bancadigital.motordecision.entity.Person;


public interface PersonaService {

	 /**
     *  recuperar Producto
     */
	Person recuperarPerson(Long id);
    
    /**
     *  recuperar Producto
     */
    List<Person> recuperarPersons();

	/**
	 * @param producto
	 * @return
	 */
    Person guardar(Person per);
}
