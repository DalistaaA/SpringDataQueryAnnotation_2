package com.sgic.peopleManagement.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.sgic.peopleManagement.entities.Person;

public interface PersonRepository extends Repository<Person, Integer>{

	@Query(value="SELECT * FROM person WHERE last_name=?1", nativeQuery=true)
	List<Person> PersonInfoByLastName(String lastName);
	
	@Query(value="SELECT * FROM person WHERE first_name=?1 AND email=?2", nativeQuery=true)
	List<Person> getPersonInfoByFirstNameAndEmail(String firstName, String email);
	
}
