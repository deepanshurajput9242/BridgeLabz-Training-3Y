package PracticeProgram4;

public class ProgramToHandleMobilePhoneDetails {
    String brand;
    String model;
    int price;
    ProgramToHandleMobilePhoneDetails(String brand,
    String model,
    int price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    public void Display(){
        System.out.println("The Mobile's Brand is"+ " " + brand);
        System.out.println("The Mobile's Model is "+" "+ model);
        System.out.println("The MObile's Price is "+" "+ price);
    }
}
