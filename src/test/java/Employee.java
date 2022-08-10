import java.util.ArrayList;

public class Employee {
    final private String name;
    final private String surname;

    final private double salary;

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    private double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee: " + name + " " + surname + ", Salary: " + salary;
    }

    public static void printAllEmployees(Company company) {
        ArrayList<Employee> cmp = company.getEmployees();
        for (Employee emp : cmp) {
            System.out.println(emp);
        }
    }

    public static void sumOfAllEmpSalary(Company company) {
        ArrayList<Employee> cmp = company.getEmployees();
        double totalSalaryOfAllEmployees = 0;
        for (Employee emp : cmp) {
            totalSalaryOfAllEmployees += emp.getSalary();
        }
        System.out.printf("Total salary of all employees: %.2f", totalSalaryOfAllEmployees);
    }
}
