
// final is variable, method ,class

class Calc {
    public  void show() {
        System.out.println("in A");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class AdvCalc extends Calc {

    public void show() {
        System.out.println("in B");
    }

}

public class FinalKey {
    public static void main(String[] args) {
        /*
         * final int a = 9;//variable
         * a = 8;
         * System.out.println(a);
         */

        AdvCalc obj = new AdvCalc();
        obj.show();
        obj.add(4, 05);
    }

}
