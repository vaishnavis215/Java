class Counter {
    static int count = 0;   // static variable
    int id;                 // instance variable

    Counter(int id) {
        this.id = id;
        count++;            // increments for all objects
    }

    static void totalObjects() {  // static method
        System.out.println("Total objects: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter(1);
        Counter c2 = new Counter(2);

        Counter.totalObjects(); // Output: Total objects: 2
    }
}
