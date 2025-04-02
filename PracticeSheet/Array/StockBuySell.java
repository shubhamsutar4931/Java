public class StockBuySell {
    static int findMaxProfit(int arr[])
    {
        int n=arr.length;
        int profit=0;
        for (int i = 0; i <n-1; i++) {
            if(arr[i]<arr[i+1])
            {
                profit+=arr[i+1]-arr[i];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int []arr = {7, 1, 5, 3, 6, 4};
        int result=findMaxProfit(arr);
        System.out.println(result);
    }
}
