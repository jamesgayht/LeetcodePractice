package UdemyPrac;

public class LeetcodeOne {
    public static void main(String[] args) {

        int[] nums = {2, 5, 5, 11 };

        System.out.println(twoSum(nums, 10)[0]);
        System.out.println(twoSum(nums, 10)[1]);

    }

    public static int[] twoSum(int[] nums, int target) {

        int[] twoNums = new int[2];

        for (int i = 0; i < nums.length;) {
            for (int j = i+1; j < nums.length;) {
                while (j < nums.length) {
                    if (nums[i] + nums[j] != target && j<nums.length - 1) {
                        j++;
                    } else if(nums[i] + nums[j] == target) {
                        twoNums[0] = i;
                        System.out.println("twoNums index 0 = " + twoNums[0]);
                        twoNums[1] = j;
                        System.out.println("twoNums index 1 = " + twoNums[1]);
                        return twoNums;
                    } else {
                        i++;
                        System.out.println("i = " + i);
                        j++;
                        System.out.println("j = " + j);
                    }
                }
            }
        }
        return twoNums;
    }
}
