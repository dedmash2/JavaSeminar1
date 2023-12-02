import java.time.LocalTime;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
//        В консоли запросить имя пользователя.
//        В зависимости от текущего времени, вывести приветствие вида
//        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
        Scanner isScanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = isScanner.next();
        //System.currentTimeMillis();
        LocalTime time = LocalTime.now();
        if (time.isAfter(LocalTime.of(6,0)) && time.isBefore(LocalTime.of(18,0))) {
            System.out.println("Добрый день, " + name);
        } else  {
            System.out.println("Добрый вечер, " + name);
        }
    }
}
