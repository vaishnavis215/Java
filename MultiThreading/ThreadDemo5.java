//what if we call run method directly..insted of start method
//run(): it act like a object.
//sleep method used to wait before execution.
//pause the current thread execution for miliseconds.

class ThreadDemo5 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadDemo5 t1 = new ThreadDemo5();
        t1.start();
        ThreadDemo5 t2 = new ThreadDemo5();
        t2.start();
    }
}
