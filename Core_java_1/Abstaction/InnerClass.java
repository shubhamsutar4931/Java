class A {
    public void show() {
        System.out.println("in show");
    }

    static class B // inner class
    {
        public void config() {
            System.out.println(("in config"));
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        // A.B obj1 = obj.new B(); //without static
        A.B obj1 = new A.B();
        obj1.config();
    }

}
