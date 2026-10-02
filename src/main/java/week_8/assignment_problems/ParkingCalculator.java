package week_8.assignment_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParkingCalculator {

    abstract static class Vehicle {
        protected int hours;

        public Vehicle(int hours) {
            this.hours = hours;
        }

        public abstract double calculateCharge();
    }

    static class Bike extends Vehicle {
        public Bike(int hours) { super(hours); }

        @Override
        public double calculateCharge() {
            return hours * 10.0;
        }
    }

    static class Car extends Vehicle {
        public Car(int hours) { super(hours); }

        @Override
        public double calculateCharge() {
            if (hours <= 1) {
                return 30.0;
            }
            return 30.0 + (hours - 1) * 20.0;
        }
    }

    static class Truck extends Vehicle {
        public Truck(int hours) { super(hours); }

        @Override
        public double calculateCharge() {
            double charge = hours * 50.0;
            return Math.max(charge, 100.0); // Minimum charge ₹100
        }
    }

    static class VehicleFactory {
        public static Vehicle create(String type, int hours) {
            switch (type.toUpperCase()) {
                case "BIKE": return new Bike(hours);
                case "CAR": return new Car(hours);
                case "TRUCK": return new Truck(hours);
                default: throw new IllegalArgumentException("Unknown vehicle type: " + type);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;

        int n = scanner.nextInt();
        List<Vehicle> vehicles = new ArrayList<>();
        List<String> types = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String type = scanner.next();
            int hours = scanner.nextInt();
            types.add(type);
            vehicles.add(VehicleFactory.create(type, hours));
        }

        double grandTotal = 0.0;
        for (int i = 0; i < n; i++) {
            double charge = vehicles.get(i).calculateCharge();
            grandTotal += charge;
            System.out.printf("%s: %.2f%n", types.get(i), charge);
        }

        System.out.printf("Total: %.2f%n", grandTotal);
        scanner.close();
    }
}