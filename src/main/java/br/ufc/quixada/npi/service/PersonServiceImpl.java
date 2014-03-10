package br.ufc.quixada.npi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.ufc.quixada.npi.model.Person;
import br.ufc.quixada.npi.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	public PersonServiceImpl() {
		
	}
	
	@Transactional
	public void insere() {
		personRepository.save(new Person("Pedro", "jose"));
		personRepository.save(new Person("hadassa", "alves"));
		personRepository.save(new Person("heitor", "alves"));
		personRepository.save(new Person("romenia", "alves"));
		
	}
	public List<Person> findAll() {
		
			List<Person> lista = personRepository.findAll();
			return lista;
		}
}
	

