
class MultipleCatch {

    public static void main(String[] args) {
        System.out.println("Welcome to exception handling...");

        int a = 10;
        int b = 0;
        // String s = null;
        // System.out.println(s.length());
        int arr[] = new int[5];
        try {
            arr[9] = 100;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Rest of the code of my program..");
    }
}
