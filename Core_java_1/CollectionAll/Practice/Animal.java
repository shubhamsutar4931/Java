package Practice;

public class Animal implements Comparable<Animal> {
    int age;
    String name;
    int weight;

    public Animal(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}'+"\n";
    }

    @Override
    public int compareTo(Animal that) {
        if(this.name==that.name)
        {
            this.name.compareTo(that.name);
        }
        return this.age-that.age;
    }
}
