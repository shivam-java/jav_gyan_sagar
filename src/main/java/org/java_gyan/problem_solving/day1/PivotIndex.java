package org.java_gyan.problem_solving.day1;

public class PivotIndex {


    public static void main(String[] args) {

        int nums[]={1,7,3,6,5,6};
        for(int i=0;i<nums.length;i++)
        {
            int left=0;
            int leftsum=0;
            int right=i+1;
            int rightsum=0;
            while(left<i)
            {
                leftsum+=nums[left];
                left++;
            }
            while(right<nums.length)
            {
                rightsum+=nums[right];
                right++;
            }
            if(leftsum==rightsum)
            {
                System.out.println(i);
            }
        }
    }
}
