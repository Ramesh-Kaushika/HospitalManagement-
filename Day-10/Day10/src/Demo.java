import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

      //  System.out.println("Enter Students");
       // int numOfStudents = input.nextInt();

        System.out.println("Enter Studenr Name");
        String fullName = input.next();

        System.out.println("Enter Studenr Address");
        String address = input.next();

        System.out.println("Enter Number of Subject");
        int numOfSubject = input.nextInt();

        int [] marks = new int[numOfSubject];

        for (int i = 0; i < numOfSubject; i++) {

            System.out.print("Enter Subject " + (1+i) + "marks : ");
             marks[i] = input.nextInt();

        }

        System.out.println();

        System.out.println("A. Show Student Details.");
        System.out.println("B. Show All Marks.");
        System.out.println("C. Show Result.");

        System.out.println();

        System.out.println("Enter Letter Option");
        String letter = input.next();

        Student s1 = new Student();

        switch(letter){


              case "A" :
                    s1.printDetails(fullName,address);
                break;

            case "B" :
                s1.printDetails(fullName,address);
                    s1.printAllMarks(marks);
                break;

            case "C" :
                s1.CalculateAvg(marks);
                break;

            default:
                System.out.println("Wrong Letter");
                break;





        }









    }
}