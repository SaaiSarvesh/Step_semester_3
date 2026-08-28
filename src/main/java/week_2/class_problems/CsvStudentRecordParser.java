package week_2.class_problems;

import java.util.Scanner;

public class CsvStudentRecordParser {

    public static void parseStudentRecord(String csvLine) {
        if (csvLine == null || csvLine.trim().isEmpty()) {
            System.out.println("Invalid Record");
            return;
        }
        String[] fields = csvLine.split(",");
        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        String name = fields[0].trim();
        String rollNumber = fields[1].trim();
        String department = fields[2].trim();
        if (name.isEmpty() || rollNumber.isEmpty() || department.isEmpty()) {
            System.out.println("Invalid Record");
            return;
        }

        System.out.printf("Name: %s | Roll No: %s | Dept: %s%n", name, rollNumber, department);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter CSV Record (Name,RollNumber,Department): ");
        String csvLine = scanner.nextLine();

        parseStudentRecord(csvLine);

        scanner.close();
    }
}