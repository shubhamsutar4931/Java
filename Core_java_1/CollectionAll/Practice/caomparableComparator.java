package Practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Arrays;

public class caomparableComparator implements Comparator<Animal> {
    public static void main(String[] args) {
        Animal a1=new Animal(4,"tommy",12);
        Animal a2=new Animal(2,"jimmy",20);
        Animal a3=new Animal(2,"sommy",22);
        Animal a4=new Animal(2,"rommy",18);
        Animal a5=new Animal(9,"gommy",10);

        List<Animal> dogs=new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);
        dogs.add(a5);
        System.out.println(dogs);
//        dogs.sort();
//        Collections.sort(dogs, new caomparableComparator());
//        System.out.println(dogs);
        int a[][]={{4,5,2},{5,1,2},{1,4,7}};
        Arrays.sort(a,(arr1,arr2)->{
            return arr1[0]-arr2[0];
        });

        for(int[] e:a)
        {
            for(int ele:e)
            {
                System.out.print(ele+" ");
            }
            System.out.println();
        }

    }

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.weight- o2.weight;
    }



}
