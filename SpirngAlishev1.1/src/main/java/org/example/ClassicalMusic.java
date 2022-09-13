package org.example;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class ClassicalMusic implements Music{

    public ClassicalMusic() {
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    @Override
    public String toString() {
        return "ClassicalMusic";
    }

    @PostConstruct
    public void init() {
        System.out.println("Classical music initialized...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Classical music destroyed...");
    }
}
