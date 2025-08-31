class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) return false;

        int original = x;
        long reversed = 0; // use long to prevent overflow

        while (x != 0) {
            if(reversed > Integer.MAX_VALUE/10 || 
           (reversed == Integer.MAX_VALUE/10 )){
                return false;
            }else if(reversed < Integer.MIN_VALUE/10 || 
           (reversed == Integer.MIN_VALUE/10)){
                return false;
            }

            int lastDigit = x % 10;
            reversed = (reversed * 10) + lastDigit;
            x = x / 10;
        }

        return original == reversed;
    }
}
