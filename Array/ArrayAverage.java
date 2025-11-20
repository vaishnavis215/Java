
class ArrayAverage {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        double avg = 0;
        int sum = 0;

        for (int i : arr) {
            System.out.println(i);
        }
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            avg = sum / arr.length;
        }
        System.out.println("Sum=" + sum);

        System.out.println("Average=" + avg);
    }
}
