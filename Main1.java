final class Vehicle {
    final int speedLimit = 120;
    final void showLimit() {
        System.out.println("Speed Limit = " + speedLimit);
    }
}
public class Main1 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.showLimit();
    }
}
