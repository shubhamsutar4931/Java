public class nthPrime {
    public static void main(String[] args) {
        int s=1,e=100,cont=0,n=5;
        for (int i = s; i <e ; i++) {
            if(isprime(i))
            {
                cont++;
                if(n==cont)
                {
                    System.out.println(i);
                }
            }
        }
    }
    static boolean isprime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        else
        {
            for (int i = 2; i <= n/2; i++) {
                if(n%i==0)
                {
                    return false;
                }
            }
        }
        return  true;
    }
}
