import java.util.*;

public class Input {
    public static void main(String[] args) throws Exception {

        System.out.println("Enter a number:");// println belongs to printStream class
        // int num = System.in.read(); // gives ASCI value
        // System.out.println(num - 48);

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
    }
}
