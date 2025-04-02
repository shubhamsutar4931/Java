public class largeSmallWord {
    public static void main(String[] args) {
        String str="Hardships often prepare ordinary people for an extraordinary destiny";
        String word="",large="",small="";
        String words[]=new String[100];
        int count=0;
        str=str+" ";
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)!=' ')
            {
                word=word+str.charAt(i);
            }
            else
            {
                words[count]=word;
                count++;
                word="";
            }
        }
        small=large=words[0];
        for (int i = 0; i < count; i++) {
            if(small.length()>words[i].length())
            {
                small=words[i];
            } else if (large.length()<words[i].length()) {
                large=words[i];
            }
        }
        System.out.println(small);
        System.out.println(large);
    }
}
