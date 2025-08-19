// Program to calculate average percent in PCM subjects
class AveragePCMMarks {
    public static void main(String[] args) {
        // Marks in subjects
        double mathsMarks = 94;
        double physicsMarks = 95;
        double chemistryMarks = 96;

        // Calculate average
        double averageMarks = (mathsMarks + physicsMarks + chemistryMarks) / 3;

        // Display result
        System.out.println("Sam’s average mark in PCM is " + averageMarks);
    }
}