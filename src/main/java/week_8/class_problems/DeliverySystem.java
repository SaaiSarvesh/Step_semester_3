package week_8.class_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeliverySystem {

    abstract static class Delivery {
        protected double distance;

        public Delivery(double distance) {
            this.distance = distance;
        }

        public abstract double calculateFee();
    }

    static class StandardDelivery extends Delivery {
        private double weight;

        public StandardDelivery(double distance, double weight) {
            super(distance);
            this.weight = weight;
        }

        @Override
        public double calculateFee() {
            return (distance * 1.0) + (weight * 0.5);
        }
    }

    static class ExpressDelivery extends Delivery {
        private double weight;

        public ExpressDelivery(double distance, double weight) {
            super(distance);
            this.weight = weight;
        }

        @Override
        public double calculateFee() {
            return (distance * 1.5) + (weight * 0.8) + 10.0;
        }
    }

    static class InternationalDelivery extends Delivery {
        private double weight;
        private double customsFee;

        public InternationalDelivery(double distance, double weight, double customsFee) {
            super(distance);
            this.weight = weight;
            this.customsFee = customsFee;
        }

        @Override
        public double calculateFee() {
            return (distance * 2.5) + (weight * 1.2) + customsFee;
        }
    }

    static class DeliveryFactory {
        public static Delivery create(String input) {
            String[] parts = input.trim().split("\\s+");
            String type = parts[0].toUpperCase();
            double distance = Double.parseDouble(parts[1]);
            double weight = Double.parseDouble(parts[2]);

            switch (type) {
                case "STANDARD":
                    return new StandardDelivery(distance, weight);
                case "EXPRESS":
                    return new ExpressDelivery(distance, weight);
                case "INTERNATIONAL":
                    double customsFee = Double.parseDouble(parts[3]);
                    return new InternationalDelivery(distance, weight, customsFee);
                default:
                    throw new IllegalArgumentException("Unknown type: " + type);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;

        int n = Integer.parseInt(scanner.next().trim());
        scanner.nextLine();

        List<Delivery> deliveries = new ArrayList<>();
        List<String> types = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine().trim();
            types.add(line.split("\\s+")[0].toUpperCase());
            deliveries.add(DeliveryFactory.create(line));
        }

        double total = 0.0;
        for (int i = 0; i < n; i++) {
            double fee = deliveries.get(i).calculateFee();
            total += fee;
            System.out.printf("%s: %.2f%n", types.get(i), fee);
        }

        System.out.printf("Total: %.2f%n", total);
        scanner.close();
    }
}