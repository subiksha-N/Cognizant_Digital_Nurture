import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Dharaneesh");
        map.put(102, "Karthik");

        System.out.println(map);

        System.out.println("Student = " + map.get(101));
    }
}
