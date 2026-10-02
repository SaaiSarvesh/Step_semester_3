package week_8.assignment_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HostelElectricity {

    abstract static class Room {
        protected int units;

        public Room(int units) {
            this.units = units;
        }

        public abstract double calculateBill();
    }

    static class SingleRoom extends Room {
        public SingleRoom(int units) { super(units); }

        @Override
        public double calculateBill() {
            return units * 8.0;
        }
    }

    static class SharedRoom extends Room {
        private int occupants;

        public SharedRoom(int units, int occupants) {
            super(units);
            this.occupants = occupants;
        }

        @Override
        public double calculateBill() {
            return (units * 6.0) / occupants;
        }
    }

    static class ACRoom extends Room {
        public ACRoom(int units) { super(units); }

        @Override
        public double calculateBill() {
            return (units * 10.0) + 200.0;
        }
    }

    static class RoomFactory {
        public static Room create(String line) {
            String[] parts = line.trim().split("\\s+");
            String type = parts[0].toUpperCase();
            int units = Integer.parseInt(parts[1]);

            switch (type) {
                case "SINGLE":
                    return new SingleRoom(units);
                case "SHARED":
                    int occupants = Integer.parseInt(parts[2]);
                    return new SharedRoom(units, occupants);
                case "AC":
                    return new ACRoom(units);
                default:
                    throw new IllegalArgumentException("Unknown room type: " + type);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;

        int n = Integer.parseInt(scanner.next().trim());
        scanner.nextLine();

        List<Room> rooms = new ArrayList<>();
        List<String> types = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine().trim();
            types.add(line.split("\\s+")[0].toUpperCase());
            rooms.add(RoomFactory.create(line));
        }

        double grandTotal = 0.0;
        for (int i = 0; i < n; i++) {
            double bill = rooms.get(i).calculateBill();
            grandTotal += bill;
            System.out.printf("%s: %.2f%n", types.get(i), bill);
        }

        System.out.printf("Total: %.2f%n", grandTotal);
        scanner.close();
    }
}