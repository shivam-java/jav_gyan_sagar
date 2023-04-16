package org.java_gyan.problem_solving.day2;

public class MinCostClimbingStairs {

    int[] dp=new int[1001];
    public static void main(String[] args) {
      int nums[]=  {1,100,1,1,1,100,1,1,100,1};
        System.out.println(getCost(0,nums));
    }

  static   int  getCost(int i,int[] cost)
    {
        if(i>=cost.length)
        {
            return 0;
        }
        int cost1=getCost(i+1,cost);
        int cost2=getCost(i+2,cost);
        return Math.min(cost1,cost2)+cost[i];
    }
}
