package Encapsulation;

class Human {
    private int age;
    private String name;

    public Human() // default constructor
    {
        age = 23;
        name = "john";
    }

    public Human(int a, String n) // parameterized constructor
    {
        age = a;
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

}

public class Encaps_constructor {
    public static void main(String[] args) {
        // Human obj = new Human(18, "shubham");
        Human obj1 = new Human();
        // System.out.println(obj.getName() + ":" + obj.getAge());
        System.out.println(obj1.getName() + ":" + obj1.getAge());
        // obj.setAge(30);
        // obj.setName("shubh");
        // System.out.println(obj.getName() + ":" + obj.getAge());

    }

}