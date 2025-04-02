public class LastIndexOf1 {
    public static void main(String[] args) {
        String s="001001";
        int index=0;
        for(int i=0;i< s.length();i++)
        {

            if(s.charAt(i)=='1')
            {
                index=i;
            }
        }
        System.out.println(index);
    }
}
