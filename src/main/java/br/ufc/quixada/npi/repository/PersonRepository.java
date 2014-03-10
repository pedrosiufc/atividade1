package br.ufc.quixada.npi.repository;

import java.util.List;

import br.ufc.quixada.npi.model.Person;

public interface PersonRepository {

		public abstract void save(Person p);

		public abstract List<Person> findAll();
		
	}

