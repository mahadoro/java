package com.example.aop_hw.aop;

import com.example.aop_hw.services.WhatToDo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspects {

    @Pointcut("execution(public * checkStatus(..))")
    private void revision() {

    }

    @Pointcut("execution(public * instruction(..))")
    private void instruction() {

    }

    @Pointcut("execution(public * isEngineExist(..))")
    private void pointcutWithEngine() {

    }

    @Before("instruction()")
    public void instructionAdvice() {
        System.out.println("Some work was done! Everything is ready!");
    }

    @AfterReturning(value = "pointcutWithEngine()", returning = "response")
    public void mechanicAfterAdvice(boolean response){
        if(response){
            System.out.println("With your engine everything is ok!");
        }
    }
    @AfterReturning(pointcut = "revision()", returning = "response")
    public void auditorAfterAdvice(Object response) {
        System.out.println("Status - " + response + ". Wait a moment!");
    }

    @Around("args(value0, value1, value2)")
    public void afterGetFuel(ProceedingJoinPoint point, WhatToDo value0, int value1, int value2) throws Throwable {
        if (value2 - value1 > 0) {
            System.out.println("Refueler loaded " + (value2 - value1) + " of fuel and now it's ready!");
        }
        point.proceed();
    }
}
