//user input
/*import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = s.nextInt();
        if (num <= 2) {
            System.out.println(num + " is not prime number");
        } else if (num % 2 != 0) {
            System.out.println(num + " is prime number");
        } else {
            System.out.println(num + " is not prime number");
        }

    }

}*/

//user input range
import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int start = s.nextInt();
        System.out.print("Enter the second number : ");
        int end = s.nextInt();
        System.out.println("List of prime numbers between " + start + " and " + end);
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
