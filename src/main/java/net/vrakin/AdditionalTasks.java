package net.vrakin;

/**
 * App
 */

public class AdditionalTasks {
/*
    public static void printMountain(int top){
        System.out.println("Mountain");
        int halfTop = top/2;
        for(int i=0; i<=top; i++){
            int differenceCounterHalfTop = Math.abs(i - halfTop);
            int countStart = Math.abs(differenceCounterHalfTop - halfTop) + 1;

            for(int j=0; j<countStart; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
*/
    public static void printMountain(int top){
        System.out.println("Mountain");
        int wholeStarts = top*top;
        int rowCounterStarts = 0;
        int countStartsInRow = 1;
        int levelRow = 1;
        for(int i=0; i< wholeStarts; i++){
            rowCounterStarts++;
            System.out.print("*");
            if (countStartsInRow == rowCounterStarts){
                System.out.println();
                levelRow++;
                if (levelRow < top) countStartsInRow = levelRow;
                else {
                    countStartsInRow = top - Math.abs(top - levelRow);
                }
                rowCounterStarts = 0;
            }
        }
    }
    public static void sandClock(int wide){
        System.out.println("Sand Clock");
        for(int i=0; i<wide; i++){
            int halfWide = wide/2;
            int differenceCounterHalfWide = Math.abs(i - halfWide);
            int beginSpace = Math.abs(differenceCounterHalfWide - halfWide);
            int endSpace = beginSpace + (wide - beginSpace*2);
            for(int j=0; j<=wide; j++){
                char start = ' ';
                if ((j >= beginSpace) &&
                        (j < endSpace)) {
                    start = '*';
                }
                System.out.print(start);
            }
            System.out.println();
        }
    }

    public static void sqrt(double number, double e){
        double x0 = number;
        double a = number;
        double d = e;
        double x1 = 0.0;
         do {
            x1 = 0.5D * (x0 + a / x0);
            d = Math.abs(x0-x1);
            x0 = x1;
        }while((d>=2*e) && (d*d>=2*e));

        System.out.println(x1);
    }
}
