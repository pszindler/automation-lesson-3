import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean endProgram = false;
        Company company = generateCompany();
        generateEmployeesAndAddToCompanyList(1, company);
        programLogic(endProgram, company);
    }

    private static void generateEmployeesAndAddToCompanyList(int empCount, Company company) {
        System.out.println("You're going to add " + empCount + " employees");
        for (int i = 0; i < empCount; i++) {
            System.out.println(i + 1 + " Employee");
            company.employees.add(generateEmp());
        }
    }

    private static Employee generateEmp() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first name");
        String name = scn.nextLine();
        System.out.println("Enter surname");
        String surname = scn.nextLine();
        System.out.println("Enter salary");
        double salary = scn.nextDouble();
        return new Employee(name, surname, salary);
    }

    private static boolean userMenu(int menuOption, Company company, boolean endProgram) {
        switch (menuOption) {
            case 1 -> Employee.sumOfAllEmpSalary(company);
            case 2 -> Employee.printAllEmployees(company);
            case 3 -> generateEmployeesAndAddToCompanyList(1, company);
            case 4 -> {
                return true;
            }
            default -> System.out.println("Unknown error - problem with user menu");
        }
        return false;
    }

    private static void programLogic(boolean endProgram, Company company) {
        while (!endProgram) {
            System.out.println("""
                                        
                    --------------------------------------                 
                    1 – Print sum of all employees salary |
                                                          | 
                    2 – Display all employees data        |
                                                          |  
                    3 – Add new employee                  |          
                                                          |
                    4 – End program""");
            int menuOption = checkForCorrectMenuOption();
            endProgram = userMenu(menuOption, company, endProgram);
        }
        System.out.println("Bye bye!");
    }

    private static Company generateCompany() {
        ArrayList<Employee> employees = new ArrayList<>();
        return new Company(employees);
    }

    private static int checkForCorrectMenuOption() {
        Scanner scn = new Scanner(System.in);
        String menuOption = "";
        String[] arrayOfCorrectMenuOptions = {"1", "2", "3", "4"};
        while (!Arrays.asList(arrayOfCorrectMenuOptions).contains(menuOption)) {
            menuOption = scn.nextLine();
        }
        return Integer.parseInt(menuOption);
    }

}
