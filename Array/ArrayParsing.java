
class ArrayParsing {

    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println("My Command line arguments array data..");
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        for (int i : arr) {
            System.err.println(i);
        }
    }

}
