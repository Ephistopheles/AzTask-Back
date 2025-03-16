package co.com.aztask.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import co.com.aztask.dao.PersonDAO;
import co.com.aztask.entity.PersonEntity;
import co.com.aztask.service.PersonService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

	private final PersonDAO personDAO;

	@Override
	public PersonEntity savePerson(PersonEntity person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PersonEntity> getAllPersons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<PersonEntity> getPersonById(Long id) {
		return personDAO.findById(id);
	}



}
