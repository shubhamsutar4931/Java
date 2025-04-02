public class palidrom {
    public static void main(String[] args) {
        int r,sum=0,temp;
        int n=152;
        temp=n;
        while (n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("is palidrome");
        }
        else
        {
            System.out.println("is not palidrome");
        }
    }
}
