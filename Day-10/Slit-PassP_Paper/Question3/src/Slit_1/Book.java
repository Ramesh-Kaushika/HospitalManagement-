package Slit_1;

public class Book extends Item {

    private String publisher;
    private String category;
    private int pages;


    public Book(int itemNo, String description, int unitPrice, String publisher, String category, int pages) {
        super(itemNo, description, unitPrice);
        this.publisher = publisher;
        this.category = category;
        this.pages = pages;
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println(this.publisher);
        System.out.println(this.category);
        System.out.println(this.pages);
    }
}
