import java.lang.reflect.Method;

public class ReflectionInJava {

    public void show() {

        System.out.println("Reflection Method");
    }

    public static void main(String[] args)
            throws Exception {

        Class<?> cls =
                Class.forName("ReflectionInJava");

        Method[] methods =
                cls.getDeclaredMethods();

        for(Method m : methods) {

            System.out.println(
                    "Method: " + m.getName());
        }

        Object obj =
                cls.getDeclaredConstructor()
                        .newInstance();

        Method method =
                cls.getMethod("show");

        method.invoke(obj);
    }
}
