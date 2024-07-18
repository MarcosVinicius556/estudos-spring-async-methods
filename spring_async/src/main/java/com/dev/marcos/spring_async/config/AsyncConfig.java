package com.dev.marcos.spring_async.config;

import java.lang.reflect.Method;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;

/**
 * Aqui criamos uma classe para configurar e tratar os erros que podem 
 * ocorrer em métodos que funcionam de forma assíncrona
 */
@Configuration
public class AsyncConfig extends AsyncConfigurerSupport {

    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return new AsyncUncaughtExceptionHandler() {

            @Override
            public void handleUncaughtException(Throwable ex, Method method, Object... params) {
                System.out.println("Error " + ex.getMessage());
                System.out.println("method " + method.getName());
            }
            
        };
    }
    
}
