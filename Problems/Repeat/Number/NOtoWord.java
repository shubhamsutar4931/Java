public class NOtoWord {
    private static final String[] units = {
            "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };
    private static final String[] tens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static void main(String[] args) {
        int n1=19;
        int n2=12;
        int n3=92;
        System.out.println(convert(n1));
        System.out.println(convert(n2));
        System.out.println(convert(n3));

    }

    public static String convert(int n)
    {
        if(n<20)
        {
            return units[n];
        }
         else
        {
            return tens[n/10]+(n%10!=0?" "+units[n%10]:"");
        }
    }
}
