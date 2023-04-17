public class Operators_TP {
    public static void main(String[] args) {
        // Initialize variables
        String employeeName = "John Doe";
        double salary = 50000.00;
        double gov_tax = 0.15;
        double sss_contri = 0.0363;
        double medic = 0.0125;
        double hmdf = 100.00;

        // Calculate deductions
        double totalDeductions = salary * (gov_tax + sss_contri + medic) + hmdf;

        // Calculate net pay
        double netPay = salary - totalDeductions;

        // Print output
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: Php " + salary);
        System.out.println("Government Tax: " + gov_tax * 100 + "%");
        System.out.println("Mandatory Contribution: " + sss_contri * 100 + "%");
        System.out.println("Healthcare: " + medic * 100 + "%");
        System.out.println("HMDF: Php " + hmdf);
        System.out.println("Total Deductions: Php " + totalDeductions);
        System.out.println("Net Pay: Php " + netPay);
    }
}
