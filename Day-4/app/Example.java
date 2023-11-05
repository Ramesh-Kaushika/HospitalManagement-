import java.util.Scanner;

public class Example{

  public static int printSum(int num1,){

    int sum=0;
     // num1+num2;
     while(num1!=0){      //325
          sum+=num%10; sum = sum + num%10
          num/=10;

     }
      return sum;

  }

    public static void main (String[]args){
      Scanner scan = new Scanner(System.in);

      System.out.println("insert value");
      int num1 = scan.nextInt();

      // System.out.println("insert value");
      // int num2 = scan.nextInt();

      int sum = printSum(num1);

      System.out.println("total"+sum);



}

}