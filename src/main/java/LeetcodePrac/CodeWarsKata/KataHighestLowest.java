package LeetcodePrac.CodeWarsKata;

import java.util.HashMap;

public class KataHighestLowest {
    
    public static String highAndLow(String numbers) {

        String[] input = numbers.split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>(); 
        int inputInt; 

        for(int i=0; i<input.length; i++) {
            inputInt = Integer.parseInt(input[i]);
            hashMap.putIfAbsent("highest", inputInt);
            hashMap.putIfAbsent("lowest", inputInt);
            
            if(inputInt > hashMap.get("highest")) {
                hashMap.put("highest", inputInt);
            }
    
            if(inputInt < hashMap.get("lowest")) {
                hashMap.put("lowest", inputInt);
            }
        }

        String a = Integer.toString(hashMap.get("highest"));
        String b = Integer.toString(hashMap.get("lowest"));
        StringBuilder result = new StringBuilder();
        result.append(a + ' ' + b);
        return result.toString();
    }
}
