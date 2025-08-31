class Solution {
    public int reverse(int x) {
        // boolean check = n>0;
        int revNum = 0;
        while (x != 0){
            int last = x%10;
            x = x/10;
            if(revNum > Integer.MAX_VALUE/10 || 
           (revNum == Integer.MAX_VALUE/10 && last > 7)){
                return 0;
            }else if(revNum < Integer.MIN_VALUE/10 || 
           (revNum == Integer.MIN_VALUE/10 && last < -8)){
                return 0;
            }
            revNum = (revNum * 10)+last;
        }
        return revNum;
    }
}