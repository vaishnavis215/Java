
class ThreadDemo9 extends Thread {

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());//find the current thread and give it name 
    }

    public static void main(String[] args) {
        ThreadDemo9 t1 = new ThreadDemo9();
        System.out.println(t1.getPriority());
        ThreadDemo9 t2 = new ThreadDemo9();
        System.out.println(t2.getPriority());
        ThreadDemo9 t3 = new ThreadDemo9();
        System.out.println(t3.getPriority());
        t1.setPriority(10);
        t2.setPriority(8);
        t3.setPriority(1);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

        System.out.println(Thread.currentThread().getName());//find the current thread and give it name 
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
    }
}
