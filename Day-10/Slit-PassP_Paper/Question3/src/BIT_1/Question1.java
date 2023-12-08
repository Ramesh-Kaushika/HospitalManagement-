package BIT_1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        int number2;
        int number3;

        System.out.println("EWnter Number 1");
        number = input.nextInt();
        System.out.println("EWnter Number 2");
        number2 = input.nextInt();
        System.out.println("EWnter Number 3'");
        number3 = input.nextInt();


        if (number > number2 && number > number3){

            System.out.println("number");
        }
        else if (number2 > number3){

            System.out.println(number2);

        }
        else {
            System.out.println(number3);
        }
    }
}
