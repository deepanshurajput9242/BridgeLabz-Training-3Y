import java.util.*;
public class EmployeeSalarySlip {

    public static int employeeDetails(Scanner sc){
        System.out.println("Enter your name : ");
        String name = sc.next();
        System.out.println("Enter your basic salary : ");
        int basicSalary = sc.nextInt();
        System.out.println("Your Name : "+name);
        return basicSalary;
    }

    public static double calculateHRA(int salary){
        double hra = salary*0.2f;
        return hra;
    }

    public static double calculateDA(int salary){
        double da = salary*0.1f;
        return da;
    }

    public static double netSalary(int salary, double hra, double da){
        double netsalary = salary+hra+da;
        return netsalary;
    }

    public static double tax(double netSalary){
        netSalary-=netSalary*0.1;
        return netSalary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Employees : ");
        int num = sc.nextInt();
        for(int i = 1; i<=num; i++){
            int basicSalary = employeeDetails(sc);
            double hra = calculateHRA(basicSalary);
            double da = calculateDA(basicSalary);
            double netsalary = netSalary(basicSalary, hra, da);
            if(netsalary>50000){
                netsalary = tax(netsalary);
                System.out.printf("Total Net Salary After Tax of Employee %d : ",i);
                System.out.println(netsalary);
            }
            else{
                System.out.printf("Total Net Salary of Employee %d : ",i);
                System.out.println(netsalary);
            }
        }
    }
}
