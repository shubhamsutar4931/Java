import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<String, Integer> student = new HashMap<>();
        student.put("shubham", 100);
        student.put("ram", 56);
        student.put("sham", 70);
        student.put("surya", 88);
        student.put("ram", 65);
        // System.out.println(student.keySet());

        for (String key : student.keySet()) {
            System.out.println(key + ":" + student.get(key));
        }
    }

}
