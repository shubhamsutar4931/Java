public class palidromeOrNot {
    public static void main(String[] args) {
        String str="nayan";
        int n=str.length();
        boolean flag=true;
        if(n%2==0)
        {
            System.out.println("not palidrome");
        }
        else
        {
            for (int i = 0; i <n ; i++) {
                if(str.charAt(i)!=str.charAt((n-i)-1)) {
                    flag = false;
                }
            }
        }
        if(flag)
        {
            System.out.println("palidrome");
        }
        else
        {
            System.out.println("not palidrome");
        }
    }
}
