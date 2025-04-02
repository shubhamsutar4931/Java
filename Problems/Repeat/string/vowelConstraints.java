public class vowelConstraints {
    public static void main(String[] args) {
        String s = "shubham sutar";
        int countV = 0, countC = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                countV++;
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                countC++;
            }
        }
        System.out.println(countV);
        System.out.println(countC);
    }
}
