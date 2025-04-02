public class EquilibriumPoint {
    static int findEqulibrium(int arr[])
    {
        int totalsum=0,leftsum=0;
        for (int i = 0; i < arr.length; i++) {
            totalsum=totalsum+arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            totalsum=totalsum-arr[i];
            if(leftsum==totalsum)
            {
                return i+1;
            }
            leftsum=leftsum+arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,2,2};
        int result=findEqulibrium(arr);
        if(result!=-1)
        {
            System.out.println(" Equilibrium point:"+result);
        }
        else {
            System.out.println(" Equilibrium point not found");
        }
    }
}
