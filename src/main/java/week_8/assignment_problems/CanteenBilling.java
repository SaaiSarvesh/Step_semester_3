package week_8.assignment_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CanteenBilling {

    abstract static class Customer {
        protected double billAmount;

        public Customer(double billAmount) {
            this.billAmount = billAmount;
        }

        public abstract double calculateFinalAmount();
    }

    static class Student extends Customer {
        public Student(double billAmount) { super(billAmount); }

        @Override
        public double calculateFinalAmount() {
            return billAmount * 0.90; // 10% discount
        }
    }

    static class Staff extends Customer {
        public Staff(double billAmount) { super(billAmount); }

        @Override
        public double calculateFinalAmount() {
            return billAmount * 0.95; // 5% discount
        }
    }

    static class Guest extends Customer {
        public Guest(double billAmount) { super(billAmount); }

        @Override
        public double calculateFinalAmount() {
            return billAmount + 10.0; // Full amount + ₹10 service charge
        }
    }

    static class CustomerFactory {
        public static Customer create(String type, double amount) {
            switch (type.toUpperCase()) {
                case "STUDENT": return new Student(amount);
                case "STAFF": return new Staff(amount);
                case "GUEST": return new Guest(amount);
                default: throw new IllegalArgumentException("Unknown customer type: " + type);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;

        int n = scanner.nextInt();
        List<Customer> customers = new ArrayList<>();
        List<String> types = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String type = scanner.next();
            double amount = scanner.nextDouble();
            types.add(type);
            customers.add(CustomerFactory.create(type, amount));
        }

        double grandTotal = 0.0;
        for (int i = 0; i < n; i++) {
            double finalAmount = customers.get(i).calculateFinalAmount();
            grandTotal += finalAmount;
            System.out.printf("%s: %.2f%n", types.get(i), finalAmount);
        }

        System.out.printf("Total: %.2f%n", grandTotal);
        scanner.close();
    }
}