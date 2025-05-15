package com.gergambarte;

public class Developer {
    private int age;
    private Laptop lap;

    public Developer() {
        System.out.println("Developer created");
    }

    public void code() {
        System.out.println("Coding...");
        lap.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }
}
