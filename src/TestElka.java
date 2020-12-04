public class TestElka {
    public  static  void fullElka(int elkaSize){
        int x = elkaSize;
        int a=1;
        int c = x/2;
        for (int i=0;i<x/2;i++){
            for(int b=c;b>0;b--){
                System.out.print(" ");
            }
            for (int d = a; d>0; d--){
                System.out.print("*");
            }
            a=a+2;
            c--;
            System.out.println();
        }


    }
    }


