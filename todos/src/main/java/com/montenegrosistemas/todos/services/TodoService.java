package com.montenegrosistemas.todos.services;


import com.montenegrosistemas.todos.domain.TodoEntity;
import com.montenegrosistemas.todos.repositories.TodoRepository;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    public TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public TodoEntity salvar(TodoEntity novoTodo){

        return repository.save(novoTodo);
    }
    public TodoEntity atualizar(TodoEntity novoTodo){

        return repository.save(novoTodo);
    }

    public TodoEntity buscarId(Integer id) {
        return repository.findById(id)
                .orElse(null);
    }
}
