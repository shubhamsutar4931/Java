public class sqrt {
    public static void main(String[] args) {
        int n=100;
        System.out.println(squarer(n));
    }
    public static double squarer(int n)
    {
        double t,sr=n/2;
        do {
            t=sr;
            sr=(t+sr/t)/2;
        }while (t-sr!=0);
        return sr;

    }
}
