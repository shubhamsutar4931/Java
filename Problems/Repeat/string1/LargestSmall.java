public class LargestSmall {
    public static void main(String[] args) {
        String str="Hardships often prepare ordinary people for an extraordinary destiny";
        str=str+" ";
        String word[]=str.split(" ");
        String  min,max;

        min=max=word[0];
        for (int i = 0; i < word.length ; i++) {
            if(min.length()>word[i].length())
            {
                min=word[i];
            }
            if (max.length()< word[i].length()) {
                max=word[i];
            }
        }
        System.out.println(min);
        System.out.println(max);

    }
}
