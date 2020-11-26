import java.util.Scanner;
public class SummOfnumbersAndPosition {

public static void main(String[] args){
    Scanner s = new Scanner (System.in);
    System.out.println("Введите число");
    int x;
    int sum = 0;
    int n = 3;
    int max = 0;
    int position = 1;
    for(int i= 1; i<=n; i++){
        x =s.nextInt();
        sum =0;
        while (x>0){
            sum+=x%10;
            x/=10;
        }
        System.out.println("Cумма цифр числа -  " + sum + " порядковый номер -  " + i);
       if ( sum>max){
           max = sum;
           position = i;

       }
    }
   System.out.println("Порядковый номер числа с самой большим количеством цифр- " + position);

}
}
