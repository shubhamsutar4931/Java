public class swapString {
    public static void main(String[] args) {
        String str1="good",str2="morning";
        System.out.println("before swaping:"+str1+" "+str2);
        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());
        System.out.println("after swaping:"+str1+" "+str2);
    }
}
