package co.com.aztask.convert;

import co.com.aztask.dto.TaskDTO;
import co.com.aztask.entity.PersonEntity;
import co.com.aztask.entity.TaskEntity;
import co.com.aztask.enums.TaskEffort;
import co.com.aztask.enums.TaskStatus;
import co.com.aztask.util.EnumUtils;

public class TaskConvert {

	public static TaskDTO toDTO(TaskEntity taskEntity) {
		return TaskDTO.builder()
				.id(taskEntity.getId())
				.title(taskEntity.getTitle())
				.description(taskEntity.getDescription())
				.status(taskEntity.getStatus().getCode())
				.effort(taskEntity.getEffort().getCode())
				.estimatedCompletionDate(taskEntity.getEstimatedCompletionDate())
				.personId(taskEntity.getPerson().getId())
				.build();
	}

	public static TaskEntity toEntity(TaskDTO taskDTO) {
		return TaskEntity.builder()
				.id(taskDTO.getId())
				.title(taskDTO.getTitle())
				.description(taskDTO.getDescription())
				.status(EnumUtils.fromString(TaskStatus.class, taskDTO.getStatus()))
				.effort(EnumUtils.fromString(TaskEffort.class, taskDTO.getEffort()))
				.estimatedCompletionDate(taskDTO.getEstimatedCompletionDate())
				.person(taskDTO.getPersonId() != null
				? PersonEntity.builder().id(taskDTO.getPersonId()).build() : null)
				.build();
	}

}
