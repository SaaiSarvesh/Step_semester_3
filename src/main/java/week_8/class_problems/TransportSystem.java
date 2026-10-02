package week_8.class_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TransportSystem {

    abstract static class TransportBooking {
        protected double basePrice;

        public TransportBooking(double basePrice) {
            this.basePrice = basePrice;
        }

        public abstract double calculateFinalPrice();
    }

    static class FlightBooking extends TransportBooking {
        public FlightBooking(double basePrice) { super(basePrice); }

        @Override
        public double calculateFinalPrice() {
            return (basePrice * 1.15) + 50.0;
        }
    }

    static class TrainBooking extends TransportBooking {
        public TrainBooking(double basePrice) { super(basePrice); }

        @Override
        public double calculateFinalPrice() {
            return basePrice * 1.05;
        }
    }

    static class BusBooking extends TransportBooking {
        public BusBooking(double basePrice) { super(basePrice); }

        @Override
        public double calculateFinalPrice() {
            return basePrice;
        }
    }

    static class TransportFactory {
        public static TransportBooking create(String type, double price) {
            switch (type.toUpperCase()) {
                case "FLIGHT": return new FlightBooking(price);
                case "TRAIN": return new TrainBooking(price);
                case "BUS": return new BusBooking(price);
                default: throw new IllegalArgumentException("Unknown transport type: " + type);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;

        int n = scanner.nextInt();
        List<TransportBooking> bookings = new ArrayList<>();
        List<String> types = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String type = scanner.next();
            double price = scanner.nextDouble();
            types.add(type);
            bookings.add(TransportFactory.create(type, price));
        }

        double grandTotal = 0.0;
        for (int i = 0; i < n; i++) {
            double finalPrice = bookings.get(i).calculateFinalPrice();
            grandTotal += finalPrice;
            System.out.printf("%s: %.2f%n", types.get(i), finalPrice);
        }

        System.out.printf("Total: %.2f%n", grandTotal);
        scanner.close();
    }
}