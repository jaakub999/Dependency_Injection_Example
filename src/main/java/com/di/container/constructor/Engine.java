package com.di.container.constructor;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    public void start() {
        System.out.println("Starting engine");
    }
}
