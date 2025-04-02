import java.util.Scanner;

public class RightTriangle {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter limit:");
        int num = s.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}