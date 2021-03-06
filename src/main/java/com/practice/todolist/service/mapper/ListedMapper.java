package com.practice.todolist.service.mapper;

import com.practice.todolist.model.Listed;
import com.practice.todolist.controller.dto.ListedDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
* Generated by Springboot-3layer-Generator at 28.05.2021, 19:11:26
*/
@Mapper(componentModel = "spring")
public interface ListedMapper {

    @Mapping(source = "id",target = "id")
    @Mapping(source = "description",target = "description")
    @Mapping(source = "name",target = "name")
    @Mapping(source = "order",target = "order")
    Listed toEntity(ListedDTO dto);

    @Mapping(source = "id",target = "id")
    @Mapping(source = "description",target = "description")
    @Mapping(source = "name",target = "name")
    @Mapping(source = "order",target = "order")
    ListedDTO toDto(Listed entity);

}