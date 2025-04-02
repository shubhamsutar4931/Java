import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Node {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.addFirst(0);
        linkedList.addLast(5);
        System.out.println(linkedList);
        linkedList.remove(0);
        System.out.println(linkedList);
        linkedList.removeIf(x->x%2==0);
        System.out.println(linkedList);

        LinkedList<String> animal=new LinkedList<>(Arrays.asList("cat","dog","elephant"));
        LinkedList<String> animalToRemove=new LinkedList<>(Arrays.asList("dog","lion"));
        animal.removeAll(animalToRemove);
        System.out.println(animal);
    }
}
