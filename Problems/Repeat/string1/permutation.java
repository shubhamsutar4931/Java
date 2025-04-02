public class permutation {
    public static void main(String[] args) {
        String str="abc";
        int len=str.length();
        generatePermutation(str,0,len);
    }
    public static String generatePermutation(String s,int start,int end)
    {
        if(start==end-1)
        {
            System.out.println(s);
        }
        else
        {
            for (int i = start; i < end; i++)
            {
                s=swap(s,start,i);
                generatePermutation(s,start+1,end);
                s=swap(s,start,i);
            }
        }
        return s;
    }
    public  static String swap(String a,int i,int j)
    {
        char b[]=a.toCharArray();
        char ch;
        ch=b[i];
        b[i]=b[j];
        b[j]=ch;
        return  String.valueOf(b);
    }
}
