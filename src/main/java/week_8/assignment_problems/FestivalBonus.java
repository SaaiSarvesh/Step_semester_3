package week_8.assignment_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FestivalBonus {

    abstract static class Employee {
        protected String name;
        protected double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public abstract double calculateBonus();
    }

    static class FullTimeEmployee extends Employee {
        public FullTimeEmployee(String name, double salary) { super(name, salary); }

        @Override
        public double calculateBonus() {
            return salary * 0.10;
        }
    }

    static class PartTimeEmployee extends Employee {
        public PartTimeEmployee(String name, double salary) { super(name, salary); }

        @Override
        public double calculateBonus() {
            return salary * 0.05;
        }
    }

    static class InternEmployee extends Employee {
        public InternEmployee(String name, double salary) { super(name, salary); }

        @Override
        public double calculateBonus() {
            return 2000.0;
        }
    }

    static class EmployeeFactory {
        public static Employee create(String type, String name, double salary) {
            switch (type.toUpperCase()) {
                case "FULLTIME": return new FullTimeEmployee(name, salary);
                case "PARTTIME": return new PartTimeEmployee(name, salary);
                case "INTERN": return new InternEmployee(name, salary);
                default: throw new IllegalArgumentException("Unknown employee type: " + type);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;

        int n = scanner.nextInt();
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String type = scanner.next();
            String name = scanner.next();
            double salary = scanner.nextDouble();
            employees.add(EmployeeFactory.create(type, name, salary));
        }

        double grandTotal = 0.0;
        for (Employee emp : employees) {
            double bonus = emp.calculateBonus();
            grandTotal += bonus;
            System.out.printf("%s: %.2f%n", emp.getName(), bonus);
        }

        System.out.printf("Total Bonus: %.2f%n", grandTotal);
        scanner.close();
    }
}