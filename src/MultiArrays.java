public class MultiArrays {
        public  static  void GetNumbersFromArrays(){
            int[] [] matrice = {{1,2,3},
                                {6,9,5},
                                {8,4,7}};
            System.out.println(matrice [1] [0]);
            System.out.println(matrice [1] [2]);
            System.out.println(matrice [2] [2]);
            System.out.println(matrice [1] [1]);
            System.out.println((matrice [0][2]));
        }

    public  static  void getNumbersFromArraysByIndex(int x, int y){
                  int[] [] matrice = {{1,2,3},
                                      {6,9,5},
                                      {8,4,7}};
              System.out.println(matrice [x] [y]);
    }

    }

