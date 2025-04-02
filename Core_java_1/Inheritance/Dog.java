// single inheritance
/*class Animal {
    void category() {
        System.out.println("it is a animal..");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("bhuuuu....");
    }
}

class practice {
    public static void main(String[] args) {
        Dog p = new Dog();
        p.bark();
        p.category();
    }
}*/

//Multuilevel inheritance
class Animal {
    void category() {
        System.out.println("it is a animal..");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("bhuuuu....");
    }
}

class Breed extends Animal {
    void tail() {
        System.out.println("short");
    }
}

class practice {
    public static void main(String[] args) {
        Breed p = new Breed();
        // p.bark();
        p.category();
        p.tail();
    }
}