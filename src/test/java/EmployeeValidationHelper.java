import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeValidationHelper {

    public static boolean isValidName(String name) {
        String regex = "(?=.{2,30}$)\\p{Lu}\\p{L}+(?:\\s\\p{Lu}\\p{L}+)*";
        Pattern p = Pattern.compile(regex);

        if (name == null) {
            return true;
        }

        Matcher m = p.matcher(name);

        return !m.matches();
    }

    public static boolean isValidSalary(String salary) {
        String regex = "-?[0-9]{4,5}(\\.[0-9]*)?";
        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(salary);

        return !m.matches();
    }
}
