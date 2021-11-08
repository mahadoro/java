package com.example.aop_hw.services;

import org.springframework.stereotype.Component;

@Component
public class Mechanic {
    public boolean check(WhatToDo whatToDo){
        return whatToDo.isEngineExist();
    }
}
