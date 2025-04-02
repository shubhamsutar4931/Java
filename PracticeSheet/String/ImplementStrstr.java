public class ImplementStrstr {
    static int comparing(String str1,String str2)
    {
        if(str1.isEmpty())
        {
            return 0;
        }
        int m=str1.length();
        int n=str2.length();

        for (int i = 0; i < m-n; i++) {
            if(str1.substring(i,i+n).equals(str2))
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str1="hello";
        String str2="ll";
        System.out.println(comparing(str1,str2));
    }

}
