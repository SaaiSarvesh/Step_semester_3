package week_7.class_problems;

public class PiggyBank {
    private final String id;
    private double savings;

    public PiggyBank(String id) {
        this.id = id;
        this.savings = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.savings += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= this.savings) {
            this.savings -= amount;
            return true;
        }
        return false;
    }

    public double getSavings() {
        return this.savings;
    }

    public String getId() {
        return this.id;
    }

    public static void main(String[] args) {
        PiggyBank pb = new PiggyBank("PB-1");
        
        pb.deposit(100);
        System.out.println("pb.deposit(100) -> savings = " + pb.getSavings());

        pb.withdraw(30);
        System.out.println("pb.withdraw(30) -> savings = " + pb.getSavings());

        boolean success = pb.withdraw(500);
        if (!success) {
            System.out.println("pb.withdraw(500) -> rejected, savings stays " + pb.getSavings());
        }
    }
}