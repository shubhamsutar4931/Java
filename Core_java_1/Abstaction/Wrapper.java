//wrapper class-Integer,Char,Float

public class Wrapper {

    public static void main(String[] args) {
        int num = 5; // primitive type

        Integer num1 = num; // autoboxing(wrapping -object type)

        int num2 = num1.intValue(); // unboxing(primitive type)

        System.out.println(num2);

        String str = "22";
        int num3 = Integer.parseInt(str);
        System.out.println(num3 * 2);
    }
}