
package com.assignment.todo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todo")
public class ToDo {
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="todo_ID")
            private Long id;
        
        @Column(name="todo_name")
        private String todo_name;
        
        @Column(name="IsChecked")
        private Boolean IsChecked;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTodo_name() {
			return todo_name;
		}

		public void setTodo_name(String todo_name) {
			this.todo_name = todo_name;
		}

		public Boolean getIsChecked() {
			return IsChecked;
		}

		public void setIsChecked(Boolean IsChecked) {
			this.IsChecked = IsChecked;
		}
        
        
}
