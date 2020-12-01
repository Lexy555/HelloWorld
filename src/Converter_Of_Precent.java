
import java.util.Scanner;

public class Converter_Of_Precent {
    public static void countPrecents(){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        int x =s.nextInt();
        System.out.println("Введите процент");
        int precent = s.nextInt();
        int precentFromNumber =(x * precent)/100;
       System.out.println("Процент от числа  состовляет: " +precentFromNumber);


    }
}
