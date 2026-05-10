import java.util.Hashtable;
public class HashTableEx {
    public static void main(String[] args) {

        Hashtable<Integer,String> map=new Hashtable<>();

        map.put(1, "java");
        map.put(2, "python");
        map.put(1, "c#");

        map.remove(1,"java");

        System.out.println(map);
        
    }
}
