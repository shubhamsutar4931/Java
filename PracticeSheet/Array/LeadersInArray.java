import java.util.ArrayList;

public class LeadersInArray {
    static ArrayList<Integer> findLeader(int arr[])
    {
        ArrayList<Integer> leader=new ArrayList<>();
        int n= arr.length;
        int maxRight=arr[n-1];
        leader.add(maxRight);
        for (int i = n-2; i >=0 ; i--) {
            if(arr[i]>maxRight)
            {
                leader.add(arr[i]);
                maxRight=arr[i];
            }
        }
        ArrayList<Integer> reversedleader=new ArrayList<>();
        for (int i = leader.size()-1; i >=0 ; i--) {
            reversedleader.add(leader.get(i));
        }
        return reversedleader;
    }
    public static void main(String[] args) {
        int arr[]={16,17,4,3,5,2};
        ArrayList<Integer> result=findLeader(arr);
        System.out.println("Leader:"+result);
    }
}
