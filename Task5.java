import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
//        Во фразе "Добро пожаловать на курс по Java"
//        переставить слова в обратном порядке.
        String s = "Добро пожаловать на курс по Java";
        String[] rev = s.split(" ");
        System.out.println(Arrays.toString(rev));
        for (int i = rev.length - 1; i >= 0; i--) {
            System.out.print(rev[i] + " ");
        }
    }
}
