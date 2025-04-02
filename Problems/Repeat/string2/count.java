public class count {
    public static void main(String[] args) {
        String str="shubham sutar";
        int count=1;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)!=' ')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
