package co.com.aztask.service;

import java.util.List;
import java.util.Optional;

import co.com.aztask.entity.PersonEntity;

public interface PersonService {

	PersonEntity savePerson(PersonEntity person);

	List<PersonEntity> getAllPersons();

	Optional<PersonEntity> getPersonById(Long id);
}
