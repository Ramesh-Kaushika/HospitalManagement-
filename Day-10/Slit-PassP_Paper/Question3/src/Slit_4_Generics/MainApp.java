package Slit_4_Generics;

public class MainApp {

    public static void main(String[] args) {

        Pair<String,Integer> pair1 = new Pair<>("Test 1",42);
        Pair<Double,String> pair2 = new Pair<>(3.14,"Test 2");

        System.out.println("Printing First Pair");
        System.out.println("First Value "+pair1.getFirst());
        System.out.println("Second Value "+pair1.getSecond());


        System.out.println();

        System.out.println("Printing Second Pair");
        System.out.println("First Value "+ pair2.getFirst());
        System.out.println("Second Value "+ pair2.getSecond());




    }
}
