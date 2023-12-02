import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner isScanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = isScanner.next();
        System.out.printf("Привет, %s!", name);
    }
}
