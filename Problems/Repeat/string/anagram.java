import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str1="Grab";
        String str2="Brag";
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        char string1[]=str1.toCharArray();
        char string2[]=str2.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);
        if(Arrays.equals(string1,string2)==true)
        {
            System.out.println("anagram");
        }
        else
        {
            System.out.println("not anagram");
        }
    }
}
