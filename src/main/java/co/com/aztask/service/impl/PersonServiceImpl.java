package co.com.aztask.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import co.com.aztask.dao.PersonDAO;
import co.com.aztask.model.Person;
import co.com.aztask.service.PersonService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

	private final PersonDAO personDAO;

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
	public Optional<Person> getPersonById(Long id) {
		return personDAO.findById(id);
	}



}
