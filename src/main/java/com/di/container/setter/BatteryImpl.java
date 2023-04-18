package com.di.container.setter;

import org.springframework.stereotype.Component;

@Component
public class BatteryImpl implements Battery {
    @Override
    public void charge() {
        System.out.println("Battery charging");
    }
}