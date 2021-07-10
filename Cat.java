public class Cat extends Animal {
    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
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
    }
}

