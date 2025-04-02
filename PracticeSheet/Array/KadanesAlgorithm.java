public class KadanesAlgorithm {
    static int findMaxSum(int arr[])
    {
        int currentSum=arr[0];
        int maxSum=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            currentSum=Math.max(arr[i],currentSum+arr[i]);

            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;

    }
    public static void main(String[] args) {
        int arr[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max=findMaxSum(arr);
        System.out.println(max);
    }
}
