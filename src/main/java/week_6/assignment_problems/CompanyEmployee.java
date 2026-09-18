package week_6.assignment_problems;

class CompanyEmployee {
    private String empName;
    private double salary;
    public static String companyName = "Bright Horizon Technologies";
    public static int employeeCount = 0;
    public CompanyEmployee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++; 
    }


    public static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {
        CompanyEmployee e1 = new CompanyEmployee("Anand", 50000.0);
        CompanyEmployee e2 = new CompanyEmployee("Kavita", 62000.0);
        CompanyEmployee e3 = new CompanyEmployee("Suresh", 48000.0);
        CompanyEmployee.printCompanyInfo();
    }
}