package br.ufc.quixada.npi.service;

import java.util.List;

import br.ufc.quixada.npi.model.Person;

public interface PersonService {

	public abstract void insere();

	public abstract List<Person> findAll();
}
