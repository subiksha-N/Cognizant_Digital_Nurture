import java.util.ArrayList;
import java.util.Collections;

public class LambdaExpressions {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        Collections.sort(list,
                (a, b) -> a.compareTo(b));

        System.out.println(list);
    }
}
