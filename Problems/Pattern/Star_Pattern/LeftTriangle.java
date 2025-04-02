import java.util.Scanner;

public class LeftTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter limit:");
        int num = s.nextInt();
        for (int i = 0; i < num; i++) {
            // for empty space
            for (int j = 2 * (num - i); j >= 0; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
