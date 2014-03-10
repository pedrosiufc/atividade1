package br.ufc.quixada.npi.ui;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.ufc.quixada.npi.model.Contato;
import br.ufc.quixada.npi.model.Person;
import br.ufc.quixada.npi.service.ContatoService;
import br.ufc.quixada.npi.service.PersonService;

public class Main {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ContatoService cs = (ContatoService)ctx.getBean("contatoServiceImpl");
		PersonService ps = (PersonService)ctx.getBean("personServiceImpl");
		
		try {
			cs.insere();
			ps.insere();
		} catch (Exception e) {
			System.out.println("Não foi possível realizar a inserção");
		}
		List<Person> listaPessoas = ps.findAll();
		List<Contato> l = cs.findAll();

	    for (Contato c : l) {
	    	System.out.println(c);
	    }
	    System.out.println("listando as pessoas");
	    for (Person p : listaPessoas) {
	    	System.out.println(p);
	    }
		ctx.close();
		
	}
	
	

	
}
