package InterfaceAll;

interface Computer {
    void work();
}

class Desktop implements Computer {
    public void work() {
        System.out.println("Displaying..");
    }
}

class Laptop implements Computer {
    public void work() {
        System.out.println("coding..");
    }
}

class Devloper {
    public void devApp(Computer desk) {
        desk.work();
    }
}

public class Interface {
    public static void main(String[] args) {
        Devloper shubham = new Devloper();

        Computer lap = new Laptop();
        Computer desk = new Desktop();

        shubham.devApp(lap);
    }
}
