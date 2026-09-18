package week_6.class_problems;

class MessWallet {
    private double balance;

    public MessWallet(double initialBalance) {
        if (initialBalance < 0) {
            System.out.println("Warning: Opening balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        } else {
            this.balance = initialBalance;
        }
    }

    public void topUp(double amount) {
        if (amount <= 0) {
            System.out.println("TopUp rejected: Amount must be greater than 0.");
            return;
        }
        this.balance += amount;
        System.out.println("Balance after top-up: " + this.balance);
    }

    public void deduct(double amount) {
        if (amount > this.balance) {
            System.out.println("Deduct rejected: insufficient balance");
            return;
        }
        this.balance -= amount;
        System.out.println("Deducted: " + amount + " | Remaining balance: " + this.balance);
    }
    public double getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {
        MessWallet wallet = new MessWallet(500);
        wallet.topUp(200);
        wallet.deduct(1000);
        System.out.println("Final balance: " + wallet.getBalance());
    }
}