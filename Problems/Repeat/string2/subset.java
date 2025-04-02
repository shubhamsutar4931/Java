public class subset {
    public static void main(String[] args) {
        String str="fun";
        int len=str.length();
        String sub[]=new String[len*(len+1)/2];
        int temp=0;
        for (int i = 0; i <len ; i++) {
            for (int j = i; j < len; j++) {
                sub[temp]=str.substring(i,j+1);
                temp++;
            }
        }
        for (int i = 0; i < sub.length; i++) {
            System.out.println(sub[i]);
        }
    }
}
