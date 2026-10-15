package week_10.class_problems;

import java.util.Scanner;

public class StudentGradeAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's marks (out of 100): ");
        int marks = scanner.nextInt();
        
        String grade;
        if (marks >= 90) {
            grade = "A";
        } else if (marks >= 75) {
            grade = "B";
        } else if (marks >= 60) {
            grade = "C";
        } else if (marks >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        System.out.println("Grade " + grade);
        scanner.close();
    }
}