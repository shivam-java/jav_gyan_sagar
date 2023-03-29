package org.java_gyan.problem_solving.day1;

import java.util.Arrays;

public class RunningSum {

    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        for (int i=1;i<nums.length;i++)
        {
            nums[i]=nums[i-1]+nums[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
