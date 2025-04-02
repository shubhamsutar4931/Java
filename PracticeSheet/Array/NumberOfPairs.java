public class NumberOfPairs {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int n= arr.length;
        int temp=0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n ; j++) {
                temp++;
            }
        }
        System.out.println("pair count:"+temp);
    }
}
