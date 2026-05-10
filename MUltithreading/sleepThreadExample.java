public class sleepThreadExample {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
        
    }
}

class MyThread extends Thread{
    public void run(){
        try{
            for (int i = 1; i <=5; i++) {
                System.out.println("Thread Runing :"+ i);
                Thread.sleep(1000);
                
            }
        } catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
 