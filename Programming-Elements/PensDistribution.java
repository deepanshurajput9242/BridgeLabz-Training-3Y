// Program to divide pens among students equally
class PensDistribution {
    public static void main(String[] args) {
        // Fixed values
        int totalPens = 14;
        int totalStudents = 3;

        // Calculate per student pens
        int pensPerStudent = totalPens / totalStudents;

        // Calculate remaining pens
        int remainingPens = totalPens % totalStudents;

        // Display result
        System.out.println("The Pen Per Student is " + pensPerStudent +
                " and the remaining pen not distributed is " + remainingPens);
    }
}