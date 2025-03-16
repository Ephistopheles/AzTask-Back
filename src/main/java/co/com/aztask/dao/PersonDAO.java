package co.com.aztask.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.aztask.entity.PersonEntity;

@Repository
public interface PersonDAO extends JpaRepository<PersonEntity, Long> {
	
	Optional<PersonEntity> findByUserId(Long userId);

}
