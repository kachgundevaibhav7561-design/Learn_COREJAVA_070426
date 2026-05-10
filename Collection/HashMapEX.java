import java.util.HashMap;
public class HashMapEX {
    public static void main(String[] args) {
        
        HashMap<Integer,String> map= new HashMap<> ();

        map.put(101,"vaibhav");
        map.put(102,"yogesh");
        map.put(103,"Pooja");
        map.remove(101,"vaibhav");
        map.put(1,"java");

        System.out.println(map);



    }
}
