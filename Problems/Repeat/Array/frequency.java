import java.util.Arrays;

public class frequency {
    public static void main(String[] args) {
        int arr[]={10,70,30,90,20,20,30,40,70,50};
        Arrays.sort(arr);
        int fr[]=new int[arr.length];
        int visited=-1;
        for (int i=0;i< arr.length;i++)
        {
           int count=1;
            for (int j=i+1;j< arr.length;j++)
            {
                if (arr[i]==arr[j])
                {
//                    count++;
                    fr[j]=visited;
                }
            }
            if (fr[i]!=visited)
            {
                fr[i]=arr[i];
            }

        }
        for(int i=0;i< fr.length;i++)
        {
            if(fr[i]!=visited)
            {
                System.out.print(fr[i]+" ");
            }
        }
    }
}
