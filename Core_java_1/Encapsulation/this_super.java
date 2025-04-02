
class A {
    public A() {
        super();
        System.out.println("int A");
    }

    public A(int n) {
        super();
        System.out.println("int A int");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("int B");
    }

    public B(int n) {
        this();
        System.out.println("int B int");
    }
}

public class this_super {
    public static void main(String[] arg) {
        B obj = new B();
    } 
}
