package co.com.aztask.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Autowired;

import co.com.aztask.dao.PersonDAO;
import co.com.aztask.dto.TaskDTO;
import co.com.aztask.entity.TaskEntity;

@Mapper(componentModel = "spring", uses = EnumMapper.class)
public abstract class TaskMapper {

	@Autowired
	protected PersonDAO personDAO;

	@Autowired
	protected EnumMapper enumMapper;

	@Mapping(source = "person.id", target = "personId")
	@Mapping(target = "status", expression = "java(enumMapper.toDescription(task.getStatus()))")
	@Mapping(target = "effort", expression = "java(enumMapper.toDescription(task.getEffort()))")
	public abstract TaskDTO toDTO(TaskEntity task);

	@Mapping(target = "status", expression = "java(enumMapper.fromCode(co.com.aztask.enums.impl.TaskStatus.class, taskDTO.getStatus()))")
	@Mapping(target = "effort", expression = "java(enumMapper.fromCode(co.com.aztask.enums.impl.TaskEffort.class, taskDTO.getEffort()))")
	@Mapping(target = "createdAt", ignore = true)
	@Mapping(target = "updatedAt", ignore = true)
	@Mapping(target = "person", ignore = true)
	public abstract TaskEntity toEntity(TaskDTO taskDTO);

	@AfterMapping
	protected void assignPerson(@MappingTarget TaskEntity task, TaskDTO taskDTO) {
		if (taskDTO.getPersonId() != null)
			task.setPerson(personDAO.findById(taskDTO.getPersonId()).orElse(null));
	}

}
