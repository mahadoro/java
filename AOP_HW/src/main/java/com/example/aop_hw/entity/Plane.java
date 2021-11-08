package com.example.aop_hw.entity;

import com.example.aop_hw.services.WhatToDo;
import org.springframework.stereotype.Component;

@Component

public class Plane implements WhatToDo {
    private final boolean engine = true;
    private int gas = 10;
    private int max;

    @Override
    public String getStatus() {
        max = (int) (10 + Math.random() * 20);
        if (max != gas) {
            System.out.println("Is Plane ready?");
            System.out.println("We need " + max + " of gas");
            System.out.println("We have " + gas + " of gas");
            return "Not ready";
        } else {
            System.out.println("Plane is ready!");
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

    public boolean isEngine() {
        return engine;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public int getMax() {
        return max;
    }
}
