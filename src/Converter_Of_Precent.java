
import java.util.Scanner;

public class Converter_Of_Precent {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        int x =s.nextInt();
        System.out.println("Введите процент");
        int precent = s.nextInt();
        double precentFromNumber = (double)(x * precent)/100;
       System.out.println("Процент от числа  состовляет: " +precentFromNumber);


    }
}
