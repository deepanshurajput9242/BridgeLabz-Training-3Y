package Level2Practice2Question;

import java.sql.SQLOutput;

public class ProgramToSimulateAnATM {
    String accountHolder;
    double accountNumber;
    double balance;
    ProgramToSimulateAnATM(String accountHolder,double accountNumber,double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;

    }
    public void display(double amount){

        if(amount>0){
            balance+=amount;
            System.out.println("SuccessFully deposited $"+amount);
        }else{
            System.out.println("Withrawl must be Positive");
        }
        if(amount<=0){
            System.out.println("Balance should be positive");

        }

        System.out.println("The AccountHolder's name is "+" "+ accountHolder);
        System.out.println("The AccounNUmber is "+" "+accountNumber);
        System.out.println("The Remaining Bank Balance is "+" "+ balance);


    }
}
