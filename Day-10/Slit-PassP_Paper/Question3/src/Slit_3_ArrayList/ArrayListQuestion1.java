package Slit_3_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListQuestion1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> oddArray = new ArrayList<>();

        System.out.println("Enter Number 0 to 10");

        int num;

        while(true){
            num = input.nextInt();
            if (num == 0){
                break;

            }

            oddArray.add(num);

        }

        for (int i = 0; i < oddArray.size(); i++) {

            if(oddArray.get(i) % 2 == 0){

                oddArray.remove(i);
                i--;
            }

        }

        System.out.println("Odd Numbers "+oddArray);




    }
}
