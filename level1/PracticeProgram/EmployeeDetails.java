package PracticeProgram;

public class EmployeeDetails {
    String name;
    int id;
    double salary;
    EmployeeDetails(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;

    }
    public void workDetails(){
        System.out.println("Employee Name"+ " "+ name);
        System.out.println("Employee Id"+ " "+id);
        System.out.println("Employee Salary"+ " "+salary);
    }


}
