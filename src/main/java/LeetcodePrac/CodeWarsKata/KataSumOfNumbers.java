package LeetcodePrac.CodeWarsKata;

public class KataSumOfNumbers {
    public static int GetSum(int a, int b) {
        int currentSum = 0; 

        if(a > b) {
            while(a>b) {
                currentSum += a; 
                a--; 
            }
            currentSum += b;
            return currentSum; 
        } else {
            while (b>a) {
                currentSum += b;
                b --; 
            }
            currentSum += a;
            return currentSum;
        }
    }
}
