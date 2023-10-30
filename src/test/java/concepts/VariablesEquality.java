package concepts;

public class VariablesEquality {


    public static void main(String[] args) {
        // Using == and equals() for integers
        Integer a = 10;
        Integer b = Integer.valueOf(10);

        System.out.println("Integer comparison using == : " + (a == b));
        System.out.println("Integer comparison using equals() : " + a.equals(b));

        // Using == and equals() for Strings
        String str1 = new String("hello");
        String str2 = new String("hello");
        String str3 = "hello";

        System.out.println("String comparison using == : " + (str1 == str2));
        System.out.println("String comparison using == (String pool) : " + (str1 == str3));
        System.out.println("String comparison using equals() : " + str1.equals(str2));
    }
}
