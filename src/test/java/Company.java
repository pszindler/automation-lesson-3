import java.util.ArrayList;

public class Company {
    private final ArrayList<Employee> employees;

    public Company() {
        this.employees = new ArrayList<>();
    }

    public void printAllEmployees() {
        employees.forEach(System.out::println);
    }

    public void sumOfAllEmpSalary() {
        double totalSalaryOfAllEmployees = employees.stream().mapToDouble(Employee::getSalary).sum();
        System.out.printf("Total salary of all employees: %.2f\n", totalSalaryOfAllEmployees);
    }

    public void addEmployeeToList(int empCount, Employee employee) {
        System.out.println("You're going to add " + empCount + " employees");
        for (int i = 0; i < empCount; i++) {
            System.out.println(i + 1 + " Employee");
            employees.add(employee);
        }
    }

}
