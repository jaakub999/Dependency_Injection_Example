package com.di.container.interf;

import org.springframework.stereotype.Component;

@Component
public class Intel implements Processor {
    @Override
    public int calculate(int x, int y) {
        var result = x + y;
        System.out.print("Intel Processor is doing something\nResult: ");
        System.out.println(result);
        return result;
    }
}