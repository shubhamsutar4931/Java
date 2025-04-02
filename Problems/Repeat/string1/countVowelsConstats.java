public class countVowelsConstats {
    public static void main(String[] args) {
        String str="shubham sutar";
        int countV=0,countC=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!=' ')
            {
                if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
                {
                    countV++;
                }
                else
                {
                    countC++;
                }
            }
        }
        System.out.println("vowels:"+countV);
        System.out.println("constraints:"+countC);
    }
}
