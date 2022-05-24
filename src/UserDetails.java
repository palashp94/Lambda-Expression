import java.util.regex.Pattern;

@FunctionalInterface
interface UserInterface {
    boolean validate(String str) throws CustomException;
}

public class UserDetails {
    public static void main(String[] args) throws CustomException {
        UserInterface validateFirstName = (firstName) -> {
            if (firstName.isEmpty()) {
                throw new CustomException("Invalid input");
            }
            Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
            return pattern.matcher(firstName).matches();
        };
        System.out.println(validateFirstName.validate("Palash"));

        UserInterface validateLastName = (lastName) -> {
            if (lastName.isEmpty()) {
                throw new CustomException("Invalid input");
            }
            Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
            return pattern.matcher(lastName).matches();
        };
        System.out.println(validateLastName.validate("Madney"));
    }
}