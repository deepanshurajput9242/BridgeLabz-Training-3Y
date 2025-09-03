package Level2PracticeQuestion4;

import java.util.ArrayList;

public class ProgramSimulateShoppingCart {
    String itemName;

    int price;
    int quantity;
    ProgramSimulateShoppingCart(String itemName,int price,int quantity){
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }
    void addItems(int qnty){
        quantity+=qnty;
        System.out.println("The Quantity is"+ quantity);
    }
    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " items removed from the cart.");
        } else {
            System.out.println("Cannot remove more items than present in cart!");
        }
    }
    double totalCost() {
        return price * quantity;
    }
    void displayDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost());
    }
}



