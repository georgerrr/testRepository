import java.util.Scanner;

public class bebrusFatale {

    public static void main(String[] args) {
        System.out.println("Введите возраст");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age < 18) {
            getOut();
        } else {
            welcome();
        }
    }

    public static void welcome() {
        System.out.println("Добро пожаловать");
    }

    public static void getOut() {
        System.out.println("Покиньте сайт");
    }
}
