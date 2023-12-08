package Slit_1;

public abstract class Item {

    private int itemNo;
    private String Description;

    private int unitPrice;

    public Item(int itemNo, String description, int unitPrice) {
        this.itemNo = itemNo;
        Description = description;
        this.unitPrice = unitPrice;
    }

    public void Display(){

        System.out.println(this.itemNo);
        System.out.println(this.Description);
        System.out.println(this.unitPrice);

    }
}
