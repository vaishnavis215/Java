
class StringOutOfBound {

    public static void main(String[] args) {
        String s = "Vaishnavi";

        try {
            System.out.println(s.charAt(10));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
