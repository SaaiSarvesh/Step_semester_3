package week_7.assignment_problems;

public class Cart {
    private final String cartId;
    private final double[] itemPrices;
    private int itemCount;

    public Cart(String cartId, int maxItems) {
        this.cartId = cartId;
        this.itemPrices = new double[maxItems];
        this.itemCount = 0;
    }

    public void addItem(double price) {
        if (price >= 0 && itemCount < itemPrices.length) {
            itemPrices[itemCount] = price;
            itemCount++;
        }
    }

    public double getTotal() {
        double total = 0.0;
        for (int i = 0; i < itemCount; i++) {
            total += itemPrices[i];
        }
        return total;
    }

    public int getItemCount() {
        return this.itemCount;
    }

    public String getCartId() {
        return this.cartId;
    }

    public static void main(String[] args) {
        Cart cart = new Cart("CART-5", 20);

        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);

        System.out.println("cart.getTotal() -> " + (int) cart.getTotal());
        System.out.println("cart.getItemCount() -> " + cart.getItemCount());
    }
}