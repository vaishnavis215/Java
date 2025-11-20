//WAP to perform sum of first 10 natural numbers using array and dynamic input using command line

class ArraySum {

    public static void main(String[] args) {
        int arr[] = new int[10];
        int sum = 0;

        System.err.println("Input of 10 natural number..");
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);

        }
        for (int i : arr) {
            sum = sum + i;
            System.err.println(i);
        }
        System.out.println("Sum=" + sum);
    }
}
