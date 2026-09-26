package com.montenegrosistemas.todos.controllers;


import com.montenegrosistemas.todos.domain.TodoEntity;
import com.montenegrosistemas.todos.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todos")
public class TodoController {


    private final TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    @PostMapping
    public TodoEntity salvar(@RequestBody TodoEntity todo){
     return this.service.salvar(todo);
    }

    @PutMapping("{id}")
    public void satualizarStatus(@PathVariable("id") Integer id, @RequestBody TodoEntity todo){
        todo.setId(id);
        this.service.atualizar(todo);
    }

    @GetMapping("{id}")
    public TodoEntity buscar(@PathVariable("id")Integer id){

      return  this.service.buscarId(id);

    }
}
