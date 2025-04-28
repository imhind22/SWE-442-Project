import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double total = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter score for subject " + i + ": ");
            total += scanner.nextDouble();
        }

        // Calculate average
        double average = total / numSubjects;

        // Determine the grade
        char grade;
        if (average >= 90 && average <= 100) {
            grade = 'A';
        } else if (average >= 80 && average < 90) {
            grade = 'B';
        } else if (average >= 65 && average < 80) {
            grade = 'C';
        } else if (average >= 50 && average < 65) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display the result
        System.out.printf("\nAverage Score: %.2f\n", average);
        System.out.println("Grade after calculation is: " + grade);

        scanner.close();
    }
}
