
class ThreadDemo2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is runing...");
    }

    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        Thread t2 = new Thread(t1);
        t2.start();
    }
}
