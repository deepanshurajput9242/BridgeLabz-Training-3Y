import java.util.*;
public class LIbraryManagement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many category of book you have(in numbers)");
        int total_books=sc.nextInt();
        int sum=0;
        int temp=total_books;
        int c=1;
        while(temp>0) {
            System.out.println("Enter the category of book"+c);
            String bookName = sc.next();
            switch (bookName) {
                case "Regular":
                    System.out.println("You have selected Regular category");
                    System.out.println("How many Regular books you have ?");
                    int number_of_books1 = sc.nextInt();
                    for (int i = 1; i <= number_of_books1; i++) {
                        System.out.println("Enter number of days for book ? " + i);
                        int days = sc.nextInt();
                        if (days >= 1 && days <= 5) {
                            sum = sum + (days * 10);
                        } else if (days >= 6 && days < 10) {
                            sum = sum + (days * 20);
                        } else if (days >= 10) {
                            sum = sum + (days * 50);
                        }
                    }
                    break;
                case "Reference":
                    System.out.println("You have selected Reference category");
                    System.out.println("How many Reference book you have");
                    int number_of_books2=sc.nextInt();
                    for(int i=1;i<=number_of_books2;i++){
                        System.out.println("Enter number of days for book "+i);
                        int days=sc.nextInt();
                        if (days >= 1 && days <= 5) {
                            sum=sum+(days*10);
                        }
                        else if(days>=6 && days<10){
                            sum=sum+(days*20);
                        }
                        else if(days>=10){
                            sum=sum+(days*50);
                        }
                    }
                    break;
                case "Magazine":
                    System.out.println("You have selected Magazine category");
                    System.out.println("How many Magazine book you have");
                    int number_of_books3=sc.nextInt();
                    for(int i=1;i<=number_of_books3;i++){
                        System.out.println("Enter number of days for book "+i);
                        int days=sc.nextInt();
                        if (days >= 1 && days <= 5) {
                            sum=sum+(days*10);
                        }
                        else if(days>=6 && days<10){
                            sum=sum+(days*20);
                        }
                        else if(days>=10){
                            sum=sum+(days*50);
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid book category");
            }
            temp--;
            c++;
        }
        System.out.println("The total fine is "+sum);
    }
}
