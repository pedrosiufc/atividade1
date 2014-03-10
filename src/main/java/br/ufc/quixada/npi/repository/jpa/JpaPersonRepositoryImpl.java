package br.ufc.quixada.npi.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.ufc.quixada.npi.model.Person;
import br.ufc.quixada.npi.repository.PersonRepository;

@Repository
public class JpaPersonRepositoryImpl implements PersonRepository{

	@PersistenceContext
	private EntityManager em;
		
	public void save(Person p) {
		if(p.getId()==null){
			em.persist(p);
		}else{
			em.merge(p);
		}

	}

	public List<Person> findAll() {
		
		return em.createQuery("from Person", Person.class).getResultList();
				
	}

		
}
