package week_7.class_problems;

public class AttendanceSheet {
    private final String[] presentStudents;
    private int count;

    public AttendanceSheet(int maxCapacity) {
        this.presentStudents = new String[maxCapacity];
        this.count = 0;
    }

    public void markPresent(String studentName) {
        if (studentName == null || count >= presentStudents.length) {
            return;
        }
        if (!isPresent(studentName)) {
            presentStudents[count] = studentName;
            count++;
        }
    }

    public boolean isPresent(String studentName) {
        if (studentName == null) {
            return false;
        }
        for (int i = 0; i < count; i++) {
            if (presentStudents[i].equalsIgnoreCase(studentName)) {
                return true;
            }
        }
        return false;
    }

    public int getPresentCount() {
        return this.count;
    }

    public static void main(String[] args) {
        AttendanceSheet sheet = new AttendanceSheet(30);

        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");

        System.out.println("sheet.getPresentCount() -> " + sheet.getPresentCount());
        System.out.println("sheet.isPresent(\"Ben\") -> " + sheet.isPresent("Ben"));
        System.out.println("sheet.isPresent(\"Chen\") -> " + sheet.isPresent("Chen"));
    }
}