public interface IValidate {
    Employee getEmployee();

    boolean validateName(String name);

    boolean validateSalary(String salary);

    String getEmployeeNameOrSurname();

    double getEmployeeSalary();


}
