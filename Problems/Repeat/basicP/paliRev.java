public class paliRev {
    public static void main(String[] args) {
        String ori="nayan",reverse="";
        int length=ori.length();
        for(int i=length-1;i>=0;i--)
        {
            reverse=reverse+ori.charAt(i);
        }
        if(ori.equals(reverse))
        {
            System.out.println("pali");
        }
        else
        {
            System.out.println("not pali");
        }
    }
}
