public class usingparameter {

    public static void main(String[] args) {
        usingparameter obj1 = new usingparameter();
        int result = obj1.addition(12, 12);
        System.out.println("Result: " + result);
    }

    public int addition(int a, int b) {
        return a + b;
    }
}