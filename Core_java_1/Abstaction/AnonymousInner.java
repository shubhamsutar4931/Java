//Anonymous is inner class has no name
class X {
    public void show() {
        System.out.println("show in outer");
    }
}

public class AnonymousInner {
    public static void main(String[] args) {
        X obj = new X() {
            // inner class Anonymous class
            public void show() {
                System.out.println("show in inner");
            }
        };
        obj.show();
    }

}
