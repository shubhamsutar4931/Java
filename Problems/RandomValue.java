import java.util.Scanner;

public class RandomValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter starting limit:");
        int min = s.nextInt();
        System.out.print("Enter ending limit:");
        int max = s.nextInt();
        System.out.println("Random value of type double between " + min + " to " + max + ":");
        double a = Math.random() * (max - min + 1) + min;
        System.out.println(a);
        int b = (int) Math.random() * (max - min + 1) + min;
        System.out.println(b);
    }

}
