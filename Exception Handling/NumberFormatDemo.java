
class NumberFormatDemo {

    public static void main(String[] args) {
        String s = "Radha";

        try {
            int no = Integer.parseInt(s);//we can't convert string into int

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
