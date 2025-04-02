public class ExceptionH {
    public static void main(String[] args) {
        int i = 4;
        int j = 0;
        int num[] = new int[5];
        String str = null;

        try {
            j = 18 / i;
            System.out.println(str.length());
            System.out.println(num[0]);
            System.out.println(num[5]);
        } catch (ArithmeticException e) {
            System.out.println("Check number.." + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("check index.." + e);
        } catch (Exception e) // it is parent class it declared at last
        {
            System.out.println("Something went wrong..");
        }

        System.out.println(j);
        System.out.println("bye");
    }

}