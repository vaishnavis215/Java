//Create a InvalidAgeException for validating age of user?
//

class InvalidAgeException extends Exception {

    public InvalidAgeException(String age) {
        super(age);
    }

}

class AgeException {

    public static void main(String[] args) {
        try {
            throw new InvalidAgeException("Inavlid Age...")
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Rest of the code..");
    }
}
