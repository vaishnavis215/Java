
class DoubleParse {

    public static void main(String[] args) {
        double arr[] = new double[10];

        for (int i = 0; i < args.length; i++) {
            arr[i] = Double.parseDouble(args[i]);
        }
        for (double i : arr) {
            System.err.println(i);
        }
    }
}
