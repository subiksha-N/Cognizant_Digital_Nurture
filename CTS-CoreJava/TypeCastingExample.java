public class TypeCastingExample {
    public static void main(String[] args) {

        double d = 10.75;
        int num = (int) d;

        System.out.println("Double to Int: " + num);

        int x = 25;
        double y = x;

        System.out.println("Int to Double: " + y);
    }
}
