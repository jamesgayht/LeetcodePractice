package LeetcodePrac;

public class Main {
    
    public static void main(String[] args) {

        String[] strs = {"flower", "flowas", "flo"};
        String[] strs1 = {"dog","racecar","car"};
        String[] strs2 = {"aa", "aa", "aa"};
        String[] strs3 = {"apple", "app", "apple"};
        String[] strs4 = {"a", "ab"};
        String[] strs5 = {"flower", "flower", "flower", "flower", "flower"};



        System.out.println(Leetcode14.longestCommonPrefix(strs));
        System.out.println(Leetcode14.longestCommonPrefix(strs1));
        System.out.println(Leetcode14.longestCommonPrefix(strs2));
        System.out.println(Leetcode14.longestCommonPrefix(strs3));
        System.out.println(Leetcode14.longestCommonPrefix(strs4));
        System.out.println(Leetcode14.longestCommonPrefix(strs5));
    }
}
