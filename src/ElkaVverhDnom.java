public class ElkaVverhDnom {
    public static void getPerevertisheEl(){
        int x=10;
        int number=x/2;
        int a=9;
        for(int i =0; i<x/2;i++){
            for (int b=number;b>0;b--){
                System.out.print(" ");
            }
            for(int d=a;d>0;d--){
                System.out.print("*");
            }
            a= a-2;
            number++;
            System.out.println();
        }

    }
}
