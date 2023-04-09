class Solution {
    static HashMap<Character, Integer> hm = new HashMap<>(){
        {
            put('I',1);
            put('V',5);
            put('X',10);
            put('L',50);
            put('C',100);
            put('D',500);
            put('M',1000);  
        }  
    };
    
    public int romanToInt(String s) {
        int sum = 0;
        char[] crr = s.toCharArray();
        for(int i=0; i<crr.length; i++){
            if(i+1!=crr.length && hm.get(crr[i])<hm.get(crr[i+1])){
                sum += hm.get(crr[i+1])-hm.get(crr[i]);
                i++;
            }
            else{
                sum += hm.get(crr[i]);
                
            }
        }
        return sum;
    }
}