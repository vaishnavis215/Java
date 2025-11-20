
class NestedTryCatch {

    public static void main(String[] args) {
        System.out.println("Welcome to Exception Handling..");
        try {
            int arr[] = new int[5];
            try {
                arr[7] = 100;

            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Rest of the code..");
    }

}
