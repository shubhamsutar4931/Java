public class divide {
    public static void main(String[] args) {
        String str="aaaabbbbcccc";
        int len=str.length();
        int n=3;
        int chars=len/n;
        String sub[]=new String[n];
        int temp=0;
        for (int i = 0; i <str.length() ; i=i+chars) {
            String part=str.substring(i,i+chars);
            sub[temp]=part;
            temp++;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(sub[i]);
        }
    }
}
