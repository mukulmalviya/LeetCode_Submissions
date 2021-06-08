class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length == 0) return 0;
        // greedy approach doesn't give optimized result need to use dp.
        //choose first step
        int i = 0;
        int finalPrice = 0;
        
        if(cost[0] == Math.min(cost[0],cost[1]) && cost[0] != cost[1]){
            i = 0;
            finalPrice = cost[0];
        }else{
            i = 1;
            finalPrice = cost[1];
        }
        
        
        while(i < cost.length-2){
            if(cost[i+1] == Math.min(cost[i+2],cost[i+1]) && cost[i+1] != cost[i+2]){
                finalPrice += cost[i+1];
                i++;
            }else{
                finalPrice += cost[i+2];
                i += 2;
            }
        }
        return finalPrice;
    }
}
