package EnumAll;

enum Laptop {
    Macbook(2000), XPV(3000), Surface, Thinkpad(1800);

    private int price;

    private Laptop() {
        price = 500;
    }

    private Laptop(int price) {
        this.price = price;
        // System.out.println("this laptop is" + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class EnumClass {
    public static void main(String[] args) {
        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap + ":" + lap.getPrice());

        Laptop[] lap = Laptop.values();
        for (Laptop l : lap) {
            System.out.println(l + ":" + l.getPrice());
        }
    }

}
