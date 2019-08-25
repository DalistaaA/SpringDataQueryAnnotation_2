package com.sgic.peopleManagement.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.peopleManagement.entities.Person;
import com.sgic.peopleManagement.repositories.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	public List<Person> getPersonInfoByLastName(String lastName){
		return personRepository.PersonInfoByLastName(lastName);
		
	}

	public List<Person> getPersonsInfoByFirstNameAndEmail(String firstName, String email) {
		return personRepository.getPersonInfoByFirstNameAndEmail(firstName, email);
	}

	
}
