package com.assignment.todo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.todo.model.ToDo;
import com.assignment.todo.repository.ToDoRepository;
import java.util.List;

@Service
public class ToDoService {

        @Autowired
            ToDoRepository tdRepository; 
     // CREATE 
        public ToDo createToDo(ToDo td) {
            return tdRepository.save(td);
        }

        // READ
        public List<ToDo> getToDo() {
            return tdRepository.findAll();
        }

        // DELETE
        public void deleteToDo(Long todo_ID) {
        	tdRepository.deleteById(todo_ID);
        }
        
     // UPDATE
        public ToDo updateTodo(Long todo_ID, ToDo todoDetails) {
        	ToDo emp = tdRepository.findById(todo_ID).get();
                emp.setTodo_name(todoDetails.getTodo_name());
                emp.setIsChecked(todoDetails.getIsChecked());
                emp.setId(todoDetails.getId());
                
                return tdRepository.save(emp);                                
        }
}