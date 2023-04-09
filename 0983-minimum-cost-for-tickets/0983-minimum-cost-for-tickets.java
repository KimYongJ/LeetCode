class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int lastDay = days[days.length-1];
        int[] dp = new int[lastDay+1];
        boolean[] isExist = new boolean[lastDay+1];
        
        for(int day : days)
            isExist[day] = true;
        
        for(int i=1; i<lastDay+1; i++){
            if(!isExist[i]){
                dp[i] = dp[i-1];
                continue;
            }
            int v1 = dp[i-1] + costs[0];
            int v7 = dp[Math.max(0,i-7)] + costs[1];
            int v30= dp[Math.max(0,i-30)]+ costs[2];
            
            dp[i] = Math.min(v1 , Math.min(v7 , v30) );
        }
        
        
        
        return dp[lastDay];
    }
}
