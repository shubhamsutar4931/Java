//toString()
/*class Laptop {
    String model;
    int price;

    public String toString() {
        return model + ":" + price;
    }
}

public class ObjectClasstoString {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "dell";
        obj.price = 30000;
        System.out.println(obj.toString());
    }

}*/
//equals()-string equals properly
class Laptop {
    String model;
    int price;

    public String toString() {
        return model + ":" + price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

}

public class ObjectClasstoString {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "dell";
        obj.price = 30000;

        Laptop obj1 = new Laptop();
        obj1.model = "dell1";
        obj1.price = 30000;
        boolean result = obj.equals(obj1);
        System.out.println(result);
    }

}