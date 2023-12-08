package Slit_5_Map;

public class Book <T,U> {

    private T bookTitle;
    private U bookISBN;

    public Book(T bookTitle, U bookISBN) {
        this.bookTitle = bookTitle;
        this.bookISBN = bookISBN;
    }

    public U getBookISBN() {
        return bookISBN;
    }
}
