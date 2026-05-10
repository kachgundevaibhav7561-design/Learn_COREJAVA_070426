public class sleepEx {
    public static void main(String[] args) {
        
        try{
            System.out.println("program started");
            Thread.sleep(5000);
            System.out.println("program Resumed After 5 seconds");
        } catch(InterruptedException e){
            System.out.println(e);
        }
    }
}



