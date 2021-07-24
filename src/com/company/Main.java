package com.company;

import java.sql.Array;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isTrue = true;
        //Animal[] animals = new Animal[3];
        Cat cat = new Cat("Vasia", 2);
        Dog dog = new Dog("Pirat", 4);
        Horse horse = new Horse("Balya", 10);
        System.out.println("Введите дистанцию бега для марафона");
        Scanner sc = new Scanner(System.in);
        int distRun = checkCorrectInput();
        System.out.println("Введите высоту препятствия для марафона");
        int distJump = checkCorrectInput();
        System.out.println("Введите дистанцию заплыва для марафона");
        int distSwim = checkCorrectInput();
        boolean catResult = cat.marafon(distRun, distJump, distSwim);
        boolean dogResult = dog.marafon(distRun, distJump, distSwim);
        boolean horseResult = horse.marafon(distRun, distJump, distSwim);

            /*for (int i = 0; i < animals.length; i++) {
                if (animals[i].isOnDistance()) System.out.println("Победил " + animals[i].getName());
            }
            if (!animals[0].isOnDistance() && !animals[1].isOnDistance() && !animals[2].isOnDistance())
                System.out.println("Никто не дошел до финиша");*/
    }

    public static int checkCorrectInput() {
        boolean isCorrectValue = false;
        while (!isCorrectValue) {
            try {
                Scanner sc = new Scanner(System.in);
                if (sc.nextInt() > 0) {
                    isCorrectValue = true;
                } else {
                    System.out.println("Введено отрицательное значение. Повторите ввод.");
                }
            } catch (InputMismatchException exc) {
                System.out.println("Введено не целочисленное значение. Повторите ввод");
            }
        }
        return distSportDiscipline;
    }
}

