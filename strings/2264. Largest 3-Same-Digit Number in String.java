public class Solution {
    public String largestGoodInteger(String num) {
        char maxChar = ' ';
        
        for (int i = 2; i < num.length(); i++) {
            if (num.charAt(i) == num.charAt(i - 1) && num.charAt(i) == num.charAt(i - 2)) {
                maxChar = (char) Math.max(maxChar, num.charAt(i));
            }
        }
        
        return maxChar == ' ' ? "" : new String(new char[] { maxChar, maxChar, maxChar });
    }
}