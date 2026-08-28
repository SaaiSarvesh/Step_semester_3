package week_2.assigment_problems;

import java.util.Scanner;

public class ProductInventoryParser {

    public static void parseInventoryRecord(String csvLine) {
        if (csvLine == null || csvLine.trim().isEmpty()) {
            System.out.println("Invalid Record");
            return;
        }
        String[] fields = csvLine.split(",");
        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        String productName = fields[0].trim();
        String sku = fields[1].trim();
        String quantity = fields[2].trim();
        if (productName.isEmpty() || sku.isEmpty() || quantity.isEmpty()) {
            System.out.println("Invalid Record");
            return;
        }

        System.out.printf("Product: %s | SKU: %s | Qty: %s%n", productName, sku, quantity);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter CSV Record (ProductName,SKU,Quantity): ");
        String csvLine = scanner.nextLine();

        parseInventoryRecord(csvLine);

        scanner.close();
    }
}