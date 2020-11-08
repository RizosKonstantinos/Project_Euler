/*
    Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Problem_4 {

    public static void main(String[] args) {

        int max = 999;
        int number1=0;
        int number2 =0;
        int maxPalindorme=0;
        int mult;
        String  aString;

        for(int i=100; i<=max; i++){
            for(int j=100; j<=max; j++){
                mult = i*j;
                aString = Integer.toString(mult);
                if(isPalindrome(aString)){
                    if(mult>maxPalindorme){
                        maxPalindorme=mult;
                        number1=i;
                        number2=j;
                    }
                }
            }
        }
        System.out.println("Largest palindrome made from the product of two 3-digit numbers is "+maxPalindorme+" = "+number1+" * "+number2);
    }

    static boolean isPalindrome(String aNumber){

        for(int i =0; i<aNumber.length()/2; i++){
            if(!(aNumber.charAt(i)==aNumber.charAt(aNumber.length()-i-1))){
                return false;
            }
        }
        return true;
    }
}