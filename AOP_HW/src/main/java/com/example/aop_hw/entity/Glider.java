package com.example.aop_hw.entity;

import com.example.aop_hw.services.WhatToDo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Glider implements WhatToDo {
    boolean status = false;
    private final boolean engine = false;

    @Override
    public String getStatus() {
        if (!status) {
            System.out.println("Is Glider ready?");
            return "Not ready";
        }
        else
            System.out.println("Glider is ready!");
            return "Ready";
    }


    @Override
    public boolean isEngineExist() {
        return engine;
    }
}
