package com.di.container.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Phone {
    private Battery battery;

    public void plugIn() {
        battery.charge();
    }

    @Autowired
    public void setBattery(Battery battery) {
        this.battery = battery;
    }
}