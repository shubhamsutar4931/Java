public class NoSubset {
    public static void main(String[] args) {
        String str="fun";
        int len=str.length();
        String subset[]=new String[len*(len+1)/2];
        String part="";
        int temp=0;
        for (int i = 0; i < len; i++)
        {
            for (int j = i; j <len ; j++)
            {
                part=str.substring(i,j+1);
                subset[temp]=part;
                temp++;
            }
        }
        for (int i = 0; i < subset.length; i++)
        {
            System.out.println(subset[i]);
        }
    }
}
