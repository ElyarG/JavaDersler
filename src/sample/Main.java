package sample;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number: ");

        double enterNumber = scanner.nextDouble();
//boolean isDivisibleBy20 = number % 20 == 0;
        if ( enterNumber % 3 == 0 && enterNumber % 5 == 0)
            System.out.println("fizzbuzz");
        else if (enterNumber % 5 == 0)
            System.out.println("buzz");
        else if (enterNumber % 3 == 0)
            System.out.println("fizz");

        else
            System.out.println((int)enterNumber);

    }


}
