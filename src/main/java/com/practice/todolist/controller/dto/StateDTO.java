package com.practice.todolist.controller.dto;

import lombok.Data;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
* Generated by Springboot-3layer-Generator at 28.05.2021, 19:11:26
*/
@Data
public class StateDTO {

    private long serialVersionUID;
    private java.lang.String name;
    private java.util.List tasks;

}
