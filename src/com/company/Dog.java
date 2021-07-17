package com.company;

public class Dog extends Animal {
   /* private final int RUN_LIMIT = 2000;
    private final int JUMP_LIMIT = 1;
    private final int SWIM_LIMIT = 1000;*/

    public Dog(String name, int age) {
        super(name, age);
        this.color = "brown";
        this.animalType = "Dog";
        this.voice = "gav-gav";
        this.limitDistRun = 2000;
        this.limitDistJump = 1;
        this.limitDistSwim = 500;
        this.onDistance = true;
        printInfo();
    }
/*
    @Override
    public void voice() {
        System.out.println("Gav");
    }

    @Override
    public void run(int run) {
        if (run > 0 && run <= 2000)
            System.out.println("Собака пробежала " + run + " м.");
        else if (run > 2000) System.out.println("Собака не пробежала " + run + " м.");
        else System.out.println("Ошибка!Введено отрицательное значение");
    }

    @Override
    public void jump(int jump) {
        if (jump > 0 && jump <= 1) System.out.println("Собака перепрыгнула " + jump + " м.");
        else if (jump > 1) System.out.println("Собака не перепрыгнула " + jump + " м.");
        else System.out.println("Ошибка!Введено отрицательное значение");
    }

    @Override
    public void swim(int swim) {
        if (swim <= 0) System.out.println("Ошибка!Введено отрицательное значение");
        else System.out.println("Собака проплыла " + swim + " м.");
    }*/
}
