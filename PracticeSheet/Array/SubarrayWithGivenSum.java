public class SubarrayWithGivenSum {

    static void functionOfSubarray(int arr[],int targetSum)
    {
        int currentSum=0;
        int start=0;
        for (int end = 0; end < arr.length; end++)
        {
            currentSum=currentSum+arr[end];
            while (currentSum>targetSum && start<=end)
            {
                currentSum=currentSum-arr[start];
                start++;
            }
            if(currentSum==targetSum)
            {
               for(int i=start;i<=end;i++)
               {
                   System.out.print(arr[i]+" ");

               }
               return;
            }
        }
        System.out.println("No subarray with the given sum exists.");
    }
    public static void main(String[] args) {
        int arr[]={1, 4, 20, 3, 10, 5};
        int targetSum=33;
        functionOfSubarray(arr,targetSum);
    }
}
