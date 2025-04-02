public class RecursivelyRemoveAllAdjacentDuplicates {
    public static void main(String[] args) {
        String str="abbaca";
        int n=str.length();
        StringBuilder result=new StringBuilder();
        for (int i = 0; i <n ; i++) {
            char current=str.charAt(i);
            if(result.length()>0&&result.charAt(result.length()-1)==current)
            {
                result.deleteCharAt(result.length()-1);
            }
            else {
                result.append(current);
            }
        }
        System.out.println(result);
    }
}
