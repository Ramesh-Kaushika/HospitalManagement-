package Slit_1;

import Slit_1.Book;
import Slit_1.Car;
import Slit_1.Item;

import java.util.ArrayList;

public class MainApp {

    public static void main(String[] args) {


        ArrayList<Item> items = new ArrayList<>();

        Book b1 = new Book(1,"Good",200,"Man","Film",200);
        Book b2 = new Book(2,"Very Good",220,"Women","Horror",300);

        Car c1 = new Car(3,"Bad",250,"Bmw","Benz");
        Car c2 = new Car(4,"Nice",500,"Ferrari","Yaka");


        items.add(b1);
        items.add(b2);
        items.add(c1);
        items.add(c2);


        for (Item item : items) {

            int x = 0;
            System.out.println("Category " +x+1);
            System.out.println();
            item.Display();
            System.out.println();

        }
    }
}
