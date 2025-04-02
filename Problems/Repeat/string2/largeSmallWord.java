public class largeSmallWord {
    public static void main(String[] args) {
        String str="Hardships often prepare ordinary people for an extraordinary destiny";
        str=str+" ";
        String min,max;
        String word[]=str.split(" ");
        min=max=word[0];
        for (int i = 0; i < word.length; i++) {
            if (min.length()>word[i].length())
            {
                min=word[i];
            } else if (max.length()<word[i].length()) {
                max=word[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
