public class removeWhiteSpace {
    public static void main(String[] args) {
        char c='-';
        String str="a b c d e f g h i";
//        str=str.replaceAll("\\s+","");
        str=str.replace(' ',c);

        System.out.println(str);
    }
}
