package com.example.aop_hw.services;

import org.springframework.stereotype.Component;

@Component
public class Instructor {
    public boolean instruction(WhatToDo whatToDo) {
        return whatToDo.isEngineExist();
    }
}
