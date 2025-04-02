public class palidrome {
    public static void main(String[] args) {
        String str="nayan";
        boolean flag=true;
        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i)!=str.charAt(str.length()-i-1))
            {
                flag=false;
                break;
            }
        }
        if(flag)
        {
            System.out.println("palidrome");
        }
        else
        {
            System.out.println("not");
        }
    }
}
