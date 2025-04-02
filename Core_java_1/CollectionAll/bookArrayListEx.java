import java.util.ArrayList;
import java.util.List;

class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

}

public class bookArrayListEx {
    public static void main(String[] args) {
        Book b1 = new Book(101, "s", "abc", "xyz", 50);
        Book b2 = new Book(102, "smi", "abvghc", "cghcxyz", 500);
        Book b3 = new Book(103, "jgs", "abvjhfc", "khxyz", 100);
        List<Book> bo = new ArrayList<>();
        bo.add(b1);
        bo.add(b2);
        bo.add(b3);

        for (Book boo : bo) {
            System.out.println(boo.id + " " + boo.name + " " + boo.author + " " + boo.publisher + " " + boo.quantity);
        }
        System.out.println(bo.size());

    }

}
