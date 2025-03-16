package co.com.aztask.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import co.com.aztask.dao.PersonDAO;
import co.com.aztask.model.Person;
import co.com.aztask.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	
	private final PersonDAO personDAO;
	
	public PersonServiceImpl(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	@Override
	public Person savePerson(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person getPersonById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}



}
