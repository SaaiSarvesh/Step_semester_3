package week_11.assignment_problems_03;

public class LibraryBookShelf {

    public static void shelf(int[] books) {
        int n = books.length;

        for (int i = 1; i < n; i++) {
            int key = books[i];
            int j = i - 1;

            while (j >= 0 && books[j] > key) {
                books[j + 1] = books[j];
                j--;
            }
            books[j + 1] = key;

            printShelf(books, key);
        }
    }

    private static void printShelf(int[] books, int placedBook) {
        System.out.print("After placing " + placedBook + ": [");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i] + (i < books.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] books = {30, 10, 40, 20};
        shelf(books);
    }
}