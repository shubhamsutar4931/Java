public class reverseNumber {
    public  static void main(String[] arg)
    {
        int r,sum=0;
        int n=153;
        while (n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        System.out.print(sum);
    }

}
