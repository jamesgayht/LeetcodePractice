package LeetcodePrac;

public class Leetcode13 {

    public static int romanToInt(String s) {

        // final int IV = 4;
        // final int IX = 9;
        // final int XL = 40;
        // final int XC = 90;
        // final int CD = 400;
        // final int CM = 900;

        // final int I = 1;
        // final int V = 5;
        // final int X = 10;
        // final int L = 50;
        // final int C = 100;
        // final int D = 500;
        // final int M = 1000;

        int finalInt = 0;

        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            if(i == charArray.length-1) {
                if (charArray[i] == 'I') {
                        finalInt += 1; 
                }
                if (charArray[i] == 'X') {
                        finalInt += 10; 
                }
                if (charArray[i] == 'C') {
                        finalInt += 100; 
                }
                if (charArray[i] == 'V') {
                        finalInt += 5; 
                }
                if (charArray[i] == 'L') {
                        finalInt += 50; 
                }
                if (charArray[i] == 'D') {
                        finalInt += 500; 
                }
                if (charArray[i] == 'M') {
                        finalInt += 1000; 
                }


            } else if (charArray[i] == 'I') {
                
                if (charArray[i + 1] == 'V') {
                    finalInt += 4;
                    i++;
                } else if (charArray[i + 1] == 'X') {
                    finalInt += 9;
                    i++;
                } else {
                    finalInt += 1;
                }  

            } else if (charArray[i] == 'X') {

                if (charArray[i + 1] == 'L') {
                    finalInt += 40;
                    i++;
                } else if (charArray[i + 1] == 'C') {
                    finalInt += 90;
                    i++;
                } else {
                    finalInt += 10;
                } 

            } else if (charArray[i] == 'C') {

                if (charArray[i + 1] == 'D') {
                    finalInt += 400;
                    i++;
                } else if (charArray[i + 1] == 'M') {
                    finalInt += 900;
                    i++;
                } else {
                    finalInt += 100;
                }

            } else if (charArray[i] == 'V') {
                finalInt += 5;
            } else if (charArray[i] == 'L') {
                finalInt += 50;
            } else if (charArray[i] == 'D') {
                finalInt += 500;
            } else if (charArray[i] == 'M') {
                finalInt += 1000;
            }
            System.out.println(i + " > " + charArray[i]);
            System.out.println(finalInt);
        }
        return finalInt;

    }

}
