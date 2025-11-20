
interface AnonymusOuter2 {

    void run();
}

class TestAnonymus2 {

    public static void main(String[] args) {
        AnonymusOuter2 a = new AnonymusOuter2() {
            public void run() {
                System.out.println("This is Anonymus class...");
            }
        };
        a.run();
    }
}
