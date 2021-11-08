package com.example.aop_hw.entity;

import com.example.aop_hw.services.WhatToDo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Helicopter implements WhatToDo {
    private final boolean engine = true;
    private int gas = 15;
    private int max;

    @Override
    public String getStatus() {
        max = (int) (15 + Math.random() * 25);
        ;
        if (max != gas) {
            System.out.println("Is Helicopter ready?");
            System.out.println("We need " + max + " of gas");
            System.out.println("We have " + gas + " of gas");
            return "Not ready";
        } else {
            System.out.println("Helicopter is ready!");
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
