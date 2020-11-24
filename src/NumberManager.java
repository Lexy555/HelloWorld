import java.util.Scanner;

public class NumberManager {
    public static void tellIfEvenOrOdd(){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        int x = s.nextInt();
        int rest = 0;
        int sum = 0;
        int chet = 0;
        int nechet = 0;
        while (x != 0) {
            rest = x % 10;
            x /= 10;
            if (rest % 2 == 0) {
                System.out.println(rest + "  Число четное");
                chet++;
            } else {
                nechet++;
                sum += rest;
                System.out.println(rest + " Число нечетное");
            }

        }
        System.out.println(sum+ "Сумма нечетных цифр");
    }
}
