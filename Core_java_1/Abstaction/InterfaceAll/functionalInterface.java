package InterfaceAll;

@FunctionalInterface  //it has only one abstract method
interface AB {
    void show(int i);
}

public class functionalInterface {
    public static void main(String[] args) {
        // A obj = new A() {
        // public void show(int i) {
        // System.out.println("in show");
        // }
        // };

        // lamda is used to reduce code in functional interface
        // A obj = (int i) -> System.out.println("in show"+i);
        AB obj = i -> System.out.println("in show" + i);// when only one variable

        obj.show(5);
    }

}
