package week_6.assignment_problems;

class Employee {
    private String empId;
    private String empName;
    private double salary;
    private boolean isIntern;

    public Employee(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    public Employee(String empId, String empName) {
        this(empId, empName, 0.0);
        this.isIntern = true;
    }

    public void printProfile() {
        System.out.println(this.empId + " | " + this.empName + " | Rs " + this.salary + " | Intern: " + this.isIntern);
    }

    public static void main(String[] args) {
        Employee permanent = new Employee("E-101", "Divya", 65000.0);
        Employee intern = new Employee("E-102", "Arjun");
        permanent.printProfile();
        intern.printProfile();
    }
}