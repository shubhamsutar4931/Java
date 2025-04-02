public class random {
    public static void main(String[] arg)
    {
        int min=200;
        int max=400;
        System.out.println("random number between" +min +"to"+max);
        double a=Math.random()*(max-min+1)+min;
        System.out.println(a);
        int b=(int)(Math.random()*(max-min+1)+min);
        System.out.println(b);
    }
}
