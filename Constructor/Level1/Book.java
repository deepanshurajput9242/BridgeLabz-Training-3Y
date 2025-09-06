package PracticePrograms1;

public class Book {
    String title;
    String author;
    int price;
    Book(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;

    }
    Book(){
        title="unknown";
        author="unknown";
        price=0;
        System.out.println("Default constructor called");

    }

    public void display(){
        System.out.println("The book title is"+" "+title);
        System.out.println("The book's author is"+" "+author);
        System.out.println("The book's price is"+" "+price);
    }
}
