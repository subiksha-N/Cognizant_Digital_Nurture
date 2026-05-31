import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Dharaneesh");
        students.add("Karthik");
        students.add("Vignesh");

        for(String name : students) {

            System.out.println(name);
        }
    }
}
