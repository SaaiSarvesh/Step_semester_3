package week_11.assignment_problems_05;

public class DiceThrowTally {

    public static int[] diceSort(int[] rolls) {
        int[] count = new int[7]; 

        for (int roll : rolls) {
            if (roll >= 1 && roll <= 6) {
                count[roll]++;
            }
        }

        System.out.print("Counts: ");
        for (int v = 1; v <= 6; v++) {
            System.out.print(v + ":" + count[v] + (v < 6 ? " " : ""));
        }
        System.out.println();

        int[] sorted = new int[rolls.length];
        int index = 0;
        for (int v = 1; v <= 6; v++) {
            for (int c = 0; c < count[v]; c++) {
                sorted[index++] = v;
            }
        }

        return sorted;
    }

    public static void main(String[] args) {
        int[] rolls1 = {4, 1, 6, 4, 2, 1, 4};
        int[] sorted1 = diceSort(rolls1);
        
        System.out.print("Sorted: [");
        for (int i = 0; i < sorted1.length; i++) {
            System.out.print(sorted1[i] + (i < sorted1.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}