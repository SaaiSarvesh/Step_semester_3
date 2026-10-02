package week_8.class_problems;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LibrarySystem {

    abstract static class LibraryItem {
        protected String title;
        protected static final LocalDate CURRENT_DATE = LocalDate.of(2023, 10, 26);

        public LibraryItem(String title) {
            this.title = title;
        }

        public abstract int getBorrowDuration();

        public String getTitle() {
            return title;
        }

        public String calculateDueDate() {
            LocalDate dueDate = CURRENT_DATE.plusDays(getBorrowDuration());
            return dueDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
    }

    static class Book extends LibraryItem {
        public Book(String title) { super(title); }
        @Override public int getBorrowDuration() { return 14; }
    }

    static class DVD extends LibraryItem {
        public DVD(String title) { super(title); }
        @Override public int getBorrowDuration() { return 7; }
    }

    static class Magazine extends LibraryItem {
        public Magazine(String title) { super(title); }
        @Override public int getBorrowDuration() { return 3; }
    }

    static class LibraryItemFactory {
        public static LibraryItem create(String type, String title) {
            switch (type.toUpperCase()) {
                case "BOOK": return new Book(title);
                case "DVD": return new DVD(title);
                case "MAGAZINE": return new Magazine(title);
                default: throw new IllegalArgumentException("Unknown item type: " + type);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;

        int n = Integer.parseInt(scanner.nextLine().trim());
        List<LibraryItem> items = new ArrayList<>();


        Pattern pattern = Pattern.compile("^(\\S+)\\s+\"(.*)\"$");

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine().trim();
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                String type = matcher.group(1);
                String title = matcher.group(2);
                items.add(LibraryItemFactory.create(type, title));
            }
        }

        for (LibraryItem item : items) {
            System.out.printf("%s: %s%n", item.getTitle(), item.calculateDueDate());
        }

        scanner.close();
    }
}