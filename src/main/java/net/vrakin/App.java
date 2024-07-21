package net.vrakin;

import java.util.Scanner;

/**
 * App for learning loops
 * Lecture #4
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello loops. Executing task is in tests" );
        boolean notExited = true;
        try(Scanner sc = new Scanner(System.in)) {
        while (notExited){
                System.out.println("Enter number task. Basic task (1-3), additional task (4-6) or 0 to exit: ");
                int task = sc.nextInt();
                switch (task){
                        case 0 -> notExited = false;
                        case 1 -> {
                            boolean condition = true;
                            while (condition){
                                System.out.println("Enter number for factorial between 4 and 16 or 0 to exit: ");
                                int value = sc.nextInt();
                                if ((value < 4 || value > 16) && (value!=0)){
                                    System.out.println("Invalid factorial entered. Please enter a number between 4 and 16.");
                                } else if (value == 0) {
                                    condition = false;
                                }else {
                                    System.out.printf("Found factorial: %d%n", BasicTasks.factorial(value));
                                }
                            }
                        }
                        case 2 -> {
                            boolean condition = true;
                            while (condition){
                                System.out.println("Enter number for print multiply table between 2 and 10 or 0 to exit: ");
                                int value = sc.nextInt();
                                if ((value < 2 || value > 10) && (value!=0)){
                                    System.out.println("Invalid value entered. Please enter a number between 2 and 10.");
                                } else if (value == 0) {
                                    condition = false;
                                }else {
                                    BasicTasks.printMultiplyTable(value);
                                }
                            }
                        }
                    case 3 -> {
                        boolean condition = true;
                        while (condition){
                            System.out.println("Enter wide of rectangle between 2 and 100: ");
                            int wide = sc.nextInt();
                            System.out.println("Enter height of rectangle between 2 and 50 or 0 to exit: ");
                            int height = sc.nextInt();

                            if ((height <= 2 || height > 100) && (height!=0)){
                                System.out.println("Invalid value height. Please enter a height between 2 and 100 or 0 to exit:");
                            } else if (height == 0) {
                                condition = false;
                            }else {
                                if ((wide <= 2 || wide > 50)){
                                    System.out.println("Invalid value entered. Please enter a number between 2 and 10 or 0 to exit:");
                                }else{
                                    BasicTasks.printRectangle(height, wide);
                                }
                            }
                        }
                    }
                    case 4, 5 -> {
                        boolean condition = true;
                        while (condition){
                            System.out.println("Enter number or 0 to exit: ");
                            int top = sc.nextInt();

                            if ((top!=0) && (task==4)){
                                AdditionalTasks.printMountain(top);
                            } else if(task==5){
                                AdditionalTasks.sandClock(top);
                            }else {
                                condition = false;
                            }
                        }
                    }
                    case 6 -> {
                        boolean condition = true;
                        while (condition){
                            System.out.println("Enter number or 0 to exit: ");
                            double number = sc.nextDouble();

                            if ((number!=0)){
                                System.out.println("Enter precision");
                                double pr = sc.nextDouble();
                                AdditionalTasks.sqrt(number, pr);
                            }else {
                                condition = false;
                            }
                        }
                    }
                    default -> {
                            System.out.println("Invalid task");
                            notExited = false;
                    }
                }
            }
        }
    }
}
