package com.gergambarte;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Developer {
    private int age;
    @Autowired
    @Qualifier("desktop")
    private Computer com;

    public Developer() {
        System.out.println("Developer created");
    }

    public Developer(int age, Computer com) {
        this.age = age;
        this.com = com;
        System.out.println("Developer created");
    }

    public void code() {
        System.out.println("Coding...");
        com.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer lap) {
        this.com = lap;
    }

}
