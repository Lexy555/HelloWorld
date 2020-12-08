public class LetterV {
    public static void drawPattern(int height) {
        // TODO Auto-generated method stub
        int end = height * 2;
        int j = 0;
        for (int start = 0; start < height; start++, end--) {
            for (j = 0; j < start; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (; j < end; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

    }

    // IVAN'S CRAPCODE:
    public static void drawV(int size) {
        int originalLength = size;
        int remainingLines = size;
        for (int lineNbr = 1; lineNbr <= originalLength; lineNbr++) {
            //spaces
            for (int spaces = lineNbr - 1; spaces > 0; spaces--) {
                System.out.print(" ");
            }
            // Fist Star
            System.out.print("*");
            //spaces
            for (int spaces = remainingLines*2+1; spaces > 0; spaces--) {
                System.out.print(" ");
            }
            // Second Star
            System.out.print("*\n");
            remainingLines--;

        }
        // last row
        for (int spaces = originalLength+1; spaces > 0; spaces--) {
            System.out.print(" ");
        }
        System.out.println("*");
    }

}