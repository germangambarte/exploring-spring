package com.gergambarte;

public class Developer {
    private int age;
    public Developer() {
        System.out.println("Developer created");
    }
    public void code(){
        System.out.println("Coding...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
