package package1;

class DefaultDemo {

    int no = 10;

    void displayNumber() {
        System.out.println("Value Of no=" + no);
    }
}

class DefaultTest {

    public static void main(String args[]) {
        DefaultDemo d1 = new DefaultDemo();
        d1.displayNumber();
    }
}
