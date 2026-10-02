package week_8.class_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class PaymentMethod {
    protected double amount;

    public PaymentMethod(double amount) {
        this.amount = amount;
    }

    public abstract double calculateFinalAmount();
}

class CardPayment extends PaymentMethod {
    public CardPayment(double amount) {
        super(amount);
    }

    @Override
    public double calculateFinalAmount() {
        return amount * 1.02;
    }
}

class WalletPayment extends PaymentMethod {
    public WalletPayment(double amount) {
        super(amount);
    }

    @Override
    public double calculateFinalAmount() {
        return amount * 1.01;
    }
}

class BankTransferPayment extends PaymentMethod {
    public BankTransferPayment(double amount) {
        super(amount);
    }

    @Override
    public double calculateFinalAmount() {
        return amount;
    }
}

class PaymentFactory {
    public static PaymentMethod create(String type, double amount) {
        switch (type.toUpperCase()) {
            case "CARD":
                return new CardPayment(amount);
            case "WALLET":
                return new WalletPayment(amount);
            case "BANKTRANSFER":
                return new BankTransferPayment(amount);
            default:
                throw new IllegalArgumentException("Unknown payment type: " + type);
        }
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;

        int n = scanner.nextInt();
        List<PaymentMethod> transactions = new ArrayList<>();
        List<String> types = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String type = scanner.next();
            double amount = scanner.nextDouble();
            types.add(type);
            transactions.add(PaymentFactory.create(type, amount));
        }

        double grandTotal = 0.0;
        for (int i = 0; i < n; i++) {
            PaymentMethod payment = transactions.get(i);
            double finalAmount = payment.calculateFinalAmount();
            grandTotal += finalAmount;
            System.out.printf("%s: %.2f%n", types.get(i), finalAmount);
        }

        System.out.printf("Total: %.2f%n", grandTotal);
        scanner.close();
    }
}