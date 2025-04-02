public class evenOddNo {
    public static void main(String[] arg)
    {
        int a[]={12,24,23,11,19,20};
        System.out.println("Original array:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Odd numbers:");
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            {
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Even numbers:");
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}
