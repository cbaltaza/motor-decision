package com.banco.bancadigital.motordecision.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.bancadigital.motordecision.entity.Person;
import com.banco.bancadigital.motordecision.model.EyeColor;
import com.banco.bancadigital.motordecision.repository.PersonRepository;
import com.banco.bancadigital.motordecision.service.PersonaService;

@Service
public class PersonsServiceImpl implements PersonaService {

	@Autowired
	private PersonRepository repository;

	/**
	 *recuperar Person
	 */
	@Override
	public Person recuperarPerson(Long id) {
		Person p = null;
		Optional<Person> d = repository.findById(id);

		if (d.isEmpty()) {

			for (int i = 0; i < 10; i++) {

				String name = CuteNameGenerator.generate();
				LocalDate birth = LocalDate.now().plusWeeks(Math.round(Math.floor(Math.random() * 40 * 52 * -1)));
				EyeColor color = EyeColor.values()[(int) (Math.floor(Math.random() * EyeColor.values().length))];
				p = new Person();
				p.setBirth(birth);
				p.setEyes(color);
				p.setName(name);
				repository.save(p);
			}
			Optional<Person> datosaux = repository.findById(id);
			if (!datosaux.isEmpty()) {
				p = datosaux.get();
			}
		} else {
			return d.get();
		}
		return null;
	}

	/**
	 *
	 */
	@Override
	public List<Person> recuperarPersons() {
		return (List<Person>) repository.findAll();
	}

	/**
	 * save Person
	 */
	@Override
	public Person guardar(Person per) {

		return repository.save(per);
	}

}
