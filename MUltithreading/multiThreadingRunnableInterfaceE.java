class MyTask implements Runnable{
    public void run(){
        System.out.println("Thread using Runnnable");
    }

}

public class multiThreadingRunnableInterfaceE {
    public static void main(String[] args) {

        //create runnable object
       // Runnable task = new MyTask();
        MyTask task=new MyTask();

        //setp2 create therad object ans pass runnable obj
         Thread t1 = new Thread(task,"Fct Thread");

         //start
         t1.start();
         System.out.println(t1.getName());
    

        
        
    }
}
