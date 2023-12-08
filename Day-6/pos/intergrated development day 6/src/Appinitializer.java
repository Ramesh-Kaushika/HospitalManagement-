import java.util.Arrays;
import java.util.Scanner;


public class Appinitializer {


    public static int printQuestions(String[] questions, Scanner input) {
        System.out.println("Select Your Option....");
        for (String tempQuestion : questions
        ) {
            System.out.println(tempQuestion);
        }


        int answerNumber = input.nextInt();
        if (answerNumber <= 0) {
            System.out.println("Wrong input & try again!");
            System.exit(0);
        }
        return answerNumber - 1;
    }


    public static boolean isExists(String[][] customers, String nic) {
        if (customers[0][0] == null) {
            return false;
        }
        for (int i = 0; i < customers.length; i++) {


            if (customers[i][0] == null) {
                return false;
            }


            if (customers[i][0].equals(nic)) {
                System.out.println("Nic is already exists!");
                return true;
            }
        }
        return false;
    }


    public static void addCustomer(String[][] customers, Scanner input) {//10
        boolean addStatus = true;


        while (addStatus) {
            input.nextLine();
            if (customers[customers.length - 1][0] != null) {
                System.out.println("Database is full!");
                return;
            }


            outer:
            for (int i = 0; i < customers.length; i++) {
                inner:
                for (int j = 0; j < customers[i].length; j++) {
                    if (customers[i][j] == null) {


                        String selectedNic = "";


                        do {
                            System.out.println("Insert Nic");
                            selectedNic = input.nextLine();
                        } while (isExists(customers, selectedNic));


                        customers[i][0] = selectedNic;
                        System.out.println("Insert Name");
                        customers[i][1] = input.nextLine();


                        System.out.println("Insert Address");
                        customers[i][2] = input.nextLine();
                        break outer;
                    } else {
                        break inner;
                    }
                }
            }


            System.out.println("Need to add a customer again?");
            System.out.println("(1) Yes");
            System.out.println("(2) No");
            int answer = input.nextInt();
            if (answer != 1) {
                addStatus = false;
            }
        }
    }


    public static void findAndPrintCustomer(String[][] customers, Scanner input) {
        input.nextLine();
        System.out.println("Please insert the nic");
        String selectedNic = input.nextLine();
        if (null != selectedNic) {
            for (int i = 0; i < customers.length; i++) {
                for (int j = 0; j < customers[i].length; j++) {
                    if (customers[i][0].equals(selectedNic)) {
                        System.out.println(Arrays.toString(customers[i]));
                        return;
                    }
                }
            }
            System.out.println("No records found");
        } else {
            System.out.println("Wrong nic");
        }


    }


    public static void deleteCustomer(String[][] customers, Scanner input) {


        input.nextLine();
        System.out.println("Please insert the nic");
        String selectedNic = input.nextLine();
        if (null != selectedNic) {
            for (int i = 0; i < customers.length; i++) {
                for (int j = 0; j < customers[i].length; j++) {
                    if (customers[i][0].equals(selectedNic)) {
                        customers[i][0] = null;
                        customers[i][1] = null;
                        customers[i][2] = null;

                        //  restructureArray(customers);
                        //[[null, null, null], [96, jagath, panadura], [null, null, null], [null, null, null], [null, null, null], [null, null, null], [null, null, null], [null, null, null], [null,
                        // []<=[96,jagath,panadura]

                        System.out.println(Arrays.deepToString(customers));


                        String[][] tempCustomers = new String[3][3];


                        for (int k = 0; k < customers.length; k++) {

                            if (customers[k][0] != null) {
                                tempCustomers[k] = customers[k];
                                k++;
                            } else {
                                break;
                            }
                        }


                        return;
                    }
                }
            }
            System.out.println("No records found");
        } else {
            System.out.println("Wrong nic");
        }


    }


    public static void updateCustomer(String[][] customers, Scanner input) {


        input.nextLine();
        System.out.println("Please insert the nic to update");
        String selectedNic = input.nextLine();
        if (null != selectedNic) {
            for (int i = 0; i < customers.length; i++) {
                for (int j = 0; j < customers[i].length; j++) {
                    if (customers[i][0].equals(selectedNic)) {


                        System.out.println("Insert Name");
                        customers[i][1] = input.nextLine();


                        System.out.println("Insert Address");
                        customers[i][2] = input.nextLine();
                        return;
                    }
                }
            }
            System.out.println("No records found");
        } else {
            System.out.println("Wrong nic");
        }


    }

    public static void printAll(String[][] customers) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i][0] != null) {
                System.out.println(Arrays.toString(customers[i]));
            }
        }


    }

    public static void appointmentCall(String[][] customers, Scanner input) {

        for (int i = 0; i < customers.length; i++) {
            // for (int j = 0; j < customers[i].length; j++) {
            System.out.println(customers[i][0]);
            //  System.out.println(Arrays.deepToString(customers[i]));
        }

         for(int i = 0; i<customers.length;i++) {
        // for (int j = 0; j < customers[i].length; j++) {
        System.out.println(customers[i][0]);
        //  System.out.println(Arrays.deepToString(customers[i]));
    }

}



    //}



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String []questions=new String[7];
        String [][]customers = new String[3][3];
        questions[0]="(1) Add Customer";
        questions[1]="(2) Find Customer";
        questions[2]="(3) Delete Customer";
        questions[3]="(4) Update Customer";
        questions[4]="(5) Print All Customers";
        questions[5]="(6) Logout";
        questions[6]="(7) Check!ng";


        while(true){
            int answer = printQuestions(questions,input);


            switch (answer){
                case 0:
                    addCustomer(customers, input);
                    System.out.println(Arrays.deepToString(customers));
                    break;
                case 1:
                    findAndPrintCustomer(customers, input);
                    break;
                case 2:
                    deleteCustomer(customers,input);
                    System.out.println(Arrays.deepToString(customers));
                    break;
                case 3:
                    updateCustomer(customers,input);
                    System.out.println(Arrays.deepToString(customers));
                    break;
                case 4:
                    printAll(customers);
                    break;
                case 5:
                    System.exit(0);
                    break;
                case 6:
                   appointmentCall(customers,input);
                    break;


            }


        }




    }
}
