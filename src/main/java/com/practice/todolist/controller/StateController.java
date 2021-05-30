package com.practice.todolist.controller;

import com.practice.todolist.model.State;
import com.practice.todolist.service.StateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
* Generated by Springboot-3layer-Generator at 28.05.2021, 19:11:26
*/
@RestController
@RequestMapping("/state/")
public class StateController implements CrudController<State,Integer>{

    @Autowired
    private StateService service;

    @Override
    public ResponseEntity<State> create(@RequestBody State entity) {
        return ResponseEntity.ok(service.create(entity));
    }

    @Override
    public ResponseEntity<State> update(@RequestBody State entity) {
        return ResponseEntity.ok(service.update(entity));
    }

    @Override
    public ResponseEntity<Page<State>> read(
            @RequestBody State entity,
            @RequestParam("page") Integer page,
            @RequestParam("size") Integer size) {
        Pageable pageable = PageRequest.of(page,size);
        return ResponseEntity.ok(service.read(entity,pageable));
    }

    public ResponseEntity<State> readOne(@PathVariable("id") Integer primaryKey) {
        return ResponseEntity.ok(service.readOne(primaryKey));
    }
    
    public void delete(Integer primaryKey) {
        service.delete(primaryKey);
    }

  }