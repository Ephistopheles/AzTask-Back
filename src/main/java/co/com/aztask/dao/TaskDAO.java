package co.com.aztask.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.aztask.model.Task;

public interface TaskDAO extends JpaRepository<Task, Long> {

	List<Task> findByPersonId(Long personId);

}
