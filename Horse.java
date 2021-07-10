public class Horse extends Animal {
    public Horse(String name, int age, String color) {
        super(name, age, color);
    }

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
    }
}
