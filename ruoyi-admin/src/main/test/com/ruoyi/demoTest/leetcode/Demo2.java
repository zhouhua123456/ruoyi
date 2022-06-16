package com.ruoyi.demoTest.leetcode;

public class Demo2 {
    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{3,2,4}, 6);
        System.out.println(ints[0]+"---"+ints[1]);
        long a = 100;
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] ints = null;
        for (int i = 0;i<nums.length;i++) {
            int t = target - nums[i];
            for (int j = 0;j<nums.length;j++) {
                if(nums[j] == t && i != j){
                    ints = new int[]{i,j};
                    return ints;
                }
            }
        }
        return ints;
    }
}
