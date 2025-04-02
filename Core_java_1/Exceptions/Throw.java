class ShubhamException extends Exception {
    public ShubhamException(String str) {
        super(str);
    }
}

public class Throw {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0) {
                // throw new ArithmeticException("i dont want to print zero");
                throw new ShubhamException("i dont want to print zero");
            }
        } catch (ShubhamException e /* ArithmeticException e */) {
            j = 18 / 1;
            System.out.println("default output.." + e);
        } catch (Exception e) {
            System.out.println("Something went wrong...");

        }
        System.out.println(j);
        System.out.println("bye");
    }

}
