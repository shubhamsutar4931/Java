
class A {
    public void show() {
        System.out.println("int A");
    }

    public void config() {
        System.out.println("int A config");
    }
}

class B extends A {
    public void show() {
        System.out.println("int B");
    }
}

public class Overriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();
    }

}
