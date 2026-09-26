package com.montenegrosistemas.todos.repositories;

import com.montenegrosistemas.todos.domain.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {
}
