import java.util.*;


public class HospitalManagement {

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

    public static boolean isExist(String[][] patients, String nic) {
        if (patients[0][0] == null) {
            return false;
        }
        for (int i = 0; i < patients.length; i++) {


            if (patients[i][0] == null) {
                return false;
            }


            if (patients[i][0].equals(nic)) {
                System.out.println("Nic is already exists!");
                return true;
            }
        }
        return false;
    }

    public static void addPatient(String[][] patients, Scanner input){


        boolean addStatus = true;

        while (addStatus) {
            input.nextLine();
            if (patients[patients.length - 1][0] != null) {
                System.out.println("Database is full");
                return;

            }

            outer:
            for (int i = 0; i < patients.length; i++) {
                inner:
                for (int j = 0; j < patients[i].length; j++) {
                    if (patients[i][j] == null) {


                        String selectedNic = "";

                        do {
                            System.out.println("insert NIC");
                            selectedNic = input.nextLine();
                        }
                        while (isExist(patients, selectedNic));
                        patients[i][0] = selectedNic;



                        System.out.println("Insert Name");
                        patients[i][1] = input.nextLine();

                        System.out.println("Insert Gender");
                        patients[i][2] = input.nextLine();

                        System.out.println("Insert Address");
                        patients[i][3] = input.nextLine();

                        break outer;

                    } else {

                        break inner;
                    }

                }
            }


            System.out.println("Need to Add Patient Again");
            System.out.println("Press (1) " + "Yes");
            System.out.println("Press (2) " + "No");
            int answer = input.nextInt();
            if (answer != 1) {

                addStatus = false;

            }

        }

    }

    public static void findAndPrintPatients(String[][] patients, Scanner input) {
        input.nextLine();
        System.out.println("Please insert the nic");
        String selectedNic = input.nextLine();
        if (null != selectedNic) {
            for (int i = 0; i < patients.length; i++) {
                for (int j = 0; j < patients[i].length; j++) {
                    if (patients[i][0].equals(selectedNic)) {
                        System.out.println(Arrays.toString(patients[i]));
                        return;
                    }
                }
            }
            System.out.println("No records found");
        } else {
            System.out.println("Wrong nic");
        }


    }

    public static void deletePatients(String[][] patients, Scanner input) {


        input.nextLine();
        System.out.println("Please insert the nic");
        String selectedNic = input.nextLine();
        if (null != selectedNic) {
            for (int i = 0; i < patients.length; i++) {
                for (int j = 0; j < patients[i].length; j++) {
                    if (patients[i][0].equals(selectedNic)) {
                        patients[i][0] = null;
                        patients[i][1] = null;
                        patients[i][2] = null;
                        patients[i][3] = null;
                        //[[null, null, null], [96, jagath, panadura], [null, null, null], [null, null, null], [null, null, null], [null, null, null], [null, null, null], [null, null, null], [null,
                        // []<=[96,jagath,panadura]


                        String[][] tempCustomers = new String[3][4];


//                        for (int k = 0; k < customers.length; k++) {
//                            for (int l = 0; l < customers[k].length;) {
//                                if (customers[k][l]!=null){
//                                    tempCustomers[k]=customers[k];
//                                    l++;
//                                }else{
//
//                                }
//                            }
//                        }


                        return;
                    }
                }
            }
            System.out.println("No records found");
        } else {
            System.out.println("Wrong nic");
        }


    }

    public static void updatePatients(String[][] patients, Scanner input) {


        input.nextLine();
        System.out.println("Please insert the nic to update");
        String selectedNic = input.nextLine();
        if (null != selectedNic) {
            for (int i = 0; i < patients.length; i++) {
                for (int j = 0; j < patients[i].length; j++) {
                    if (patients[i][0].equals(selectedNic)) {

                        System.out.println("Insert Name");
                        patients[i][1] = input.nextLine();

                        System.out.println("Insert Gender");
                        patients[i][1] = input.nextLine();

                        System.out.println("Insert Address");
                        patients[i][2] = input.nextLine();
                        return;
                    }
                }
            }
            System.out.println("No records found");
        } else {
            System.out.println("Wrong nic");
        }


    }

    public static void printAll(String[][] patients) {
        for (int i = 0; i < patients.length; i++) {
            if (patients[i][0] != null) {
                System.out.println(Arrays.toString(patients[i]));
            }
        }
    }

     public static int printDoctorQuestions(String [] dQuestions,Scanner input){

          for (String tempQuestions:dQuestions) {

              System.out.println(tempQuestions);
          }
          System.out.println();
          int answerNumber = input.nextInt();

          if (answerNumber<=0){

              System.out.println("Wrong input & try again");
              System.exit(0);
          }
          return  answerNumber-1;

      }

