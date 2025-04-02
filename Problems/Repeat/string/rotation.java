public class rotation {
    public static void main(String[] args) {
        String str="abcde";
        String str2="edabd";
        str=str.concat(str);
        if(str.indexOf(str2)!=-1)
        {
            System.out.println("rotatation");
        }
        else
        {
            System.out.println("not");
        }
    }
}

