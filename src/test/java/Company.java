import java.util.ArrayList;

public class Company {
    public ArrayList<Employee> employees;

    public Company(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
}
