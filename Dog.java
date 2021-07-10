public class Dog extends Animal {
    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

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
    }
}
