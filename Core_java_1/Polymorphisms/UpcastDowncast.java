//it is type of type casting in OOPS
class AB {
    public void show1() {
        System.out.println("in AB");
    }
}

class CD extends AB {
    public void show2() {
        System.out.println("in CD");
    }
}

public class UpcastDowncast {
    public static void main(String[] args) {
        // upcasting
        // AB obj = (AB) new CD();
        // obj.show1();

        // downcasting
        AB obj = new CD();
        obj.show1();

        CD obj1 = (CD) obj;
        obj1.show2();

    }
}
