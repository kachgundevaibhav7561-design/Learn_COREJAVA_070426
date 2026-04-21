public class stari {

    public static void main(String[] args) {
        stari obj1 = new stari();
        obj1.fun(5);
    }

    public void fun(int n) {
        if (n > 0) {
            System.out.println(n);
            System.out.println(n-1);
        }
    }
}