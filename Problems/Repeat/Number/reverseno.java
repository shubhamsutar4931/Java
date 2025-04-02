public class reverseno {
    public static void main(String[] args) {
        int r,sum=0;
        int n=12345;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        System.out.println(sum);
    }
}
