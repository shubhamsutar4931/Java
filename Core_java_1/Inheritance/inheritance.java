
class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

class AdvanceCalc extends Calc {
    public int mul(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
}

class VeryAdvanceCalc extends AdvanceCalc {
    public double power(int n1, int n2) {
        return Math.pow(n1, n2);
    }
}

public class inheritance {
    public static void main(String[] args) {
        VeryAdvanceCalc obj = new VeryAdvanceCalc();
        int r1 = obj.add(20, 15);
        int r2 = obj.sub(25, 15);
        int r3 = obj.mul(20, 5);
        int r4 = obj.div(25, 5);
        double r5 = obj.power(25, 2);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
    }
}
