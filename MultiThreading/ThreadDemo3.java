//second way:by implementing runnable interface

class ThreadDemo3 implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is runing...");
    }

    public static void main(String[] args) {
        Runnable r1 = new ThreadDemo3();
        Thread t2 = new Thread(r1, "Thread..");
        t2.start();
        String s1 = t2.getName();
        System.out.println(s1);
    }
}
