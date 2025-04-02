import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str1="grab";
        String str2="brag";
        char s1[]=new char[str1.length()];
        char s2[]=new char[str2.length()];
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(s1.length!=s2.length)
        {
            System.out.println("error");
        }
        else
        {
            if(Arrays.equals(s1,s2)==true)
            {
                System.out.println("equal");
            }
            else
            {
                System.out.println("not");
            }
        }
    }
}
