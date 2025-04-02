public class factorialRecursion {
    static int factorial(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return (n*factorial(n-1));
        }
    }

    public static void main(String[] arg)
    {
        System.out.println("factorial of number:"+factorial(5));
    }

}
