import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeValidationHelper implements IValidate {
    @Override
    public Employee getEmployee() {
        String name = getEmployeeNameOrSurname();
        String surname = getEmployeeNameOrSurname();
        double salary = getEmployeeSalary();
        return new Employee(name, surname, salary);
    }

    public boolean validateName(String name) {
        String regex = "(?=.{2,30}$)\\p{Lu}\\p{L}+(?:\\s\\p{Lu}\\p{L}+)*";
        Pattern p = Pattern.compile(regex);

        if (name == null) {
            return true;
        }

        Matcher m = p.matcher(name);

        return m.matches();
    }

    public boolean validateSalary(String salary) {
        String regex = "-?[0-9]{4,5}(\\.[0-9]*)?";
        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(salary);

        return m.matches();
    }

    @Override
    public String getEmployeeNameOrSurname() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert Name/Surname");
        String userData = scanner.nextLine();
        while (!validateName(userData)) {
            System.out.println("Enter the correct data");
            userData = scanner.nextLine();
        }
        return userData;
    }

    @Override
    public double getEmployeeSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert Salary");
        String userData = scanner.nextLine();
        while (!validateSalary(userData)) {
            System.out.println("Enter the correct data");
            userData = scanner.nextLine();
        }
        return Double.parseDouble(userData);
    }
}
