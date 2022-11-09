package LeetcodePrac;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        // int[] nums = {9,1,-3,2,4,8,3,-1,6,-2,-4,7};
        int[] nums = {1,2,2,3,4};

        // HashSet<Integer> hashSet = new HashSet<>(); 

        // Integer[] newNums = new Integer[hashSet.size()]; 
        // hashSet.toArray(newNums);
        
        // for(int i = 0; i < newNums.length; i++) {
        //     System.out.println(newNums[i]);
        // }

        System.out.println(LeetCode128.longestConsecutive(nums));


    }
}
