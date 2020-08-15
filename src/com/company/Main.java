package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);                             // . Creating an instance of the scanner class, so we can get the input from the user
        int counter = 1;                                                      // . Creating the variables counter and sum to use in the loop
        int sum = 0;


        while (counter <= 10) {                                               // . Creating a while loop that allows us to get the numbers of input we want.

            System.out.println("Enter number #" + counter + ":");
            boolean isAnInt = scanner.hasNextInt();                           // . Using the boolean var to check if the value inserted by the user is the datatype we want, in this case int. (thanks to the class .hasNextInt() that checks the next input is the datatype we specify.

            if (isAnInt) {                                                    // . Checking if is the datatype we want

                int value = scanner.nextInt();
                sum += value;
                counter++;

            }else{

                System.out.println("Invalid Value");
            }

            scanner.nextLine();
        }

        System.out.println(sum);
        scanner.close();
    }
}
