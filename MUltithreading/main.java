class MYThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task1 " + i);
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 6; i++) {
            System.out.println("Task2 " + i);
        }
    }
}

public class main {
    public static void main(String[] args) {

        MYThread1 t1 = new MYThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();   // start thread 1
        t2.start();   // start thread 2
    }
}