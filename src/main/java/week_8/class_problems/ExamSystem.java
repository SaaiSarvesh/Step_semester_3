package week_8.class_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExamSystem {

    abstract static class Examination {
        protected String question;
        protected String correctAnswer;
        protected String studentAnswer;
        protected double maxMarks;

        public Examination(String question, String correctAnswer, String studentAnswer, double maxMarks) {
            this.question = question;
            this.correctAnswer = correctAnswer;
            this.studentAnswer = studentAnswer;
            this.maxMarks = maxMarks;
        }

        public abstract double calculateScore();
    }

    static class MCQExam extends Examination {
        public MCQExam(String q, String ca, String sa, double m) { super(q, ca, sa, m); }

        @Override
        public double calculateScore() {
            return studentAnswer.equalsIgnoreCase(correctAnswer) ? maxMarks : 0.0;
        }
    }

    static class TFExam extends Examination {
        public TFExam(String q, String ca, String sa, double m) { super(q, ca, sa, m); }

        @Override
        public double calculateScore() {
            return studentAnswer.equalsIgnoreCase(correctAnswer) ? maxMarks : 0.0;
        }
    }

    static class EssayExam extends Examination {
        public EssayExam(String q, String ca, String sa, double m) { super(q, ca, sa, m); }

        @Override
        public double calculateScore() {
            if (studentAnswer.equalsIgnoreCase(correctAnswer)) {
                return maxMarks;
            }
            // Partial credit rule for Essay
            return maxMarks * 0.5;
        }
    }

    static class ExamFactory {
        public static Examination create(String type, String q, String ca, String sa, double marks) {
            switch (type.toUpperCase()) {
                case "MCQ": return new MCQExam(q, ca, sa, marks);
                case "TF":
                case "TRUEFALSE": return new TFExam(q, ca, sa, marks);
                case "ESSAY": return new EssayExam(q, ca, sa, marks);
                default: throw new IllegalArgumentException("Unknown exam type: " + type);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLine()) return;

        int n = Integer.parseInt(scanner.nextLine().trim());
        List<Examination> exams = new ArrayList<>();
        List<String> types = new ArrayList<>();

        // Matches: TYPE "QUESTION" "CORRECT_ANSWER" "STUDENT_ANSWER" MARKS
        Pattern pattern = Pattern.compile("^(\\S+)\\s+\"(.*?)\"\\s+\"(.*?)\"\\s+\"(.*?)\"\\s+([0-9]+(?:\\.[0-9]+)?)$");

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine().trim();
            Matcher matcher = pattern.matcher(line);

            if (matcher.find()) {
                String type = matcher.group(1);
                String question = matcher.group(2);
                String correctAnswer = matcher.group(3);
                String studentAnswer = matcher.group(4);
                double marks = Double.parseDouble(matcher.group(5));

                types.add(type);
                exams.add(ExamFactory.create(type, question, correctAnswer, studentAnswer, marks));
            }
        }

        double totalScore = 0.0;
        for (int i = 0; i < exams.size(); i++) {
            double score = exams.get(i).calculateScore();
            totalScore += score;
            System.out.printf("%s: %.2f%n", types.get(i), score);
        }

        System.out.printf("Total Score: %.2f%n", totalScore);
        scanner.close();
    }
}