package com.company;

public class Cat extends Animal {
    /*private final int RUN_LIMIT = 1000;
    private final int JUMP_LIMIT = 2;
    private final int SWIM_LIMIT = 0;
    protected String name;
    private int age;
    protected String color;
    protected String animalType;
    protected String voice;
    protected int limitDistRun;
    protected int limitDistJump;
    protected int limitDistSwim;*/
private final int LIMIT_DIST_RUN = 1000;
    public Cat(String name, int age) {
        super(name, age);
        this.color = "red";
        this.animalType = "Cat";
        this.voice = "Maay";
        this.limitDistRun = 1000;
        this.limitDistJump =  2;
        this.limitDistSwim =  0;
        this.onDistance = true;
        printInfo();
    }

   /* public int getRUN_LIMIT() {
        return RUN_LIMIT;
    }

    public int getJUMP_LIMIT() {
        return JUMP_LIMIT;
    }

    public int getSWIM_LIMIT() {
        return SWIM_LIMIT;
    }
/* @Override
    public void voice() {
        System.out.println("Maaay");
    }

    @Override
    public void run(int run) {
        if (run > 0 && run <= 1000)
            System.out.println("Кот пробежал " + run + " м.");
        else if (run > 1000) System.out.println("Кот не пробежал " + run + " м.");
        else System.out.println("Ошибка!Введено отрицательное значение");
    }

    @Override
    public void jump(int jump) {
        if (jump > 0 && jump <= 2) System.out.println("Кот перепрыгнул " + jump + " м.");
        else if (jump > 2) System.out.println("Кот не перепрыгнул " + jump + " м.");
        else System.out.println("Ошибка!Введено отрицательное значение");
    }

    @Override
    public void swim(int swim) {
        if (swim <= 0) System.out.println("Ошибка!Введено отрицательное значение");
        else System.out.println("Коты не умеют плавать");
    }*/
}
