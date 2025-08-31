class Solution {
    public boolean isSameAfterReversals(int num) {
        int store = num;
        int rev = 0;
        if(num == 0){
            return true;
        }
        while(num != 0){

            if(rev > Integer.MAX_VALUE/10 || 
           (rev == Integer.MAX_VALUE/10 )){
                return false;
            }else if(rev < Integer.MIN_VALUE/10 || 
           (rev == Integer.MIN_VALUE/10)){
                return false;
            }

            int last = num%10;
            rev = (rev*10)+last;
            num = num/10;
        }
        int fRev = rev;
        int sRev = 0;
        while(rev != 0){
            int sLast = rev%10;
            sRev = (sRev*10) + sLast;
            rev = rev/10;
        }

        if(store == sRev ){
            return true;
        }else{
            return false;
        }
    }
}