      public static boolean isExistDoctor(String[][] patients,String nic){
          if (patients[0][0]==null){
              return false;
          }
          for (int i = 0; i < patients.length; i++) {


              if(patients[i][0]==null){
                  return false;
              }


              if(patients[i][0].equals(nic)){
                  System.out.println("Nic is already exists!");
                  return true;
              }
          }
          return false;
      }

      public static void addDoctor(String[][] doctors,Scanner input){

          boolean addStatus = true;

          while (addStatus){
              input.nextLine();
              if (doctors[doctors.length-1][0]!=null){
                  System.out.println("Database is full");
                  return;

              }

              outer:for (int i = 0; i < doctors.length; i++) {
                  inner:for (int j = 0; j <doctors[i].length ; j++) {
                      if (doctors[i][j]==null){


                          String selectedNic="";

                          do {
                              System.out.println("insert Doctor ID");
                              selectedNic = input.nextLine();
                          }
                          while(isExistDoctor(doctors,selectedNic));
                          doctors[i][0]=selectedNic;

                          System.out.println("Insert Name");
                          doctors[i][1]=input.nextLine();

                          System.out.println("Insert Specialization");
                          doctors[i][2]=input.nextLine();





                          break outer;

                      }
                      else {

                          break inner;
                      }

                  }
              }


              System.out.println("Need to Add Doctor Again");
              System.out.println("Press (1) "+"Yes");
              System.out.println("Press (2) "+"No");
              int answer = input.nextInt();
              if (answer!=1){

                  addStatus=false;

              }

          }

      }

      public static void findAndPrintDoctor(String[][] doctors, Scanner input){
          input.nextLine();
          System.out.println("Please insert the nic");
          String selectedNic=input.nextLine();
          if(null!=selectedNic){
              for (int i = 0; i < doctors.length; i++) {
                  for (int j = 0; j < doctors[i].length; j++) {
                      if (doctors[i][0].equals(selectedNic)){
                          System.out.println(Arrays.toString(doctors[i]));
                          return;
                      }
                  }
              }
              System.out.println("No records found");
          }else{
              System.out.println("Wrong nic");
          }


      }

      public  static void deleteDoctor(String[][] doctors, Scanner input){


          input.nextLine();
          System.out.println("Please insert the nic");
          String selectedNic=input.nextLine();
          if(null!=selectedNic){
              for (int i = 0; i < doctors.length; i++) {
                  for (int j = 0; j < doctors[i].length; j++) {
                      if (doctors[i][0].equals(selectedNic)){
                          doctors[i][0]=null;
                          doctors[i][1]=null;
                          doctors[i][2]=null;

                          //[[null, null, null], [96, jagath, panadura], [null, null, null], [null, null, null], [null, null, null], [null, null, null], [null, null, null], [null, null, null], [null,
                          // []<=[96,jagath,panadura]




                          String [][]tempCustomers=new String[3][4];


  //                        for (int k = 0; k < customers.length; k++) {
  //                            for (int l = 0; l < customers[k].length;) {
  //                                if (customers[k][l]!=null){
  //                                    tempCustomers[k]=customers[k];
  //                                    l++;
  //                                }else{
  //
  //                                }
  //                            }
  //                        }


                          return;
                      }
                  }
              }
              System.out.println("No records found");
          }else{
              System.out.println("Wrong nic");
          }


      }

      public  static void updateDoctors(String[][] doctors, Scanner input){


          input.nextLine();
          System.out.println("Please insert the nic to update");
          String selectedNic=input.nextLine();
          if(null!=selectedNic){
              for (int i = 0; i < doctors.length; i++) {
                  for (int j = 0; j < doctors[i].length; j++) {
                      if (doctors[i][0].equals(selectedNic)){

                          System.out.println("Insert Name");
                          doctors[i][1]=input.nextLine();

                          System.out.println("Insert Specialization");
                          doctors[i][2]=input.nextLine();


                          return;
                      }
                  }
              }
              System.out.println("No records found");
          }else{
              System.out.println("Wrong nic");
          }


      }
      public  static void printAllDoctors(String[][] doctors) {
          for (int i = 0; i < doctors.length; i++) {
              if (doctors[i][0] != null) {
                  System.out.println(Arrays.toString(doctors[i]));
              }
          }
      }

