package com.practice.todolist.controller.dto;

import com.practice.todolist.model.Listed;
import lombok.Data;

/**
* Generated by Springboot-3layer-Generator at 28.05.2021, 19:11:26
*/
@Data
public class StepDTO {

    private long serialVersionUID;
    private int id;
    private java.lang.String description;
    private java.lang.String name;
    private int orderInTodolist;
    private Listed listed;
    private java.util.List tasks;

}
