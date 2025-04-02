public class divideString {
    public static void main(String[] args) {
        String str="aaaabbbbcccc";
        int temp=0;
        int len=str.length();
        int n=3;
        int chars=len/n;
        String equal[]=new String[n];
        if(len%n!=0)
        {
            System.out.println("not divisible in equal parts");
        }
        else {
            for (int i = 0; i <len; i=i+chars) {
                 String part=str.substring(i,i+chars);
                equal[temp]=part;
                temp++;
            }
        }
        for (int i = 0; i <n ; i++) {
            System.out.println(equal[i]);
        }
    }
}
