package net.vrakin;

public class BasicTasks {

    public static long factorial(int n) {
        long result = 1;
        for (int i = n; i >= 1; i--) {
            result *= i;
        }
        return result;
    }

    public static void printMultiplyTable(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d x %d = %d", n, i, n*i));
        }
    }

    public static void printRectangle(int height, int wide) {
        String single;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= wide; j++) {
                if ((Math.abs((i-1) - height) == height) || (Math.abs(i - height) == 0) ||
                        (Math.abs((j-1) - wide) == wide) || (Math.abs(j - wide) == 0)) {
                    single = "*";
                }else single = " ";
                System.out.print(single);
            }
            System.out.println();
        }
    }
}
