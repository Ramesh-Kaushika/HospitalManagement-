import java.util.*;

public class Example{

    public static void main findTotal(){



    }

    public static void main findMax(){
        int max = array [0]
        for(i=0 i<10; i++){

            if(max<array[0]){

                max=array[0];
            }

        }
        
    }

    public static void main findMin(){

            int max = array [0]
        for(i=0 i<10; i++){

            if(min<array[0]){

                max=array[0];
            }

        }
        
    }

public static void main(String[]args){

//Scanner scan = new Scanner(System.in);
int [] array = new int[10];
Random rand = new Random();
//int upperBound = 100;
//int int_random = rand.nextInt(upperbound); 

int total = 0;
  System.out.print("[");
 for(int i=0; i<10; i++){

                    array[i]=rand.nextInt(101);
                    total += array[i];
                    System.out.println(total+",");

 }
            findMax();
            findMin();
    
   
      



}
}