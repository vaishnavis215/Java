
class ArrayCopy {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int arr2[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        for (int i : arr) {
            System.out.println(i);
        }
        for (int i : arr2) {
            System.out.println(i);

        }

    }

}
