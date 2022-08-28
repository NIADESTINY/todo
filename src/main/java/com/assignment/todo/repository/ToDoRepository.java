
package com.assignment.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.todo.model.ToDo;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Long> {

}