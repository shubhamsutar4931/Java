public class divideEqualPart {
    public static void main(String[] args) {
        String str="aaaabbbbcccc";
        int len=str.length();
        int n=3;
        int chars=len/n;
        String equalPart[]=new String[n];
        int temp=0;
        if(len%n!=0)
        {
            System.out.println("not divided equally");
        }
        else {
            for (int i = 0; i < str.length(); i=i+chars) {
                String  part=str.substring(i,i+chars);
                equalPart[temp]=part;
                temp++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(equalPart[i]);
        }
    }
}
