public class RomanNumberToInteger {
    static int getRoman(String s)
    {
        int result=0;
        for (int i = 0; i < s.length(); i++) {
            int current=getValue(s.charAt(i));
            if(i<s.length()-1 && current<getValue(s.charAt(i+1)))
            {
                result=result-current;
            }
            else
            {
                result=result+current;
            }
        }
        return result;
    }
    static int getValue(char ch)
    {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    public static void main(String[] args) {
        String roman="MCMXCIV";
        System.out.println(getRoman(roman));
    }
}
