package LeetcodePrac.CodeWarsKata;

import java.util.ArrayList;

public class KataPersistentBugger {
    public static int persistence (long num) {

        if(num < 10) {
            return 0;
        }

        ArrayList<Integer> numsList = new ArrayList<>();
        int counter = 0;
        
        while(num > 0) {
            numsList.add((int)num % 10);
            num /= 10;
            if(num == 0) {
                num +=1;
                for(int i=0; i<numsList.size(); i++) {
                    num *= numsList.get(i);
                    System.out.println(num);
                }
                counter++; 
                System.out.println("counter = " + counter);
                numsList.removeAll(numsList);
                
                if(num < 10) {
                    return counter;
                }
            }
            
        }
        return 123; 
    }
}
