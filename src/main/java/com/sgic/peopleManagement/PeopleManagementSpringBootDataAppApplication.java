package com.sgic.peopleManagement;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sgic.peopleManagement.entities.Person;
import com.sgic.peopleManagement.services.PersonService;

@SpringBootApplication
public class PeopleManagementSpringBootDataAppApplication implements CommandLineRunner {

	@Autowired
	private PersonService personService;
	
	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementSpringBootDataAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		getPersonInfoByLastName();
		getPersonsInfoByFirstNameAndEmail();
	}

	private void getPersonsInfoByFirstNameAndEmail() {
		List<Person> personList = personService.getPersonsInfoByFirstNameAndEmail("Thinesh","thiharii@gmail.com");
		personList.forEach(System.out::println);
		
	}

	private void getPersonInfoByLastName() {
		List<Person> personList = personService.getPersonInfoByLastName("Arikari");
		personList.forEach(System.out::println);
		
	}

	
	

}
