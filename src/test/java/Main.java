import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        EmployeeValidationHelper employeeValidationHelper = new EmployeeValidationHelper();
        company.addEmployeeToList(1, employeeValidationHelper.getEmployee());
        programLogic(company);
    }

    private static void userMenu(int menuOption, Company company) {
        EmployeeValidationHelper vh = new EmployeeValidationHelper();
        switch (menuOption) {
            case 1 -> company.sumOfAllEmpSalary();
            case 2 -> company.printAllEmployees();
            case 3 -> company.addEmployeeToList(1, vh.getEmployee());
            case 4 -> {
                System.out.println("Bye bye!");
                System.exit(0);
            }
            default -> System.out.println("Unknown error - problem with user menu");
        }
    }

    private static void programLogic(Company company) {
        while (true) {
            System.out.println("""
                           
                    1 – Print sum of all employees salary
                                                          
                    2 – Display all employees data
                                                            
                    3 – Add new employee
                                                          
                    4 – End program""");
            int menuOption = checkForCorrectMenuOption();
            userMenu(menuOption, company);
        }
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
