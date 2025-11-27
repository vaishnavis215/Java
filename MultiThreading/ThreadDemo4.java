//first way:by extends thread 

class ThreadDemo4 extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is runing...");
    }

    public static void main(String[] args) {
        ThreadDemo4 t1 = new ThreadDemo4();
        t1.start();
        t1.start();
    }
}
