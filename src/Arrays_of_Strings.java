public class Arrays_of_Strings{
    public  static  void showArrays(){
        String[] strings = new String[3];
        strings[0] ="привет";
        strings[1] = "зая";
        strings[2] = "пока";
        for(int i = 0; i < strings.length; i++){
            System.out.println(strings[i]);
        }
        System.out.println();
        for(String string: strings){
            System.out.println(string);
        }
        System.out.println();
        for(String string:strings){
            System.out.println(string);
        }
        int[] numbers= {32,41,56};
        int sum =0;
        for(int number:numbers){//для каждого элемента number типа int в массиве numbers выполняется то что в теле цикла
            sum = sum +number;
        }
        System.out.println();
        System.out.println(sum);
    }
}
