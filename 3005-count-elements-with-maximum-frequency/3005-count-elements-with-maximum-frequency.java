class Solution {
    public int maxFrequencyElements(int[] nums) {
        int currentFarq[] = new int[101];
        int maxFarq = 0;
        int sumFraq = 0;
        for(int element : nums){
            currentFarq[element]++;
            int curFarq = currentFarq[element];

            if(curFarq > maxFarq){
                maxFarq = curFarq;
                sumFraq = curFarq;
            }else if( curFarq == maxFarq ){
                sumFraq += curFarq;
            }
        }
        return sumFraq;
    }
}