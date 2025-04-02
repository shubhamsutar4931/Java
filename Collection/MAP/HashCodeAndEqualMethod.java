package MAP;

import java.util.HashMap;
import java.util.Objects;

public class HashCodeAndEqualMethod {
    public static void main(String[] args) {
        HashMap<Person,String>map=new HashMap<>();
        Person p1=new Person("alice",1);
        Person p2=new Person("bob",2);
        Person p3=new Person("alice",1);

        map.put(p1,"Engineer");
        map.put(p2,"Designer");
        map.put(p3,"Manager");

        System.out.println("size:"+map.size());
        System.out.println("value of p1:"+map.get(p1));
        System.out.println("value of p3:"+map.get(p3));
    }
}
class Person
{
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,id);
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)
        {
            return true;
        } if (obj==null)
        {
            return false;
        }
        if (getClass()!=obj.getClass())
        {
            return false;
        }
        Person other=(Person) obj;
        return id==other.getId()&& Objects.equals(name,other.getName());

    }

    @Override
    public String toString() {
        return "id: "+id+",name: "+name;
    }
}
