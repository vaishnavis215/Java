
class ArrayDemo {

    public static void main(String[] args) {
        // int arr[] = {10, 20, 30, 40, 50};
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println("Output using for loop..");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Output using for-each loop..");
        for (int j : arr) {
            System.out.println(j);
        }
    }

}
