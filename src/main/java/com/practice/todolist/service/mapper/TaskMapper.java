package com.practice.todolist.service.mapper;

import com.practice.todolist.model.Task;
import com.practice.todolist.controller.dto.TaskDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
* Generated by Springboot-3layer-Generator at 28.05.2021, 19:11:26
*/
@Mapper(componentModel = "spring")
public interface TaskMapper {

    @Mapping(source = "id",target = "id")
    @Mapping(source = "description",target = "description")
    @Mapping(source = "name",target = "name")
    @Mapping(source = "order_in_steplist",target = "orderInSteplist")
    @Mapping(source = "step_id",target = "stepId")
    Task toEntity(TaskDTO dto);

    @Mapping(source = "id",target = "id")
    @Mapping(source = "description",target = "description")
    @Mapping(source = "name",target = "name")
    @Mapping(source = "order_in_steplist",target = "orderInSteplist")
    @Mapping(source = "step_id",target = "stepId")
    TaskDTO toDto(Task entity);

}