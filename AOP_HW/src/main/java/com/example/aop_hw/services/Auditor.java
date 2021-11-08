package com.example.aop_hw.services;


import org.springframework.stereotype.Component;

@Component
public class Auditor {
    public String checkStatus(WhatToDo whatToDo) {
        if (whatToDo.getStatus().equals("Not ready")) {
            return "false";
        } else
            return "true";
    }
}
