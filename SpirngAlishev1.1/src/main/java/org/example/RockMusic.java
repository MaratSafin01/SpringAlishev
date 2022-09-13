package org.example;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

    @Override
    public String toString() {
        return "RockMusic";
    }

    @PostConstruct
    public void init() {
        System.out.println("Rock music initialized...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Rock music destroyed...");
    }
}
