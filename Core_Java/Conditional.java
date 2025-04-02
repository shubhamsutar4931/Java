//
// public class Conditional {
//     public static void main(String[] args) {
// int age = 21;
// if (age > 18) {
// System.out.println("eligible");
// } else {
// System.out.println("Not eligible");
// }

// int x = 21;
// int y = 20;
// int z = 19;
// if (x > y && x > z) {
// System.out.println(x);
// System.out.println("Thank you");
// } else if (y > z && y > x) {
// System.out.println(y);
// } else {
// System.out.println(z);
// }

// even/  no
//         int n = 4;
//         int result=0;
//          result=n%2==0?10:20;   #ternary operator
//         System.out.println(result);
//         if (n % 2 == 0) {
//             System.out.println("even");
//         } else {
//             System.out.println("odd");
//         }
//     }

// }

//Switch case
public class Conditional {
    public static void main(String[] args) {
        int n = 5;
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wendesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");
        }
    }
}
