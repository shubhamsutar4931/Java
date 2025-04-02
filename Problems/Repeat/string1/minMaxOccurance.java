public class minMaxOccurance {
    public static void main(String[] args) {
        String  str="grass is greener on the other side";
        int freq[]=new int[str.length()];
        char minC=str.charAt(0),maxC=str.charAt(0);
        int min,max;
        char arr[]=str.toCharArray();
        for (int i = 0; i <arr.length; i++)
        {
            freq[i]=1;
            for (int j = i+1; j < arr.length; j++)
            {
                if(arr[i]==arr[j]&&arr[i]!=' '&&arr[i]!='0')
                {
                    freq[i]++;
                    arr[j]='0';
                }
            }
        }
        min=max=freq[0];
        for (int i = 0; i < freq.length; i++)
        {
            if(min>freq[i]&&freq[i]!='0')
            {
                min=freq[i];
                minC=arr[i];
            }
            else if (max<freq[i]&&freq[i]!='0')
            {
                max=freq[i];
                maxC=arr[i];
            }
        }
        System.out.println(minC+":"+min);
        System.out.println(maxC+":"+max);
    }
}
