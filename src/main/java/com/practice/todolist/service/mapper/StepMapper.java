package com.practice.todolist.service.mapper;

import com.practice.todolist.model.Step;
import com.practice.todolist.controller.dto.StepDTO;
import org.mapstruct.Mapper;

/**
* Generated by Springboot-3layer-Generator at 28.05.2021, 19:11:26
*/
@Mapper(componentModel = "spring")
public interface StepMapper {

    Step toEntity(StepDTO dto);

    StepDTO toDto(Step entity);

}