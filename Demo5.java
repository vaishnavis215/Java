
class Demo5 {

    public static void main(String args[]) {
        int op = 2;
        int a = 10;
        int b = 20;
        switch (op) {
            case 1:
                System.out.println("Addition=" + (a + b));
                break;
            case 2:
                System.out.println("substraction=" + (a - b));
                break;
            case 3:
                System.out.println("Multiplication=" + (a * b));
                break;
            case 4:
                System.out.println("Division=" + (a / b));
                break;
            default:
                System.out.println("Invalid input..");

        }
    }

}
