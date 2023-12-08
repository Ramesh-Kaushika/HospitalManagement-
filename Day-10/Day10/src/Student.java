public class Student {



    public void printDetails(String fullName,String address){



        System.out.println("Student Name : " +fullName);
        System.out.println("Student Address : " +address);

    }

    public void printAllMarks(int [] marks){

        System.out.println("Student marks : [ ");
        for (int i = 0; i < marks.length; i++) {

            System.out.print(marks[i]+" ");

        }
        System.out.println("]");

    }

    public void CalculateAvg( int [] marks){

        int total=0;
        for (int i = 0; i < marks.length; i++) {

            total = total + marks[i];


        }

        double average = (double) total / marks.length;

            if (average >= 50){

                System.out.println("Passed");
            }
            else {

            System.out.println("Fail");
        }


    }


}
