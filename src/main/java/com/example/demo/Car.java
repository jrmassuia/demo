package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("carBean")
public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("iniciando carro");
    }

    @Override
    public void stop() {
        System.out.println("parando carro");
    }
}
