import java.util.Arrays;
import java.util.Comparator;

public class LargestNumberFormedFromArray {
    static String largestNumber(int[] arr)
    {
        String str[]=new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            str[i]=String.valueOf(arr[i]);
        }

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
              String  operation1=a+b;
              String operation2=b+a;

                return operation2.compareTo(operation1);
            }
        });
        if(str[0].equals("0"))
        {
            return "0";
        }
        StringBuffer largestEle=new StringBuffer();

        for(String num:str)
        {
            largestEle.append(num);
        }
        return largestEle.toString();
    }
    public static void main(String[] args) {
        int[] arr = {3, 30, 34, 5, 9};
        System.out.println("Largest number formed: " + largestNumber(arr));
    }
}
