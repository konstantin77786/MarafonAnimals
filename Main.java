import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal[] Array = new Animal[3];
        Array[0] = new Cat("Vasia", 2, "black");
        Array[1] = new Dog("Pirat", 4, "brown");
        Array[2] = new Horse("Balya", 10, "white");
        Array[0].printInfo();
        Array[1].printInfo();
        Array[2].printInfo();
        Array[0].voice();
        Array[1].voice();
        Array[2].voice();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дистанцию бега для марафона");
        int r = sc.nextInt();
        System.out.println("Введите высоту препятствия для марафона");
        int j = sc.nextInt();
        System.out.println("Введите дистанцию заплыва для марафона");
        int k = sc.nextInt();
        if (r <= 1000 && j <= 1 && k > 0) {
            for (int i = 0; i < Array.length; i++) {
                Array[i].run(r);
                Array[i].jump(j);
                Array[i].swim(k);
                System.out.println();
            }
        }
        if (r > 1000 && r <= 10000 && j <= 1 && k > 0) {
            for (int i = 1; i < Array.length; i++) {
                Array[i].run(r);
                Array[i].jump(j);
                Array[i].swim(k);
                System.out.println();
            }
        }
        if (r <= 1000 && j > 1 && j <= 4 && k > 0) {
            for (int i = 0; i < Array.length; i++) {
                if (i == 1) continue;
                Array[i].run(r);
                Array[i].jump(j);
                Array[i].swim(k);
                System.out.println();
            }
        }
        if (r > 1000 && r <= 10000 && j > 2 && j <= 4 && k > 0) {
            for (int i = 2; i < Array.length; i++) {
                Array[i].run(r);
                Array[i].jump(j);
                Array[i].swim(k);
                System.out.println();
            }
        }
        if (r > 10000 || j > 4) System.out.println("Никто не дошел до финиша");
    }
}
