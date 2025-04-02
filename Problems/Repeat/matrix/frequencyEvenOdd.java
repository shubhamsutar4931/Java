public class frequencyEvenOdd {
    public static void main(String[] args) {
        int countE=0,countO=0;
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[i][j]%2==0)
                {
                    countE++;
                }
                else {
                    countO++;
                }
            }
        }
        System.out.println(countE);
        System.out.println(countO);
    }
}
