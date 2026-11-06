package week_11.assignment_problems_03;

public class QueueOrderCheck {

    public static int firstBreak(int[] tokens) {
        if (tokens == null || tokens.length <= 1) {
            return -1;
        }

        for (int i = 1; i < tokens.length; i++) {
            if (tokens[i] < tokens[i - 1]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] tokens1 = {3, 5, 5, 8, 6, 9};
        int[] tokens2 = {1, 2, 2, 7};

        System.out.println("Tokens 1 first break index: " + firstBreak(tokens1));
        System.out.println("Tokens 2 first break index: " + firstBreak(tokens2));
    }
}