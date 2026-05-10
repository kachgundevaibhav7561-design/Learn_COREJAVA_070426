class MyThread extends Thread{
    public void run(){
        System.out.println("thread is running");
        System.out.println(Thread.currentThread().getName());
    }


}



public class multiThreadsEx {

    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.start(); // start new thread

        System.out.println("----------------");


        Thread t2=new Thread("Fct thread");
        t2.start();
        System.out.println(t2.getName());

        System.out.println("-----------=--");



        //naming thead current thread
        MyThread t3 = new MyThread();

        t3.setName("3rd Thread");
        t3.start();

    }
}
