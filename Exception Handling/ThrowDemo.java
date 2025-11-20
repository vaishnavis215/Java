
import java.io.*;

/*
-Throw Keyword:Is used to  forcefully raise exception in program.
-Run time Exception
-unchecked Exception
-custom Exception:To create custom exception 
-create one class and use it in exception
 */
class InvalidAgeException extends Exception {

    public InvalidAgeException(String str) {
        super(str);
    }
}

class ThrowDemo {

    public static void validate(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Invalid Age for Voting..");

        } else {
            System.out.println("Valid Age..");
        }

    }

    public static void main(String[] args) {
        try {
            validate(15);
        } catch (InvalidAgeException e) {
            System.out.println(e);
        }
        System.out.println("Rest of the code..");
    }

}
