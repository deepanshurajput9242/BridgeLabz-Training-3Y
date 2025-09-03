package Level2PracticeProgram1;

public class ProgramToSimulateStudentReport {
    String name;
    int rollNumber;
    int marks;
    ProgramToSimulateStudentReport(String name,int rollNumber,int marks){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;

    }
    public void displey(){











        if(marks>=90){
            System.out.println("The student has pass by grade O");

        }else if(marks>=80 ){
            System.out.println("The Student has pass by Grade A+");

        }else if(marks>=70){
            System.out.println("The Student has pass by Grade A");
        }else if(marks >=50 && marks<70){
            System.out.println("The student has pass by Grade B");

        }else{
            System.out.println("The student is fail");
        }
        System.out.println("The student's name is "+ " "+ name);
        System.out.println("The Student's rollNumber is "+ " "+ rollNumber );
        System.out.println("The Student's Mark is "+" "+ marks);
    }
}
