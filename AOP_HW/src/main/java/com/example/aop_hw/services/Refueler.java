package com.example.aop_hw.services;

import org.springframework.stereotype.Component;

@Component
public class Refueler {
    public void putGas(WhatToDo whatToDo, int levelNow, int maxLevel){
        whatToDo.putGas(maxLevel-levelNow);
    }
    public void putHelium(WhatToDo whatToDo, int levelOfHelium, int levelOfHeliumMax){
        whatToDo.putHelium(levelOfHeliumMax-levelOfHelium);
    }
}
