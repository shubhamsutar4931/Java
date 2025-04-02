import java.util.Scanner;

public class Armstrong {
    public static boolean isArmstrong(int n) {
        int temp, last = 0, sum = 0, digit = 0;

        temp = n;
        while (temp > 0) // count digit
        {
            temp = temp / 10;
            digit++;
        }

        temp = n;
        while (temp > 0) // check armstrong no
        {
            last = temp % 10;
            sum += Math.pow(last, digit);
            temp = temp / 10;
        }

        if (n == sum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the limit:");
        int num = s.nextInt();
        System.out.println("Armstrong Number up to " + num + " are:");
        for (int i = 0; i <= num; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

}
