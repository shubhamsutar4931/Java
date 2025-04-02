package MAP;

import java.lang.ref.WeakReference;

public class GC {
    public static void main(String[] args) {
        //strong reference
//        Phone phone=new Phone("apple","16 pro");
//        System.out.println(phone);
//        phone=null;
//        System.out.println(phone);
        //weak reference
        WeakReference<Phone> weakPhone=new WeakReference<>(new Phone("apple","16 pro"));
        System.out.println(weakPhone.get());
        System.gc();//suggest to jvm to destroy memory
        try
        {
            Thread.sleep(5000);
        }catch (Exception ignored){

        }
        System.out.println(weakPhone.get());

    }
}
class  Phone{
String brand;
String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}