    public static int printAppointmentQuestions(String[] aQuestions, Scanner input) {
        System.out.println("Select Your Option....");
        for (String tempQuestion : aQuestions
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

    public static boolean isExistAppointment(String[][] appointments,String id){
        if (appointments[0][0]==null){
            return false;
        }
        for (int i = 0; i < appointments.length; i++) {


            if(appointments[i][0]==null){
                return false;
            }


            if(appointments[i][0].equals(id)){
                System.out.println("Appointment is already exists!");
                return true;
            }
        }
        return false;
    }



    public static void addAppointment(String[][] appointments,Scanner input ,String[][] patients ,String[][] doctors){

        boolean addStatus = true;

        while (addStatus){
            input.nextLine();
            if (appointments[appointments.length-1][0]!=null){
                System.out.println("Database is full");
                return;

            }

            outer:for (int i = 0; i < appointments.length; i++) {
                inner:for (int j = 0; j <appointments[i].length ; j++) {
                    if (appointments[i][j]==null){


                        String selectedId="";

                        do {
                            System.out.println("Appointment ID");
                            selectedId = input.nextLine();
                        }
                        while(isExistAppointment(appointments,selectedId));
                        appointments[i][0]=selectedId;

                      //  appointments[i][1] = patients[k][0];

                            for (int k = 0; k < patients.length; k++) {
                                for (int l = 0; l < patients[k].length; l++) {
                                    if (appointments[i][1] == null) {
                                        appointments[i][1] = patients[k][0];
                                        System.out.println(appointments[i][1]);

                                    }
                                }
                            }
                            for (int m = 0; m < doctors.length; m++) {
                                for (int n = 0; n < doctors[n].length; n++) {
                                    if (appointments[i][2] == null) {
                                        appointments[i][2] = doctors[m][0];
                                        System.out.println(appointments[i][2]);

                                    }
                                }
                            }




                      //  appointments[i][2] = appointment[][];

                        System.out.println("Insert Time");
                        appointments[i][3]=input.nextLine();

                        System.out.println("Insert Date");
                        appointments[i][4]=input.nextLine();



                        break outer;

                    }
                    else {

                        break inner;
                    }

                }
            }


            System.out.println("Need to Add Appointment Again");
            System.out.println("Press (1) "+"Yes");
            System.out.println("Press (2) "+"No");
            int answer = input.nextInt();
            if (answer!=1){

                addStatus=false;

            }

        }

    }

    public static void findAndPrintAppointment(String[][] appointments, Scanner input){
        input.nextLine();
        System.out.println("Please insert the Appointment ID");
        String selectedId=input.nextLine();
        if(null!=selectedId){
            for (int i = 0; i < appointments.length; i++) {
                for (int j = 0; j < appointments[i].length; j++) {
                    if (appointments[i][0].equals(selectedId)){
                        System.out.println(Arrays.toString(appointments[i]));
                        return;
                    }
                }
            }
            System.out.println("No records found");
        }else{
            System.out.println("Wrong nic");
        }


    }

    public  static void deleteAppointment(String[][] appointments, Scanner input){


        input.nextLine();
        System.out.println("Please insert the nic");
        String selectedId=input.nextLine();
        if(null!=selectedId){
            for (int i = 0; i < appointments.length; i++) {
                for (int j = 0; j < appointments[i].length; j++) {
                    if (appointments[i][0].equals(selectedId)){
                        appointments[i][0]=null;
                        appointments[i][1]=null;
                        appointments[i][2]=null;

                        return;
                    }
                }
            }
            System.out.println("No records found");
        }else{
            System.out.println("Wrong nic");
        }


    }

    public  static void updateAppointment(String[][] appointments, Scanner input){


        input.nextLine();
        System.out.println("Please insert the nic to update");
        String selectedId=input.nextLine();
        if(null!=selectedId){
            for (int i = 0; i < appointments.length; i++) {
                for (int j = 0; j < appointments[i].length; j++) {
                    if (appointments[i][0].equals(selectedId)){

                        System.out.println("Insert Name");
                        appointments[i][1]=input.nextLine();

                        System.out.println("Insert Specialization");
                        appointments[i][2]=input.nextLine();


                        return;
                    }
                }
            }
            System.out.println("No records found");
        }else{
            System.out.println("Wrong nic");
        }


    }
    public  static void printAllAppointment(String[][] appointments) {
        for (int i = 0; i < appointments.length; i++) {
            if (appointments[i][0] != null) {
                System.out.println(Arrays.toString(appointments[i]));
            }
        }
    }

    public static void checkAppointment(String[][] patients,String[][] doctors,String[][] appointments,Scanner input){


      //  String [] allNew = new String [patients [4]];
        for (int i = 0; i < patients.length ; i++) {
            for (int j = 0; j < patients[i].length; j++) {

            }

        }
        System.out.println(Arrays.deepToString(patients));

        for (int i = 0; i < doctors.length ; i++) {
            for (int j = 0; j < doctors[i].length; j++) {

            }

        }
        System.out.println(Arrays.deepToString(doctors));

        for (int i = 0; i < appointments.length ; i++) {
            for (int j = 0; j < appointments[i].length; j++) {

            }

        }
        System.out.println(Arrays.deepToString(appointments));



        System.out.println("Pick the Doctor ID");

       String selectDoctorId = input.nextLine();
        for (int i = 0; i < doctors.length; i++) {
            for (int j = 0; j <doctors[j].length ; j++) {
                if (doctors[i][0].equals(selectDoctorId)){

                    for (int k = 0; k < patients.length ; k++) {
                        for (int l = 0; l < patients[k].length ; l++) {
                            System.out.println(patients[k][l]);
                        }
                    }
                    for (int k = 0; k <appointments.length ; k++) {
                        for (int l = 0; l <appointments[k].length ; l++) {
                            System.out.println(patients[k][l]);
                        }

                    }
            }

        }

        }








    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] mainQuestions = {"1. Patient Management", "2. Doctor Management", "3.Appointment Management","4.View Appointments by Doctor ID","5,Exit"};
        String[] questions = {"(1) Add Patient", "(2) Find Patient", "(3) Delete Patient", "(4) Update Patient", "(5) Print All Patient", "(6) Main Menu"};
        String[] dQuestions = {"(1) Add Doctor", "(2) Find Doctor", "(3) Delete Doctor", "(4) Update Doctor", "(5) Print All Doctor", "(6) Main Menu"};
        String[] aQuestions = {"(1) Add Appointment", "(2) Find Appointment", "(3) Delete Appointment", "(4) Update Appointment", "(5) Print All Appointment", "(6) Main Menu"};

        String[][] patients = new String[3][4];

        String[][] doctors = new String[3][3];

        String[][] appointments = new String[3][5];
        while (true) {

            System.out.println("Hospital Management System Menu");

            for (int i = 0; i < mainQuestions.length; i++) {
                System.out.println(mainQuestions[i]);
            }
            System.out.println("Select Option ");
            int numbers = input.nextInt();

            switch (numbers) {


                case 1:
                    boolean flag = true;
                    while (flag) {
                        System.out.println("<---Select Your Option--->");
                        int answer = printQuestions(questions, input);


                        switch (answer) {

                            case 0:
                                addPatient(patients, input);
                                System.out.println(Arrays.deepToString(patients));
                                break;
                            case 1:
                                findAndPrintPatients(patients, input);
                                break;
                            case 2:
                                deleteDoctor(doctors, input);
                                System.out.println(Arrays.deepToString(patients));
                                break;
                            case 3:
                                updateDoctors(doctors, input);
                                System.out.println(Arrays.deepToString(patients));
                                break;
                            case 4:
                                printAll(doctors);
                                break;
                            case 5:
                                // System.exit(0);
                                flag = false;
                                break;
                            default:
                                System.out.println("Invalid Entry");
                                break;

                        }

                    }
                    break;

                case 2:
                    boolean flag1 = true;
                    while (flag1) {
                        System.out.println("<---Select Your Option--->");
                        int answer1 = printDoctorQuestions(dQuestions, input);


                        switch (answer1) {

                            case 0:
                                addDoctor(doctors, input);
                                System.out.println(Arrays.deepToString(doctors));
                                break;
                            case 1:
                                findAndPrintDoctor(doctors, input);
                                break;
                            case 2:
                                deletePatients(patients, input);
                                System.out.println(Arrays.deepToString(doctors));
                                break;
                            case 3:
                                updatePatients(patients, input);
                                System.out.println(Arrays.deepToString(doctors));
                                break;
                            case 4:
                                printAllDoctors(doctors);
                                break;
                            case 5:
                                // System.exit(0);
                                flag1 = false;
                                break;
                            default:
                                System.out.println("Invalid Entry");
                                break;

                        }

                    }
                    break;

                case 3 :
                    boolean flag2 = true;
                    while (flag2) {
                        System.out.println("<---Select Your Option--->");
                        int answer2 = printAppointmentQuestions(aQuestions, input);


                        switch (answer2) {

                            case 0:
                                addAppointment(appointments, input,patients,doctors);
                                System.out.println(Arrays.deepToString(appointments));
                                break;
                            case 1:
                                findAndPrintAppointment(appointments, input);
                                break;
                            case 2:
                                deleteAppointment(appointments, input);
                                System.out.println(Arrays.deepToString(appointments));
                                break;
                            case 3:
                                updateAppointment(appointments, input);
                                System.out.println(Arrays.deepToString(appointments));
                                break;
                            case 4:
                                printAllAppointment(appointments);
                                break;
                            case 5:
                                // System.exit(0);
                                flag2 = false;
                                break;
                            default:
                                System.out.println("Invalid Entry");
                                break;

                        }

                    }
                    break;

                case 4 :
                    System.out.println("<---- Doctor ID ---->");
                    checkAppointment(patients,doctors,appointments,input);
                    break;

                case 5 :
                    System.out.println("GOOD BYE");
                    System.exit(0);
                    break;



            }


        }
    }

}
