import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class conversion1 {
    public static void main(String[] args) throws ParseException {
//        1)string to int
//        String s="100";
//        int i=Integer.parseInt(s);
//        System.out.println(s+200);
//        System.out.println(i+200);

//        2)int to string
//        int i=100;
//        String s=String.valueOf(i);
//        System.out.println(i+200);
//        System.out.println(s+200);

//        3)String to long
//        String s="12345678";
//        long l=Long.parseLong(s);
//        System.out.println(s+910);
//        System.out.println(l+1);

//        4)long to string
//        long l=12345678;
//        String  s=String.valueOf(l);
//        System.out.println(l+1);
//        System.out.println(s+9);

//        9)string to date
//        String sDate="1/2/2024";
//        Date date1=new SimpleDateFormat("dd/mm/yyyy").parse(sDate);
//        System.out.println(sDate+"\t"+date1);

//        10)date to string
        Date date= Calendar.getInstance().getTime();
        DateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate=dateFormat.format(date);
        System.out.println(strDate);
    }
}
