
class LargestAndSmallestElement {

    public static void main(String[] args) {
        int arr[] = new int[5];
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest Number=" + max);

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }

        }
        System.out.println("Smallest Number=" + min);

    }
}
