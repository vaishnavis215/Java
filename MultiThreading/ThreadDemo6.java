//join method():it will ask other thread to wait until current thread completely executed.
//

class ThreadDemo6 extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadDemo5 t1 = new ThreadDemo5();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        ThreadDemo5 t2 = new ThreadDemo5();
        t2.start();
        ThreadDemo5 t3 = new ThreadDemo5();
        t3.start();

    }
}
