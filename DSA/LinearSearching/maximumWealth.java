public class maximumWealth {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{3,8,1}};
        System.out.println(maximumW(a));
    }
    static int maximumW(int[][] a)
    {
        int max=0;
        for(int i=0;i<a.length;i++)
        {
            int sum=0;
            for(int j=0;j<=a.length;j++)
            {
              sum += a[i][j];
            }
            if(sum>max)
            {
                max=sum;
            }
        }
        return max;
    }
}
