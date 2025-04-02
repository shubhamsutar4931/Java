package linear;

public class even {
    public static void main(String[] args) {
        int nums[]={12,345,2,6,7896};
        System.out.println("een no:"+findNo(nums));
    }
    static int findNo(int nums[])
    {
        int count=0;
        for (int num:nums){
            if(evenNo(num))
            {
                 count++;
            }
        }
        return count;
    }
    static boolean evenNo(int num)
    {
        int noOfD=digits(num);
        if(noOfD%2==0)
        {
            return true;
        }
        return false;
    }
    static int digits(int num)
    {
        int count=0;
        while(num>0)
        {
            count++;
            num=num/10;
        }
        return count;
    }
}
