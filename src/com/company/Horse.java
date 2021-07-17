package com.company;

public class Horse extends Animal {
    /*private final int RUN_LIMIT = 10000;
    private final int JUMP_LIMIT = 4;
    private final int SWIM_LIMIT = 2000;*/

    public Horse(String name, int age) {
        super(name, age);
        this.color = "white";
        this.animalType = "Horse";
        this.voice = "igo-go";
        this.limitDistRun = 10000;
        this.limitDistJump = 4;
        this.limitDistSwim = 2000;
        this.onDistance = true;
        printInfo();
    }
/*
    @Override
    public void voice() {
        System.out.println("Igo-go");
    }

    @Override
    public void run(int run) {
        if (run > 0 && run <= 10000)
            System.out.println("Лошадь пробежала " + run + " м.");
        else if (run > 10000) System.out.println("Лошадь не пробежала " + run + " м.");
        else System.out.println("Ошибка!Введено отрицательное значение");
    }

    @Override
    public void jump(int jump) {
        if (jump > 0 && jump <= 4) System.out.println("Лошадь перепрыгнула " + jump + " м.");
        else if (jump > 4) System.out.println("Лошадь не перепрыгнула " + jump + " м.");
        else System.out.println("Ошибка!Введено отрицательное значение");
    }

    @Override
    public void swim(int swim) {
        if (swim <= 0) System.out.println("Ошибка!Введено отрицательное значение");
        else System.out.println("Лошадь проплыла " + swim + " м.");
    }*/
}
