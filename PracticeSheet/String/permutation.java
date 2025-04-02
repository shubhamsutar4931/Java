public class permutation {
    public static void main(String[] args) {
        String str="abc";
        int end=str.length();
        System.out.println("all permutation");
        generatePermutation(str,0,end);
    }
    static String generatePermutation(String str,int start,int end)
    {
        if(start==end-1)
        {
            System.out.println(str);
        }
        else {
            for(int i=start;i<end;i++)
            {
                str=swapStr(str,start,i);
                generatePermutation(str,start+1,end);
                str=swapStr(str,start,i);
            }
        }
        return str;
    }
    static String swapStr(String a,int i,int j)
    {
        char b[]=a.toCharArray();
        char ch=b[i];
        b[i]=b[j];
        b[j]=ch;
        return String.valueOf(b);
    }
}
