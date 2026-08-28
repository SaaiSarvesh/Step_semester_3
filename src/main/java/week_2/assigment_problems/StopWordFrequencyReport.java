package week_2.assigment_problems;

import java.util.*;

public class StopWordFrequencyReport {

    public static void printFilteredWordFrequency(String feedback) {
        if (feedback == null || feedback.trim().isEmpty()) {
            return;
        }
        Set<String> stopWords = new HashSet<>(Arrays.asList("the", "was", "and", "a", "is", "of", "in"));
        String cleanedText = feedback.toLowerCase()
                                     .replace(",", "")
                                     .replace(".", "")
                                     .replace("!", "")
                                     .replace("?", "")
                                     .replace(";", "")
                                     .replace(":", "");
        String[] words = cleanedText.trim().split("\\s+");
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty() && !stopWords.contains(word)) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());
        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter feedback paragraph:");
        String feedback = scanner.nextLine();

        System.out.println();
        printFilteredWordFrequency(feedback);

        scanner.close();
    }
}