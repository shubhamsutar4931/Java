public class ReverseWordsGivenString {
    public static void main(String[] args) {
        String str="shubham santosh sutar   ";
        str=str.trim();
        String words[]=str.split(" ");
        for (int i = words.length-1; i >=0 ; i--) {
            System.out.print(words[i]);
            if (i != 0) { // Add a space only if it's not the last word
                System.out.print(" ");
            }
        }
    }
}
