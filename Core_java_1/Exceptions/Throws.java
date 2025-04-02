class A {
    public void show() throws ClassNotFoundException {
        Class.forName("Calc");
    }
}

public class Throws {
    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("hello");
    }

}
