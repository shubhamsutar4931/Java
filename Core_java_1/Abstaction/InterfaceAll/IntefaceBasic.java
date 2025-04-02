package InterfaceAll;

interface A {
    // variable are static and final
    int age = 20;
    String name = "shubham";

    void show();

    void config();

}

interface B extends A {
    void run();
}

class C implements A, B {
    public void show() {
        System.out.println("show..");
    }

    public void config() {
        System.out.println("config..");
    }

    public void run() {
        System.out.println("run..");
    }
}

public class IntefaceBasic {
    public static void main(String[] args) {
        B obj = new C();

        obj.show();
        obj.config();
        obj.run();
        System.out.println(obj.name);

    }

}
