public abstract class Animal {
    private String name;
    private int age;
    private String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (age < 0 && age > 35) System.out.println("Введено неверное значение");
        else System.out.println(age);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void printInfo(){
        System.out.println("Кличка: " + name + " возраст: " + age + " окраска " + color);
    }
    public abstract void voice();
    public abstract void run(int run);
    public abstract void jump(int jump);
    public abstract void swim(int swim);
}
