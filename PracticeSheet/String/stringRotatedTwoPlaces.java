public class stringRotatedTwoPlaces {
    public static void main(String[] args) {
        String str1="amazon";
        String str2="onamaz";
        if(str1.length()!=str2.length())
        {
            System.out.println("not rotated");
        }
        //clockwise
        String clockwise= str1.substring(str1.length()-2)+str1.substring(0,str1.length()-2);
       // anticlockise
        String anticlockwise= str1.substring(2)+str1.substring(0,2);

        if(str2.equals(clockwise)||str2.equals(anticlockwise))
        {
            System.out.println("rotated");
        }
        else {
            System.out.println("not rotated");
        }

    }
}
