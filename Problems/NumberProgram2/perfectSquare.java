public class perfectSquare {
    public static void main(String[] arg)
    {
        int n=122;
        int x=n%10;
        if(x==2||x==3||x==7||x==8)
        {
            System.out.println("is not perfect suare");
        }
        for(int i=0;i<=n/2;i++)
        {
            if(i*i==n) {
                System.out.println("is perfect suare of " + i);
            }
        }
    }
}
