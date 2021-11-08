package com.example.aop_hw.entity;

import com.example.aop_hw.services.WhatToDo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class Balloon implements WhatToDo {
    private final boolean engine = false;
    private int helium = 10;
    private int max;

    @Override
    public String getStatus() {
        max = (int) (10 + Math.random() * 20);
        if (max != helium) {
            System.out.println("Is Balloon ready?");
            System.out.println("We need " + max + " of helium");
            System.out.println("We have " + helium + " of helium");
            return "Not ready";
        } else {
            System.out.println("Balloon is ready!");
            return "Ready";
        }
    }


    @Override
    public void putHelium(int helium) {
        this.helium = helium;
    }

    @Override
    public boolean isEngineExist() {
        return engine;
    }

}
