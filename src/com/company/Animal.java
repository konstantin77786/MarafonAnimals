package com.company;

public class Animal {
    protected String name;
    private int age;
    protected String color;
    protected String voice;
    protected String animalType;
    protected int limitDistRun;
    protected int limitDistJump;
    protected int limitDistSwim;
    protected boolean onDistance;

    public String getName() {
        return name;
    }

    public boolean isOnDistance() {
        return onDistance;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (age < 0 && age > 35) System.out.println("Введено неверное значение");
        else System.out.println(age);
    }

    public void printInfo() {
        System.out.println("Тип животного " + animalType + " Кличка: " + name + " возраст: " + age + " окраска " + color + " издаваемый звук " + voice);
    }

    public void run(int distRun) {
        if (distRun <= limitDistRun)
            System.out.println(animalType + " " + name + " пробежал " + distRun + " м.");
        else {
            onDistance = false;
            System.out.println(animalType + " " + name + " не пробежал " + distRun + " м.");
        }
    }

    public void jump(int distJump) {
        if (distJump <= limitDistJump)
            System.out.println(animalType + " " + name + " перепрыгнул " + distJump + " м.");
        else {
            onDistance = false;
            System.out.println(animalType + " " + name + " не перепрыгнул " + distJump + " м.");
        }
    }

    public void swim(int distSwim) {
        if (distSwim <= limitDistSwim) System.out.println(animalType + " " + name + " проплыл " + distSwim + " м.");
        else {
            onDistance = false;
            System.out.println(animalType + " " + name + " не проплыл " + distSwim + " м.");
        }
    }
    public boolean marafon(int distRun, int distJump, int distSwim){
        run(distRun);
        if (!onDistance){
            return onDistance;
        }
        jump(distJump);
        if (!onDistance){
            return onDistance;
        }
        swim(distSwim);
            return onDistance;
    }
}



