import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str="abc";
        String str1="bca";
        char s1[]=str.toCharArray();
        char s2[]=str1.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(Arrays.equals(s1,s2))
        {
            System.out.println("anagram");
        }
        else
        {
            System.out.println("not");
        }
    }
}
