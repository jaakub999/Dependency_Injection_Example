package com.di.container.interf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Computer {

    @Autowired
    private Processor processor;

    public void start() {
        processor.calculate(9, 6);
    }
}
