package com.dev.marcos.spring_async.services;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Async //Define que este método será assíncrono
    public void execute() throws InterruptedException {
        System.out.println("Iniciando método");
        Thread.sleep(2000);
        System.out.println("Finalizando método");

        /**
         * Lançara uma exceção e na nossa classe de configuração 
         * será possível visualizar a exceção lançada
         **/
        System.out.println(2/0); 
    }
    
}
