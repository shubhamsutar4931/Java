public class longestSequence {
    public static void main(String[] args) {
        String  str="abcdaabc";
        String lrs="";
        int len=str.length();
        for (int i = 0; i < len; i++)
        {
            for (int j = i+1; j < len; j++)
            {
                String x=lcp(str.substring(i,len),str.substring(j,len));
                if(x.length()>lrs.length())
                {
                    lrs=x;
                }
            }
        }
        System.out.println(lrs);
    }
    public  static String lcp(String s,String t)
    {
        int n=Math.min(s.length(),t.length());
        for (int i = 0; i < n; i++)
        {
            if(s.charAt(i)!=t.charAt(i))
            {
                return s.substring(0,i);
            }
        }
        return s.substring(0,n);
    }

}
