package PracticeProgram3;

public class TrackInventoryOfItems {
    int itemCode;
    String itemName;
    double price;
    TrackInventoryOfItems(int itemCode,String itemName, double price){
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.price=price;

    }
    public void TrackItems(){
        System.out.println("The itemCode is "+" "+ itemCode);
        System.out.println("The itemName is "+" "+ itemName);
        System.out.println("The itemprice is "+" "+ price);
    }

}
