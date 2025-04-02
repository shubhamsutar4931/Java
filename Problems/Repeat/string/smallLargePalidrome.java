public class smallLargePalidrome {
    public static void main(String[] args) {
        String str="wow you own kayak";
        String word="",small="",large="";
        int temp=0;
        String words[]=new String[100];
        str=str+" ";
        for (int i = 0; i <str.length() ; i++)
        {
            if(str.charAt(i)!=' ')
            {
                word=word+str.charAt(i);
            }
            else
            {
                words[temp]=word;
                temp++;
                word="";
            }
        }
        int count=0;
        for (int i = 0; i < temp; i++) {
            if(isPalidrome(words[i]))
            {
                count++;
                if(count==1)
                {
                    small=large=words[i];
                }
                else
                {
                    if(small.length()>words[i].length())
                    {
                        small=words[i];
                    } else if (large.length()<words[i].length())
                    {
                        large=words[i];
                    }
                }
            }
        }
        if(count==0)
        {
            System.out.println("not palidrome");
        }
        else {
            System.out.println("small:"+small);
            System.out.println("large:"+large);
        }
    }
    public static boolean isPalidrome(String a)
    {
        boolean flag=true;
        for (int i = 0; i <a.length(); i++) {
            if(a.charAt(i)!=a.charAt(a.length()-i-1))
            {
                flag=false;
            }
        }
        return true;
    }
}
