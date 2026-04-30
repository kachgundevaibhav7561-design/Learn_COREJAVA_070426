import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Vaibhav");
        set.add("Rahul");
        set.add("Amit");

        // Iterator
        System.out.println("Using Iterator");
        Iterator<String> it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // hashCode
        System.out.println("HashCode of set: " + set.hashCode());
    }
}