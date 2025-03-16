package co.com.aztask.service;

import java.util.List;

import co.com.aztask.model.Person;

public interface PersonService {

	Person savePerson(Person person);

	List<Person> getAllPersons();

	Person getPersonById(Long id);
}
