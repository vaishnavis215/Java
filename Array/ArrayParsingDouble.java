
class ArrayParsingDouble {

    public static void main(String[] args) {
        double arr[] = new double[10];
        System.out.println("My Command line arguments array data for double..");
        for (int i = 0; i < args.length; i++) {
            arr[i] = Double.parseDouble(args[i]);
        }
        for (double i : arr) {
            System.err.println(i);
        }
    }

}
