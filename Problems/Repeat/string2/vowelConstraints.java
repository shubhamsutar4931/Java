public class vowelConstraints {
    public static void main(String[] args) {
        String str="hello world";
        char vowel[]= new char[str.length()];
        char con[]=new char[str.length()];
        int temp=0;
        char arr[]=str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
            {
                vowel[temp]=arr[i];
                temp++;
            }
            else
            {
                con[temp]=arr[i];
                temp++;
            }
        }
        System.out.println(vowel);
        System.out.println(con);
    }
}
