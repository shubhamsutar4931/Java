public class copyArray {
    public static void main(String[] arg)
    {
        int [] arr1={2,4,6,8};
        int [] arr2=new int[arr1.length];
        //copy array
        for(int i=0;i<arr1.length;i++)
        {
            arr2[i]=arr1[i];
        }
        System.out.println("original array:");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("copy array:");
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
}
