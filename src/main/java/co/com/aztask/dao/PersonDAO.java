package co.com.aztask.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.aztask.model.Person;

@Repository
public interface PersonDAO extends JpaRepository<Person, Long> {
	
	Optional<Person> findByUserId(Long userId);

}
