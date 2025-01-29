
import java.util.Scanner;

public class Gpa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of courses: ");
        int numCourses = scanner.nextInt();
        double totalGradePoints = 0;
        int totalCredits = 0;
        for (int i = 0; i < numCourses; i++) {
            System.out.print("Enter course " + (i + 1) + " name: ");
            String courseName = scanner.next();
            System.out.print("Enter course " + (i + 1) + " grade (A, B, C, D, F): ");
            String grade = scanner.next().toUpperCase();
            System.out.print("Enter course " + (i + 1) + " credits: ");
            int credits = scanner.nextInt();
            double gradePoints = calculateGradePoints(grade, credits);
            totalGradePoints += gradePoints;
            totalCredits += credits;
            System.out.println("Course: " + courseName + ", Grade: " + grade + ", Credits: " + credits + ", Grade Points: " + gradePoints);
        }

        double gpa = calculateGPA(totalGradePoints, totalCredits);
        System.out.println("Total Grade Points: " + totalGradePoints);
        System.out.println("Total Credits: " + totalCredits);
        System.out.println("GPA: " + gpa);
    }

    private static double calculateGradePoints(String grade, int credits) {
        double gradePoints = 0;

        switch (grade) {
            case "A":
                gradePoints = 4.0 * credits;
                break;
            case "B":
                gradePoints = 3.0 * credits;
                break;
            case "C":
                gradePoints = 2.0 * credits;
                break;
            case "D":
                gradePoints = 1.0 * credits;
                break;
            case "F":
                gradePoints = 0.0 * credits;
                break;
        }

        return gradePoints;
    }

    private static double calculateGPA(double totalGradePoints, int totalCredits) {
        return totalGradePoints / totalCredits;
    }
}

