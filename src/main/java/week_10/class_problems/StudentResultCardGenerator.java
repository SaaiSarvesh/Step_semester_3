package week_10.class_problems;

class Student {
    private String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    public void printResultCard() {
        double avg = calculateAverage();
        char grade;
        
        if (avg >= 75) {
            grade = 'B';
        } else if (avg >= 40 && avg <= 59) {
            grade = 'D';
        } else if (avg >= 60) {
            grade = 'C';
        } else if (avg >= 90) {
            grade = 'A';
        } else {
            grade = 'F';
        }
        
        System.out.println(name.toUpperCase() + ": Average " + String.format("%.1f", avg) + ", Grade " + grade);
    }
}

public class StudentResultCardGenerator {
    public static void main(String[] args) {
        Student s1 = new Student("Asha", new int[]{80, 90, 70});
        Student s2 = new Student("Ravi", new int[]{60, 55, 50});
        
        s1.printResultCard();
        s2.printResultCard();
    }
}