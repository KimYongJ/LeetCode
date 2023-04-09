class Solution {
    public boolean isPalindrome(int x) {
        char[] clist = String.valueOf(x).toCharArray();
        int len = clist.length;
        for(int i=0; i<len/2; i++){
            if(clist[i] != clist[len-1-i]){
                return false;
            }
        }
        return true;
        
    }
}