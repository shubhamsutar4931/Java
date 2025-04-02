public class convertNumberToWord {
    private static final String[] units = {
            "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };
    private static final String[] tens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };
    public static void main(String[] arg)
    {
        int num1=12;
        int num2=28;
        int num3=734;
        System.out.println(convertToWord(num1));
        System.out.println(convertToWord(num2));
        System.out.println(convertToWord(num3));
    }
    public static String convertToWord(int num)
    {
        if(num<20)
        {
            return units[num];
        } else if (num<100) {
            return tens[num/10]+(num%10!=0?" "+units[num%10]:"");
        } else if (num<1000) {
            return tens[num/100]+(num%10!=0?" "+tens[num%10]:"")+(num%10!=0?" "+units[num%10]:"");
        }
        else
        {
            return "number out of range";
        }
    }
}
