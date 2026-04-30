import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class linkedListMethod {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        // Add

        list.add("Java");
        list.add("C#");
        list.add("Python");

        // add first, and add last
        list.addFirst("start");
        list.addLast("end");

        // get
        System.out.println("get(2)" + list.get(2));
        System.out.println("get(2)" + list.getFirst());
        System.out.println("get(2)" + list.getLast());

        // set
        list.set(2, "dOT net");

        // REMOVVE
        list.remove();
        list.removeFirst();
        list.removeLast();
        list.remove(1);
        System.out.println("After remove" + list);

        // contains

        System.out.println(list.contains("java"));

        // size
        System.out.println("Size" + list.size());

        // Add All
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("GO");
        list2.add("Rust");
        list2.addAll(list2);

        // remove all
        list.removeAll(list2);
        // retainAll
        list.add("java");
        list.retainAll(Collections.singleton("java"));

        // queue methods
        list.offer("new");
        System.out.println("peak :" + list.peek());
        System.out.println("poll :" + list.poll());

    }
}
