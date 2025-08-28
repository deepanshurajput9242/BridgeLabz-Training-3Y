import java.util.*;
public class FitnessCenterMemberShip {

    public static String typeOfMemberShip(int num){
        String memberShip = "";
        switch(num){
            case 1:
                memberShip+="Monthly";
                break;
            case 2:
                memberShip+="Quarterly";
                break;
            case 3:
                memberShip+="Yearly";
                break;
            default:
                memberShip+="Invalid";
        }
        return memberShip;
    }

    public static int fees(int num){
        if(num==1){
            return 399;
        }
        else if(num==2){
            return 999;
        }
        else if(num==3){
            return 2499;
        }
        else{
            return -1;
        }
    }

    public static boolean discountAvailablity(char ch){
        if(ch=='y'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total no. of Users/MembershipBuyers : ");
        int n = sc.nextInt();
        do{
            System.out.println("Enter Type Of Gym MemberShip You Want (1-Monthly, 2-Quarterly, 3-Yearly): ");
            int num = sc.nextInt();
            System.out.println("Your MemberShip : "+typeOfMemberShip(num));
            System.out.println("Are you a student or senior citizen (y/n) : ");
            char ch = sc.next().charAt(0);
            if(discountAvailablity(ch)==true){
                System.out.println("You will get 5% discount on MemberShip!");
                System.out.println("Your total membership cost : "+((0.95)*fees(num)));
            }
            else{
                System.out.println("Sorry, You will Not get a discount!");
                System.out.println("Your total membership cost : "+fees(num));
            }
            n--;
        }while(n>0);
    }
}