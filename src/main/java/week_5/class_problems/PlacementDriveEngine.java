package week_5.class_problems;

import java.util.Arrays;

public class PlacementDriveEngine {

    public static class Candidate implements Comparable<Candidate> {
        private String name;
        private double cgpa;
        private int codingScore;

        public Candidate(String name, double cgpa, int codingScore) {
            this.name = name;
            this.cgpa = cgpa;
            this.codingScore = codingScore;
        }

        public String getName() {
            return name;
        }

        public double getCgpa() {
            return cgpa;
        }

        public int getCodingScore() {
            return codingScore;
        }
        public double getCompositeScore() {
            return (this.cgpa * 10) + this.codingScore;
        }

  
        public static boolean isEligible(double cgpa) {
            return cgpa >= 7.5;
        }

        public static boolean isEligible(double cgpa, int codingScore) {
            if (isEligible(cgpa)) {
                return true;
            }
            return cgpa >= 6.5 && codingScore >= 60;
        }
        @Override
        public int compareTo(Candidate other) {
            return Double.compare(other.getCompositeScore(), this.getCompositeScore());
        }
    }

    public static String shortlistAndRank(Candidate[] candidates) {
        if (candidates == null || candidates.length == 0) {
            return "";
        }
        Candidate[] temp = new Candidate[candidates.length];
        int count = 0;

        for (Candidate c : candidates) {
            if (Candidate.isEligible(c.getCgpa(), c.getCodingScore())) {
                temp[count++] = c;
            }
        }
        Candidate[] shortlisted = Arrays.copyOf(temp, count);
        Arrays.sort(shortlisted);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < shortlisted.length; i++) {
            sb.append(i + 1)
              .append(". ")
              .append(shortlisted[i].getName())
              .append(" (")
              .append(shortlisted[i].getCompositeScore())
              .append(")");

            if (i < shortlisted.length - 1) {
                sb.append(" | ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Candidate[] batch = {
            new Candidate("Aisha", 8.2, 40),
            new Candidate("Rohit", 6.8, 65),
            new Candidate("Meena", 6.0, 90),
            new Candidate("Karan", 7.5, 20)
        };

        System.out.println(shortlistAndRank(batch));
    }
}