public class linearSearchString {
    public static void main(String[] args) {
        String str="shubham";
        char key='a';
        System.out.println(search(str,key));
    }
    static int search(String str, char key)
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==key)
            {
                return i;
            }
        }
        return -1;
    }
}
