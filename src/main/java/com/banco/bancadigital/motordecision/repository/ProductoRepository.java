/**
 * 
 */
package com.banco.bancadigital.motordecision.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.banco.bancadigital.motordecision.entity.Producto;


/**
 * @author BalMen
 *
 */
public interface ProductoRepository extends CrudRepository<Producto, Long> {

	Optional<Producto> findByProductId(String id);

}
