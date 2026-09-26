package com.montenegrosistemas.todos.components;

import org.springframework.stereotype.Component;

@Component
public class MailSender {



    public void enviar(String menasagem){
        System.out.println("Enviado email "+menasagem);
    }


}
