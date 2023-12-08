package BIT_3;

import java.text.DecimalFormat;

public class Question3 {


    public static void main(String[] args) {

        {

            double miles = 26.1114756856;

            System.out.println(miles);
            double d = 2.34568;
            DecimalFormat f = new DecimalFormat("##.00");
            System.out.println(f.format(miles));

            float radius = 5;
            float PI = 3.14F;

            float areaOfCircle = PI * (radius * radius);

            System.out.println(areaOfCircle);
            System.out.println();

            float p = 100.00f;
            float r = 5 / 100;
            System.out.println(r);

            System.out.println();

            float a = (float) 5 / 100;
            System.out.println(a);


            float t = 1f;
            float i = p * r * t;

            System.out.println(i);
            System.out.println();

        }
        {

            int t = 1;

            while (t <= 10) {
                System.out.println(t);
                t++;
            }
        }

        int month = 2;

        switch (month){

            case 1 :

                System.out.println("Jnuary");
                break;
            case 2 :
                System.out.println("Feb");
                break;
            case 3 :

                System.out.println("March");
                break;
            default:
                System.out.println("not match");
                break;



        }

        int num1 = 1;
        int num2 = 7;

        if (num1 > num2){

            System.out.println("Max Value"+num1);

        }
        else {
            System.out.println("Max Value"+num2);
        }

        int value =;

        System.out.println(value);

    }

}
