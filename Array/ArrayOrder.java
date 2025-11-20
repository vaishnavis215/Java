
class ArrayOrder {

    public static void main(String[] args) {
        int arr[] = {1, 8, 4, 9, 5, 6, 7, 3};
        int temp;

        for (int i : arr) {
            System.out.println(i);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println("Array in Ascending order..");
        for (int i : arr) {
            System.out.println(i);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println("Array in Descending order..");
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
