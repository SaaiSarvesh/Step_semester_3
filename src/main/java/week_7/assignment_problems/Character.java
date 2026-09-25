package week_7.assignment_problems;

public class Character {
    private final int maxHealth;
    private int currentHealth;

    public Character(int maxHealth) {
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
    }

    public void takeDamage(int amount) {
        if (amount > 0) {
            this.currentHealth -= amount;
            if (this.currentHealth < 0) {
                this.currentHealth = 0;
            }
        }
    }

    public void heal(int amount) {
        if (amount > 0) {
            this.currentHealth += amount;
            if (this.currentHealth > this.maxHealth) {
                this.currentHealth = this.maxHealth;
            }
        }
    }

    public int getHealth() {
        return this.currentHealth;
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public static void main(String[] args) {
        Character c = new Character(100);

        c.takeDamage(30);
        System.out.println("c.takeDamage(30) -> health = " + c.getHealth());

        c.heal(50);
        System.out.println("c.heal(50) -> health = " + c.getHealth() + " (capped)");

        c.takeDamage(150);
        System.out.println("c.takeDamage(150) -> health = " + c.getHealth() + " (floored)");
    }
}