package com.example.aop_hw.services;

public interface WhatToDo {

    String getStatus();
     default void putGas(int gas) {}
    default void putHelium(int helium) {}
    boolean isEngineExist();

}
