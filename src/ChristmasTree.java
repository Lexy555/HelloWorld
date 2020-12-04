public class ChristmasTree {
    public static void drawElka() {
        int lenght = 9;
        int a = 1;

        // Рисуем линию
        for (int i = 0; i < (lenght+1)/2; i++) {

            // Рисуем Прол
            for (int c = lenght/2; c > 0; c--) {
                System.out.print(" ");
            }

            for (int b = a; b > 0; b--) {
                System.out.print("*");

            }

            a+=2;
            System.out.println();

        }
    }
}
