public class string {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("shubham"); //stringbuffer is thread safr or stingbuilder is not.
        sb.append(" sutar");
        sb.deleteCharAt(4);
        sb.insert(0, "java");
        sb.setLength(20);
        System.out.println(sb);
       
    }

}
