package com.example.aop_hw;

import com.example.aop_hw.entity.*;
import com.example.aop_hw.services.Auditor;
import com.example.aop_hw.services.Instructor;
import com.example.aop_hw.services.Mechanic;
import com.example.aop_hw.services.Refueler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AopHwApplication {

    public static void main(String[] args) {
        SpringApplication.run(AopHwApplication.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.example.aop_hw");

        Auditor auditor = (Auditor) context.getBean("auditor");
        Mechanic mechanic = (Mechanic) context.getBean("mechanic");
        Refueler refueler = (Refueler) context.getBean("refueler");
        Instructor instructor = (Instructor) context.getBean("instructor");

        Plane plane = (Plane) context.getBean("plane");
        Helicopter helicopter = (Helicopter) context.getBean("helicopter");
        MotorHangGlider motorHangGlider = (MotorHangGlider) context.getBean("motorHangGlider");
        Glider glider = (Glider) context.getBean("glider");
        Paraglider paraglider = (Paraglider) context.getBean("paraglider");
        Balloon balloon = (Balloon) context.getBean("balloon");
        Dirigable dirigable = (Dirigable) context.getBean("dirigable");

        System.out.println("PLANE STATUS");
        auditor.checkStatus(plane);
        mechanic.check(plane);
        refueler.putGas(plane, plane.getGas(), plane.getMax());
        System.out.println("");

        System.out.println("HELICOPTER STATUS");
        auditor.checkStatus(helicopter);
        mechanic.check(helicopter);
        refueler.putGas(helicopter, helicopter.getGas(), helicopter.getMax());
        System.out.println("");

        System.out.println("GLIDER STATUS");
        auditor.checkStatus(glider);
        instructor.instruction(glider);
        System.out.println("");

        System.out.println("MOTOR HANG GLIDER STATUS");
        auditor.checkStatus(motorHangGlider);
        mechanic.check(motorHangGlider);
        refueler.putGas(motorHangGlider, motorHangGlider.getGas(), motorHangGlider.getMax());
        System.out.println("");

        System.out.println("PARAGLIDER STATUS");
        auditor.checkStatus(paraglider);
        instructor.instruction(paraglider);
        System.out.println("");

        System.out.println("DIRIGABLE STATUS");
        auditor.checkStatus(dirigable);
        mechanic.check(dirigable);
        refueler.putHelium(dirigable, dirigable.getHelium(), dirigable.getMax());
        System.out.println("");

        System.out.println("BALLOON STATUS");
        auditor.checkStatus(balloon);
        mechanic.check(balloon);
        refueler.putHelium(balloon, balloon.getHelium(), balloon.getMax());

    }
}
