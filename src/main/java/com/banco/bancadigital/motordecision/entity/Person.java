/**
 * 
 */
package com.banco.bancadigital.motordecision.entity;

import java.io.Serializable;
import java.time.LocalDate;

import com.banco.bancadigital.motordecision.model.EyeColor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author BalMen
 *
 */
@Entity
public class Person implements Serializable {
	/**
	 * serial Versio nUID
	 */
	private static final long serialVersionUID = 4829389500139293744L;

	// the person's name
	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String name;

	// the person's birthdate
	@Column(nullable = false)
	private LocalDate birth;

	// the person's eye color
	@Enumerated(EnumType.STRING)
	@Column(length = 8)
	private EyeColor eyes;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the birth
	 */
	public LocalDate getBirth() {
		return birth;
	}

	/**
	 * @param birth the birth to set
	 */
	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}

	/**
	 * @return the eyes
	 */
	public EyeColor getEyes() {
		return eyes;
	}

	/**
	 * @param eyes the eyes to set
	 */
	public void setEyes(EyeColor eyes) {
		this.eyes = eyes;
	}

	
}