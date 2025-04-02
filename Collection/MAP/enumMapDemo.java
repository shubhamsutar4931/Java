package MAP;

import java.util.EnumMap;
import java.util.Map;

public class enumMapDemo {
    public static void main(String[] args) {
        Map<Day,String>  schedule=new EnumMap<>(Day.class);
        schedule.put(Day.MONDAY, "Gym");
        schedule.put(Day.WEDNESDAY, "Meeting");
        schedule.put(Day.FRIDAY, "Movie Night");

        System.out.println("EnumMap: " + schedule);
        System.out.println("Activity on Wednesday: " + schedule.get(Day.WEDNESDAY));
    }

}
enum Day{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
