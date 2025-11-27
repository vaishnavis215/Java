//Thread Priority:order of execution but its ni guranteed
//1-10 1-lowest(MIN_PRIORITY) 10-highest(MAX_PRIORITY) 5-normal(NORM_PRIORITY)
//1)getPriority():used to get priority of thread
//2)setPriority():used to set our own priority to the thread

class ThreadDemo8 extends Thread {

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());//find the current thread and give it name 
    }

    public static void main(String[] args) {
        ThreadDemo8 t1 = new ThreadDemo8();
        System.out.println(t1.getPriority());
        ThreadDemo8 t2 = new ThreadDemo8();
        System.out.println(t2.getPriority());
        ThreadDemo8 t3 = new ThreadDemo8();
        System.out.println(t3.getPriority());
        t1.setPriority(10);
        t2.setPriority(8);
        t3.setPriority(1);

        System.out.println(Thread.currentThread().getName());//find the current thread and give it name 

    }
}
