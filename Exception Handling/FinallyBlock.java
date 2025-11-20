/*
Finally Block{}: is the block 
 */
class FinallyBlock {

    public static void main(String[] args) {
        System.out.println("Welcome to Exception Handling..");
        try {
            int op = 100 / 0;
            System.out.println(op);
        } catch (Exception e) {
            System.out.println(e);

        } finally {
            System.out.println("Finnaly Block always executed..either exception occurs in the code finally block still executes");
        }
        System.out.println("Rest of the code..");
    }

}
