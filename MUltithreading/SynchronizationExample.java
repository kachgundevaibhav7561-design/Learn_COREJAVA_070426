public class SynchronizationExample {
    public static void main(String[] args) throws Exception {

        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();   // wait t1
        t2.join();   // wait t2  ✅ fixed

        System.out.println("count = " + c.count);
    }
}

class Counter {
    int count = 0;

    synchronized void increment() {   // ✅ fixed
        count++;
    }
}