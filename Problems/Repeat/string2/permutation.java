public class permutation {
    public static void main(String[] args) {
        String str="abc";
        int len=str.length();
        generateP(str,0,len);
    }
    public static String generateP(String  str,int start,int end)
    {
        if(start==end-1)
        {
            System.out.println(str);
        } else
        {
            for (int i = start; i < end; i++) {
                str=swap(str,start,i);
                generateP(str, start+1, end);
                str=swap(str,start,i);
            }

        }
        return str;
    }
    public  static  String swap(String  s,int i,int j)
    {
        char b[]=s.toCharArray();
        char ch;
        ch=b[i];
        b[i]=b[j];
        b[j]=ch;
        return String.valueOf(b);
    }
}
