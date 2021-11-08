package com.example.aop_hw.entity;

import com.example.aop_hw.services.WhatToDo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Paraglider implements WhatToDo {
    boolean status = false;
    private final boolean engine = false;

    @Override
    public String getStatus() {
        if (!status) {
            System.out.println("Is Paraglider ready?");
            return "Not ready";
        } else
            System.out.println("Paraglider is ready!");
        return "Ready";
    }

    @Override
    public boolean isEngineExist() {
        return engine;
    }
}
