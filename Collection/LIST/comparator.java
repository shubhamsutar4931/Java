package LIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//class myComparator implements Comparator<Integer>
//{
//
//    @Override
//    public int compare(Integer o1, Integer o2) {          //for descending
//        return o2-o1;
//    }
//}
//
//class myComparator1 implements  Comparator<String>
//{
//
//    @Override
//    public int compare(String o1, String o2) {
////        return o1.length()-o2.length();  //ascending length
//        return o2.length()-o1.length();   //descending length
//    }
//}

public class comparator {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(4);
        list.sort(null);//nullcomparator operator
        System.out.println(list);//ascending
//        list.sort(new myComparator());
        list.sort((a,b)->b-a);   //lambda expression
        System.out.println(list);

        List<String> word= Arrays.asList("banana","apple","time");
//        word.sort(null);
//        word.sort(new myComparator1());
        word.sort((a,b)->b.length()-a.length());     //lambda expression
        System.out.println(word);


        List<Student> student=new ArrayList<>();
        student.add(new Student("jay",  4.5));
        student.add(new Student("ajay",  4.5));
        student.add(new Student("vijay",  4.9));
        student.add(new Student("yash",  5.5));
        student.sort((o1,o2)->{
            if (o2.getCgp()- o2.getCgp()>0)
                return 1;
            else if (o2.getCgp()- o2.getCgp()<0) {
                return -1;
            }else
            {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for(Student s:student)
        {
            System.out.println(s.getName()+":"+s.getCgp());
        }
    }
}
class Student
{
    private String name;
    private double cgp;

    public Student(String name, double cgp) {
        this.name = name;
        this.cgp = cgp;
    }

    public String getName() {
        return name;
    }

    public double getCgp() {
        return cgp;
    }

}
