public class longestPalidrome {
    public static void main(String[] args) {
        String str="abcabac";
        String longestP="";
        int n=str.length();
        for (int center = 0; center <n ; center++) {
            int left=center,right=center;
            while (left>=0 && right<n&& str.charAt(left)==str.charAt(right))
            {
                if(right-left+1>longestP.length())
                {
                    longestP=str.substring(left,right+1);
                }
                left--;
                right++;
            }
            left=center;
            right=center+1;
            while (left>=0&&right<n&&str.charAt(left)==str.charAt(right))
            {
                if(right-left+1>longestP.length())
                {
                    longestP=str.substring(left,right+1);
                }
                left--;
                right++;
            }
        }
        System.out.println(longestP);
    }
}
