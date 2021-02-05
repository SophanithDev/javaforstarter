import java.util.Scanner;

class Chat {
    public static void main(String[] args) {
        int a = 4;
        int var;
        var = a;
        System.out.println("var using =:" + var);
        var = +a;
        System.out.println("var using=:" + var);
        var *= a;
        System.out.println("var using =:" + var);
    }
}

class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int number = input.nextInt();
        System.out.println("You entered:" + number);
        // Getting float input
        System.out.print("Enter float: ");
        float myFloat = input.nextFloat();
        System.out.println("Float entered = " + myFloat);

        // Getting double input
        System.out.print("Enter double: ");
        double myDouble = input.nextDouble();
        System.out.println("Double entered = " + myDouble);

        // Getting String input
        System.out.print("Enter text: ");
        String myString = input.next();
        System.out.println("Text entered = " + myString);
        input.close();
    }
}

class Block {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input Your Number:");
        int num = input.nextInt();
        if (num > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
    }
}

class Calculator {
    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.print("Choose an operator: +, -, *, or /: ");
        operator = input.next().charAt(0);

        // ask users to enter numbers
        System.out.print("Enter first number: ");
        number1 = input.nextDouble();

        System.out.println("Enter second number: ");
        number2 = input.nextDouble();

        switch (operator) {

            // performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.print(number1 + "+" + number2 + " = " + result);
                break;

            // performs subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.print(number1 + "-" + number2 + " = " + result);
                break;

            // performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.print(number1 + "*" + number2 + " = " + result);
                break;

            // performs division between numbers
            case '/':
                result = number1 / number2;
                System.out.print(number1 + "/" + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}

class Plu {
    public static void main(String[] args) {

        int sum = 0;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // take integer input from the user
        System.out.println("Enter a number");
        int number = input.nextInt();

        // while loop continues
        // until entered number is positive
        while (number >= 0) {
            // add only positive numbers
            sum += number;

            System.out.println("Enter a number");
            number = input.nextInt();
        }

        System.out.println("Sum = " + sum);
        input.close();
    }
}

// array in java
class Array {
    public static void main(String[] args) {

        // create an array
        int[] age = { 12, 4, 5 };

        // loop through the array
        // using for loop
        System.out.println("Using for Loop:");
        for (int i = 0; i < age.length; i++) {
            System.out.print(age[i]);
        }
    }
}

class Each {
    public static void main(String[] args) {
        int[] arr = { 23, 45, 65, 67, 56 };
        for (int a : arr) {
            System.out.println(a);
        }

    }
}

// 2d Array in java
class Multi {
    public static void main(String[] args) {
        int[][] darr = { { 1, 2, 3 }, { 6, 7, 8 }, { 7 } };
        for (int i = 0; i < darr.length; ++i) {
            for (int j = 0; j < darr[i].length; ++j) {
                System.out.println(darr[i][j]);
            }

        }
    }
}

// 3D Array in Java
class JavaArr {
    public static void main(String[] args) {
        int[][][] th = { { { 3, 5, 5 }, { 4, 6, 7 }, }, { { 8, -9, 1 }, { 7, 1, -2 }, { 21 } } };
        for (int i = 0; i < th.length; ++i) {
            for (int j = 0; j < th[i].length; ++j) {
                for (int k = 0; k < th[i][j].length; k++) {
                    System.out.println(th[i][j][k]);
                }
            }
        }
    }
}