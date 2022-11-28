package LeetcodePrac.CodeWarsKata;

public class KataSumOfOddNumbers {

    public static int rowSumOddNumbers(int n) {

        int count = 0; 
        int leftDigit = 0; 

        if (n < 1) {
            return 0;

        } else if (n == 1) {
            return 1;

        } else {
            leftDigit = (n * (n-1)) + 1;
            while(n > 0) {
                count += leftDigit; 
                leftDigit += 2; 
                n--; 
            }
        }

        return count;
    }
}
