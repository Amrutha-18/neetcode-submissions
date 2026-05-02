class Solution {
    public int[] plusOne(int[] digits) {
        int carry;
        int len = digits.length;
        for(int i= len -1 ; i >= 0 ;i --){
            if(digits[i] < 9) {
                digits[i] = digits[i] + 1 ;
                return digits;
            }
            else{
                digits[i] = 0;
            }
        }
        int[] res = new int [len + 1];
        res[0] = 1;
        for(int i =1 ; i< len +1 ; i++){
            res[i] = 0;
        }
        return res;
        
    }
}
