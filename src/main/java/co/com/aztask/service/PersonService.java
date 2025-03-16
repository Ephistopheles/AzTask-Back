package co.com.aztask.service;

import java.util.List;
import java.util.Optional;

import co.com.aztask.model.Person;

public interface PersonService {

	Person savePerson(Person person);

	List<Person> getAllPersons();

	Optional<Person> getPersonById(Long id);
}
