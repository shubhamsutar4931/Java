public class rotation {
    public static void main(String[] args) {
        String str="abcde";
        String str1="ddabc";
        str=str.concat(str);
            if(str.indexOf(str1)!=-1)
            {
                System.out.println("rotation");
            }
            else {
                System.out.println("not");
            }

    }
}
