import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        } else {
            return -1;
        }
    }

}

public class Comparable1 {
    private static List<Student> Collections;

    public static void main(String[] args) {
        // to sorting according to last digit
        Comparator<Student> com = new Comparator<>() {
            public int compare(Student i, Student j) {
                if (i.age > j.age) {
                    return 1;
                } else {
                    return -1;
                }
            }

        };
        List<Student> studs = new ArrayList<>();

        studs.add(new Student(43, "shubham"));
        studs.add(new Student(38, "sham"));
        studs.add(new Student(22, "ram"));
        studs.add(new Student(18, "surya"));
        studs.add(new Student(40, "yash"));

        Collections.sort(studs, com);
        for (Student s : studs) {
            System.out.println(s);
        }
        // System.out.println(studs);
    }
}
