public class Massiv {
    public static  void main(String[] args){
        int[] numbers = new int[8];
        for(int i=0; i<numbers.length; i++){
            numbers[i]=i*5;
        }
        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers [i]);
        }
        System.out.println("Another way");
        int[] sasha={5,10,4,7};
        for(int i = 0; i < sasha.length; i++){
            System.out.println(sasha[i]);
        }
    }
}
