package co.com.aztask.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.aztask.entity.TaskEntity;

public interface TaskDAO extends JpaRepository<TaskEntity, Long> {

	List<TaskEntity> findByPersonId(Long personId);

}
