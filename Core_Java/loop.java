public class loop {
    public static void main(String[] args) {
        // for loop
        // for (int i = 0; i <= 5; i++) {
        // System.out.println("Hi");
        // }

        // while loop

//         int i = 1; // iteration
//         while (i <= 4)
//         {
//         System.out.println("Hi" + i);
//         i++;
//         }
//         System.out.println("Bye" + i);


        // do-while statement is wrong give output at once

//          int i = 5;
//          do {
//          System.out.println("hi" + i);
//          i++;
//          } while (i <= 4);


        // for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Day " + i);
            for (int j = 1; j <= 9; j++) {
                System.out.println("  " + (j + 8) + "-" + (j + 9));
            }
        }
    }
}
