package Slit_5_Map;

import java.util.HashMap;
import java.util.Objects;

public class Library {

    public static void main(String[] args) {

        HashMap<Integer,Book<?,?>> bookList = new HashMap<>();

       Book<String,String>  b1 = new Book<>("ISBN12345","Harry Potter");
        bookList.put(1,b1);

       //bookList.put(b1.)

        Book<Integer,String> b2 = new Book(123456,"Rings Of Power");
        bookList.put(2,b2);

        for (Integer i : bookList.keySet()) {

            Book value  = bookList.get(i);

            System.out.println("Book ID is : "+i + "and the ISBN is : "+value.getBookISBN());

        }

    }
}
