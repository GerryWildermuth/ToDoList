package com.practice.todolist.repository;

import com.practice.todolist.model.Listed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
* Generated by Springboot-3layer-Generator at 28.05.2021, 19:11:26
*/
@Repository
public interface ListedRepository extends JpaRepository<Listed, Integer> {

}