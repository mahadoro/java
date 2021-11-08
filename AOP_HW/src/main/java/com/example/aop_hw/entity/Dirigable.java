package com.example.aop_hw.entity;

import com.example.aop_hw.services.WhatToDo;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter

public class Dirigable implements WhatToDo {
    private final boolean engine = true;
    private int helium = 15;
    private  int max;

    @Override
    public String getStatus() {
        max = (int) (15 + Math.random() * 20);
        if(max != helium) {
            System.out.println("Is Dirigable ready?");
            System.out.println("We need " + max + " of helium");
            System.out.println("We have " + helium + " of helium");
            return "Not ready";
        }
        else {
            System.out.println("Dirigable is ready!");
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
