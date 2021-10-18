public class Homework2 {

    public static void main(String[] args) {
        System.out.println(checkSum(4 , 6));
        isPositiveOrNegative(6);
        System.out.println(PositiveOrNegative(5));
        printString("World", 5);
    }

    public static boolean checkSum(int a, int b) {

        if ((a + b) >= 10 && ( a+ b) <= 20) {
          return true;
        } else {
            return false;
        }
    }
    public static void isPositiveOrNegative ( int a) {

        if ( a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
        public static boolean PositiveOrNegative (int a) {
        if (a >= 0) {
            return true; }
        else {
            return false; }
        }

        public static void printString ( String word , int i) {

        for (i = 0; i < 5; i++ ) {
            System.out.print(word);
            System.out.println();
        }

        }


        }

