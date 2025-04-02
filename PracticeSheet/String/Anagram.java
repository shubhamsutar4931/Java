import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="grab";
        String str2="brag";

        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(arr1.length!= arr2.length)
        {
            System.out.println("not anagram");
        }
       else
        {

                if(Arrays.equals(arr1,arr2))
                {
                    System.out.print("anagram");
                }
                else {
                    System.out.println("not anagram");
                }

        }
    }
}
