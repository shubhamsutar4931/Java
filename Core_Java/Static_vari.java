class Mobile {
    int price;
    static String name; // change all values when one change because of static key word
    String brand;

    public Mobile() /// constructor
    {
        price = 200;
        brand = "";
        System.out.println("in constructor");
    }

    static {
        System.out.println("in static");
    }

    public void show() {
        System.out.println(brand + " " + name + " " + price);
    }
}

public class Static_vari {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.name = "smartphone";
        obj1.price = 100000;

        Mobile obj2 = new Mobile();
        // obj2.brand = "Mi";
        // obj2.name = "smartphone";
        // obj2.price = 80000;

        // Mobile obj3 = new Mobile();
        // obj3.brand = "Oneplus";
        // obj3.name = "smartphone";
        // obj3.price = 35000;

        // obj1.name = "phone";

        obj1.show();
        // obj2.show();
        // obj3.show();
    }
}
