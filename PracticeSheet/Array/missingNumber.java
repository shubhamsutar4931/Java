public class missingNumber {
    static int findMissingNo(int[] arr, int n)
    {
        int currentSum=0;
        int targetSum=n*(n+1)/2;
        for(int i=0;i<arr.length;i++)
        {
            currentSum=currentSum+arr[i];
        }
        return targetSum-currentSum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
        int n=6;

        System.out.println(findMissingNo(arr,n));
    }
}
