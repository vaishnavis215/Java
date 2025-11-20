
class ArrayOutOfBound {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};

        try {
            num[8] = 6;//exception accurs -index 8 out of bound
            System.out.println(num[10]);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
