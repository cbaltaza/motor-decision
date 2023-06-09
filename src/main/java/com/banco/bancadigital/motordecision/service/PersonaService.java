package com.banco.bancadigital.motordecision.service;

import java.util.List;

import com.banco.bancadigital.motordecision.entity.Person;


public interface PersonaService {

	 /**
     *  recuperar Person
     */
	Person recuperarPerson(Long id);
    
    /**
     *  recuperar Person
     */
    List<Person> recuperarPersons();

	/**
	 * @param person
	 * @return
	 */
    Person guardar(Person per);
}
