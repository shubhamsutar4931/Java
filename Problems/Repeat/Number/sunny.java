public class sunny {
    public static void main(String[] args) {
       int s=10;
       int e=100;
       for(int i=s;i<=e;i++)
       {
           if(isSunny(i))
           {
               System.out.println(i+" ");
           }
       }
    }
    public  static boolean isSunny(int num)
    {
        if(Math.sqrt(num+1)%1==0)
        {
            return true;
        }
        {
            return false;
        }
    }
}
