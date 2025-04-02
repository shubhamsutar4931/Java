//single dimentional array
/*public class array {
    public static void main(String[] args) {
        int num[] = { 3, 5, 7, 9 };
        num[1] = 6; // change

        // int num[] = new int[4];
        // num[0] = 2;
        // num[1] = 3;
        // num[2] = 4;
        // num[3] = 6;

        // for (int i = 0; i <= 3; i++) {
        // System.out.print(num[i] + " ");
        // }

        // enhanced loop(for-each loop)
        for (int n : num) {
            System.out.println(n);
        }
    }
}*/

// multi-dimentional array

/* public class array {

     public static void main(String[] args) {
//         int num[][] = new int[3][4];

         int num[][] = new int[3][]; //empty internal array is jagged array.each
// row
// has diffrent size
         num[0] = new int[2];
         num[1] = new int[3];
         num[2] = new int[4];

         for (int i = 0; i < num.length; i++) {
             for (int j = 0; j < num[i].length; j++) {
                 num[i][j] = (int) (Math.random() * 100);
             }
         }

         for (int i = 0; i < num.length; i++) {
             for (int j = 0; j < num[i].length; j++) {
                 System.out.print(num[i][j] + " ");
             }
             System.out.println();
         }
     }}

// enhansed for loop

// for (int n[] : num) {
// for (int m : n) {
// System.out.print(m + " ");
// }
// System.out.println();
// }

//     }
// }*/

// string array

 class student {
     int rollno;
     String name;
     int marks;
 }

 public class array {

     public static void main(String[] args) {
         student s1 = new student();
         s1.rollno = 10;
         s1.name = "ajay";
         s1.marks = 56;

         student s2 = new student();
         s2.rollno = 11;
         s2.name = "vijay";
         s2.marks = 76;

         student s3 = new student();
         s3.rollno = 12;
         s3.name = "jay";
         s3.marks = 50;

         student stud[] = new student[3]; // stud array name
         stud[0] = s1;
         stud[1] = s2;
         stud[2] = s3;

//         for (int i = 0; i < stud.length; i++) {
//             System.out.println(stud[i].rollno + ":" + stud[i].name + ":" + stud[i].marks);
//         }

         for(student s:stud)
         {
             System.out.println(s.rollno+":"+s.name+":"+s.marks);
         }
     }
 }

// 2-d arry

//public class array {
//    public static void main(String[] args) {
//        int arr[][][] = { { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } }, { { 2, 1, 1 }, {
//                2, 2, 2 }, { 3, 3, 3 } },
//                { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } } };
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                for (int k = 0; k < 3; k++) {
//                    System.out.print(arr[i][j][k] + " ");
//                }
//                System.out.println();
//            }
//
//            System.out.println();
//        }
//    }
//}

// public class array {

// public static void main(String[] args) {
// int arr[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

// for (int n[] : arr) {
// for (int m : n) {
// System.out.print(m + " ");
// }
// System.out.println();
// }
// }
// }