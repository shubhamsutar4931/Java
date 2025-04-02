public class noOfSubset {
    public static void main(String[] args) {
        String str="fun";
        int temp=0;
        int length=str.length();
        String  substr[]=new String[length*(length+1)/2];
        for (int i = 0; i <length; i++) {
            for(int j=i;j<length;j++)
            {
                substr[temp]=str.substring(i,j+1);
                temp++;
            }
        }
        for(int i=0;i<substr.length;i++)
        {
            System.out.println(substr[i]);
        }
    }
}
