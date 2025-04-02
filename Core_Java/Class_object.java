class Calculator {
    int a; // instance variable

    public int add(int n1, int n2) // add()is a method
    {
        int r = n1 + n2;
        return r;
    }
}

public class Class_object {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        Calculator calc = new Calculator(); // Object is created,calc is refrence variable
        int result = calc.add(num1, num2); // call the add() method
        System.out.println(result);
    }

}

//class Computer {
//    public void playMusic() {
//        System.out.println("music playing....");
//    }
//
//    public String getMePen(int cost) {
//        if (cost >= 10) {
//            return "pen";
//        } else {
//            return "nothing";
//        }
//    }
//}
//
//public class Class_object {
//
//    public static void main(String[] args) {
//        Computer obj = new Computer();
//        obj.playMusic();
//        String str = obj.getMePen(12);
//        System.out.println(str);
//    }
//}

// method overloading
// class Calculator {
// public int add(int n1, int n2, int n3) {
// return n1 + n2;
// }

// public int add1(int n1, int n2) {
// return n2 - n1;
// }
// }

// public class Class_object {
// public static void main(String[] args) {
// Calculator obj = new Calculator();
// int res = obj.add1(4, 8);
// System.out.println(res);
// }

// }