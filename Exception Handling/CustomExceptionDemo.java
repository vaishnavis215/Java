
class AddressException extends Exception {

    public AddressException(String str) {
        super(str);
    }
}

class CustomExceptionDemo {

    public static void main(String[] args) {
        try {
            throw new AddressException("Invalid Address..");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Rest of the code..");
    }

}
