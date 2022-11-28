package LeetcodePrac.CodeWarsKata;

public class KataStringEndsWith {

    public static boolean solution (String str, String ending) {
        if(ending.length() > str.length()) {
            return false; 
        } else {
            char[] strChar = str.toCharArray(); 
            char[] endingChar = ending.toCharArray(); 
            int count = endingChar.length-1; 
            int i = strChar.length-1;
            System.out.println("count >>> " + count);

            while(count >= 0) {
                System.out.println("i >>>> " + i);
                System.out.println("strChar[i] >>>> " + strChar[i] + " endingChar[count] >>>> " + endingChar[count]);
                if(strChar[i] != endingChar[count]) {
                    return false; 
                }
                i--;
                count--;  
            }
        }

        return true; 
    }

    public static boolean solutionSample (String str, String ending) {

        return str.endsWith(ending); 
    }
    
}
