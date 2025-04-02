public class ImplementAtoi {
    static int getInt(String str)
    {
        str=str.trim();
        if(str.length()==0||str==null)
        {
            return 0;
        }
        int sign=1;
        int index=0;
        int result=0;

        if(str.charAt(0)=='-')
        {
            sign=-1;
            index++;
        }
        else  if(str.charAt(0)=='+') {
            index++;
        }

        for (; index < str.length(); index++) {
            char c=str.charAt(index);
            if(c<'0'||c>'9')
            {
                break;
            }
            int digit=c-'0';
            if(result>Integer.MAX_VALUE-digit)
            {
                if(sign==1)
                {
                    return Integer.MAX_VALUE;
                }
                else
                {
                    return Integer.MIN_VALUE;
                }
            }
        result=result*10+digit;
        }
        return result*sign;
    }
    public static void main(String[] args) {
        String str="   -12345abc";
        System.out.println(getInt(str));
    }
}
