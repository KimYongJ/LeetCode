class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        
        int minimum = find(strs);
        
        for(int i=0; i<minimum; i++){
            char c = strs[0].charAt(i);
            for(int j=1; j<strs.length; j++){
                if(c!=strs[j].charAt(i)){
                    return sb.toString();
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
    public int find(String[] strs){
        int m = 100;
        for(String str : strs){
            if(m>str.length()){
                m = str.length();
            }
        }
        return m;
    }
}