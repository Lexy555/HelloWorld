public class TestElka {
    public static void fullElka(int bradSize) {
        int starsCount = 1;
        int bradHeight = bradSize / 2;
        for (int line = 0; line < bradSize / 2; line++) {
            for (int spaces = bradHeight-1; spaces > 0; spaces--) {
                System.out.print(" ");
            }
            for (int stars = starsCount; stars > 0; stars--) {
                System.out.print("*");
            }
            starsCount = starsCount + 2;
            bradHeight--;
            System.out.println("");
        }
        System.out.println("Happy new year! Bitch!");

    }
}

