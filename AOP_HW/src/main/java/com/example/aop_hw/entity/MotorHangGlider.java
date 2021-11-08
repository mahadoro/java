package com.example.aop_hw.entity;

import com.example.aop_hw.services.WhatToDo;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class MotorHangGlider implements WhatToDo {
    private final boolean engine = true;
    private int gas = 11;
    private int max;

    @Override
    public String getStatus() {
        max = (int) (11 + Math.random() * 20);
        if (max != gas) {
            System.out.println("Is MotorHangGlider ready?");
            System.out.println("We need " + max + " of gas");
            System.out.println("We have " + gas + " of gas");
            return "Not ready";
        } else {
            System.out.println("MotorHangGlider is ready!");
            return "Ready";
        }
    }

    @Override
    public void putGas(int gas) {
        this.gas = gas;
    }

    @Override
    public boolean isEngineExist() {
        return engine;
    }
}
