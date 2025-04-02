public class evenDigitNo {

    public static void main(String[] args) {

        int nums[]={12,345,2,6,7896};
        System.out.println(finNumbers(nums));
    }
    static int finNumbers(int nums[])
    {
        int count=0;
        for(int num:nums)
        {
            if(even(num))
            {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num)
    {
        int numOfDigit=digits(num);
       if(numOfDigit%2==0)
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