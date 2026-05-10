import java.util.Vector;

public class VettorEx {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();

        list.add("java");
        list.add("python");
        list.add("c#");
        list.add("c#");
        list.add("c++");
        list.add("");
        list.add("NodeJs");
        list.add("c");
        System.out.println(list);
        

        list.capacity();
        System.out.println(list.capacity());

    }
}
