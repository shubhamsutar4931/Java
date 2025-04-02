public class random {
    public static void main(String[] args) {
        int max=400,min=200;
        System.out.print("double:");
        double a=Math.random()*(max-min+1)+max;
        System.out.println(a);
        System.out.print("int:");
        int b=(int)Math.random()*(max-min+1)+max;
        System.out.print(b);
    }
}
