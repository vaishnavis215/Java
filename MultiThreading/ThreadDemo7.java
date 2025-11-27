//getName(): used to get a name of that method.
//setName(): set dynamic name to that method

class ThreadDemo7 extends Thread {

    public void run() {

        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadDemo7 t1 = new ThreadDemo7();

        ThreadDemo7 t2 = new ThreadDemo7();

        ThreadDemo7 t3 = new ThreadDemo7();
        t1.start();
        t2.start();
        t3.start();

        t1.setName("vaishnavi");

        t2.setName("vedika");

        t3.setName("rihan");

    }
}
