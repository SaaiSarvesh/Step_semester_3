package week_8.assignment_problems;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StreamingPlan {

    abstract static class Subscription {
        protected String name;
        protected LocalDate startDate;

        public Subscription(String name, LocalDate startDate) {
            this.name = name;
            this.startDate = startDate;
        }

        public String getName() {
            return name;
        }

        public abstract int getValidityDays();

        public String calculateRenewalDate() {
            LocalDate renewal = startDate.plusDays(getValidityDays());
            return renewal.format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
    }

    static class BasicPlan extends Subscription {
        public BasicPlan(String name, LocalDate startDate) { super(name, startDate); }
        @Override public int getValidityDays() { return 30; }
    }

    static class StandardPlan extends Subscription {
        public StandardPlan(String name, LocalDate startDate) { super(name, startDate); }
        @Override public int getValidityDays() { return 90; }
    }

    static class PremiumPlan extends Subscription {
        public PremiumPlan(String name, LocalDate startDate) { super(name, startDate); }
        @Override public int getValidityDays() { return 365; }
    }

    static class SubscriptionFactory {
        public static Subscription create(String type, String name, String startDateStr) {
            LocalDate startDate = LocalDate.parse(startDateStr);
            switch (type.toUpperCase()) {
                case "BASIC": return new BasicPlan(name, startDate);
                case "STANDARD": return new StandardPlan(name, startDate);
                case "PREMIUM": return new PremiumPlan(name, startDate);
                default: throw new IllegalArgumentException("Unknown plan type: " + type);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;

        int n = scanner.nextInt();
        List<Subscription> subscriptions = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String type = scanner.next();
            String name = scanner.next();
            String startDateStr = scanner.next();
            subscriptions.add(SubscriptionFactory.create(type, name, startDateStr));
        }

        for (Subscription sub : subscriptions) {
            System.out.printf("%s: %s%n", sub.getName(), sub.calculateRenewalDate());
        }

        scanner.close();
    }
}
}