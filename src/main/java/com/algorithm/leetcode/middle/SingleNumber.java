package com.algorithm.leetcode.middle;

import java.util.HashMap;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i], 3);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (Integer key : map.keySet()){
            if (map.get(key) == 1){
                return key;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
//        HashMap<Integer, Boolean> map = new HashMap<>();
//
//        if (map.containsKey(1)){
//            System.out.println(1);
//        }

        int a = 13;

        int b = 11;

        System.out.println(a ^ b);
    }

}
