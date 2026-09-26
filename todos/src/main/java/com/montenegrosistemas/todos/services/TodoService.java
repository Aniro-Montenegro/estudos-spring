package com.montenegrosistemas.todos.services;


import com.montenegrosistemas.todos.components.MailSender;
import com.montenegrosistemas.todos.domain.TodoEntity;
import com.montenegrosistemas.todos.repositories.TodoRepository;
import com.montenegrosistemas.todos.validators.TodoValidator;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    public TodoRepository repository;
    private TodoValidator validator;
    private MailSender mailSender;


    public TodoService(TodoRepository repository,TodoValidator validator,MailSender mailSender) {
        this.repository = repository;
        this.validator=validator;
        this.mailSender=mailSender;
    }

    public TodoEntity salvar(TodoEntity novoTodo){
        validator.validar(novoTodo);
        return repository.save(novoTodo);
    }
    public void atualizar(TodoEntity todo){

         repository.save(todo);
         String  status= todo.getConcluido()== Boolean.TRUE ?  " foi concluido" : " não foi concluido";
         mailSender.enviar("Todo de codigo: "+ todo.getDescricao() + status);
    }

    public TodoEntity buscarId(Integer id) {
        return repository.findById(id)
                .orElse(null);
    }
}
