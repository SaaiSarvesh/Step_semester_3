package week_11.class_problems;

import java.util.HashSet;
import java.util.Set;

public class TransactionDuplicateCheck {

    public static boolean hasDuplicate(String[] transactionIds) {
        Set<String> seen = new HashSet<>();
        for (String id : transactionIds) {
            if (!seen.add(id)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] txns1 = {"TXN1001", "TXN1002", "TXN1003", "TXN1002", "TXN1004"};
        String[] txns2 = {"TXN2001", "TXN2002", "TXN2003"};

        System.out.println("Batch 1 has duplicates: " + hasDuplicate(txns1));
        System.out.println("Batch 2 has duplicates: " + hasDuplicate(txns2));
    }
}