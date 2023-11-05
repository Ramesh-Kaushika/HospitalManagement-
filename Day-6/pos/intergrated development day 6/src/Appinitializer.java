import java.util.Arrays;
import java.util.Scanner;


public class Appinitializer {


    public static int printQuestions(String[] questions,Scanner input){
        System.out.println("Select Your Option....");
        for (String tempQuestion:questions
        ) {
            System.out.println(tempQuestion);
        }




        int answerNumber = input.nextInt();
        if (answerNumber<=0){
            System.out.println("Wrong input & try again!");
            System.exit(0);
        }
        return answerNumber-1;
    }
    public static void addCustomer(String[][] customers, Scanner input){//10
        boolean addStatus=true;
        input.nextLine();
        while(addStatus){


            if (customers[customers.length-1][0]!=null){
                System.out.println("Database is full!");
                break;
            }




            outer: for (int i = 0; i < customers.length; i++) {
                inner: for (int j = 0; j < customers[i].length; j++) {
                    if (customers[i][j]==null){
                        System.out.println("Insert Nic");
                        customers[i][0]=input.nextLine();


                        System.out.println("Insert Name");
                        customers[i][1]=input.nextLine();


                        System.out.println("Insert Address");
                        customers[i][2]=input.nextLine();
                        break outer;
                    }else{
                        break inner;
                    }
                }
            }


            System.out.println("Need to add a customer again?");
            System.out.println("(1) Yes");
            System.out.println("(2) No");
            int answer = input.nextInt();
            if (answer!=1){
                addStatus=false;
            }




        }
    }

    public static void findAndPrintCustomer(String[][] customers, Scanner input){

        System.out.println("please insert nic ");
        String selectedNic = input nextLine();


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String []questions=new String[6];
        String [][]customers = new String[10][3];
        questions[0]="(1) Add Customer";
        questions[1]="(2) Find Customer";
        questions[2]="(3) Delete Customer";
        questions[3]="(4) Update Customer";
        questions[4]="(5) Print All Customers";
        questions[5]="(6) Logout";


        while(true){
            int answer = printQuestions(questions,input);


            switch (answer){
                case 0:
                    addCustomer(customers, input);
                    System.out.println(Arrays.deepToString(customers));
                    break;
                case 1:
                    System.out.println(questions[answer]);break;
                case 2:
                    System.out.println(questions[answer]);break;
                case 3:
                    System.out.println(questions[answer]);break;
                case 4:
                    System.out.println(questions[answer]);break;
                case 5:
                    System.out.println(questions[answer]);break;


            }


        }




    }
}
