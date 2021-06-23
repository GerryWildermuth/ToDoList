package com.practice.todolist.repository;

import com.practice.todolist.model.Step;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface StepRepository extends JpaRepository<Step, Integer> {


    @Query("SELECT s FROM Step s join fetch s.list WHERE  s.id = :id")
    Step getById(@Param("id") Integer id);
}
