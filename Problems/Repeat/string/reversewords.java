public class reversewords {
    public static void main(String[] args) {
        String str="shubham santosh sutar";
        String word="";
        String words[]=new String[100];
        int temp=0;
        str=str+" ";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=' ')
            {
                word=word+str.charAt(i);
            }
            else
            {
                words[temp]=word;
                temp++;
                word="";
            }
        }
        for (int i = temp-1; i >=0 ; i--) {
            System.out.print(words[i]+" ");
        }
    }
}
