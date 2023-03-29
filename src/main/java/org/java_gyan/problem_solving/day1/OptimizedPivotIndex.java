package org.java_gyan.problem_solving.day1;

public class OptimizedPivotIndex {


    public static void main(String[] args) {

        int nums[]={1,7,3,6,5,6};
        int sum = 0;
        int temp = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
        }

        for(int j=0 ; j < nums.length ; j++){
            sum -= nums[j];
            if(sum == temp)
                System.out.println(j);
            temp += nums[j];
        }

    }
}
