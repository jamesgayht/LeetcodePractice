package LeetcodePrac.CodeWarsKata;

public class KataDigitalRoots {
    
    public static int digital_root(int n) {

        int sum = 0;

        if(n <= 9) {
            return n; 

        } else { 
            while(n > 0) {
                sum += n%10; 
                System.out.println("sum >>>> " + sum);
                n /= 10; 
                System.out.println("n >>>>> " + n);

                if(n == 0 && sum >= 10) {
                    n = sum; 
                    sum = 0; 
                } 

                if(n==0 && sum < 10) {
                    return sum;
                }

            }

        }
        return sum; 
    }

    public static int digital_root_model(int n) {
        while (n > 9) 
            n = (n/10) + (n%10);
        
        return n; 
    }
}
