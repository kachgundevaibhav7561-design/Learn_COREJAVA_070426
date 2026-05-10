public class sleepLoopexample {
    public static void main(String[] args) {
        try {
            for (int i = 1; i <= 6; i++) {
                System.out.println("Thread Running ="  + i);
                Thread.sleep(3000);

            }
        } catch (InterruptedException e) {
            System.out.println(e);

        }
    }
}
