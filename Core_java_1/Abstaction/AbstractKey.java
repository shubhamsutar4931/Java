//abstract method have abstract class but abstract class hava not need of abstract methode
abstract class Car {
    public abstract void drive(); // declare method

    public abstract void Milege();

    public void Sound() {
        System.out.println("piee....");
    }
}

abstract class Bolero extends Car {
    public void drive() {
        System.out.println("driving...");
    }
}

class UpdatedBolero extends Bolero // concrate class
{
    public void Milege() {
        System.out.println(24);
    }
}

public class AbstractKey {
    public static void main(String[] args) {
        Car obj = new UpdatedBolero(); // object can be concrate class not abstact class
        obj.drive();
        obj.Sound();
        obj.Milege();
    }

}
