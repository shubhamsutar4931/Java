public class duplicateElements {
    public static void main(String[] arg)
    {
        int arr[]=new int[]{1,2,3,4,2,1};
        System.out.println("duplicate elements :");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
