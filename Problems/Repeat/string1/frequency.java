public class frequency {
    public static void main(String[] args) {
        String str="abacdabac";
        int freq[]=new int[str.length()];
        char arr[]=str.toCharArray();
        for (int i = 0; i < arr.length; i++)
        {
            freq[i]=1;
            for (int j = i+1; j <arr.length ; j++)
            {
                if(arr[i]==arr[j]&&arr[i]!=' ')
                {
                    freq[i]++;
                    arr[j]='0';
                }
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if(arr[i]!=' '&&arr[i]!='0')
            {
                System.out.println(arr[i]+"|"+freq[i]);
            }
        }
    }
}
