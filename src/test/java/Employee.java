public class Employee {
    final private String name;
    final private String surname;
    final private double salary;

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee: " + name + " " + surname + ", Salary: " + salary;
    }

}
