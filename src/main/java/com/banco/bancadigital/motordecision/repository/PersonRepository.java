/**
 * 
 */
package com.banco.bancadigital.motordecision.repository;

import org.springframework.data.repository.CrudRepository;

import com.banco.bancadigital.motordecision.entity.Person;

/**
 * @author BalMen
 *
 */
public interface PersonRepository extends CrudRepository<Person, Long> {

}
