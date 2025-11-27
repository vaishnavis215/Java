//first way:by extends thread 

class ThreadDemo extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is runing...");
    }

    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        t1.start();
    }
}
