/*
    By considering the terms in the Fibonacci sequence whose values do not exceed four million,
    find the sum of the even-valued terms.
 */

public class Problem_2 {

    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 2;
        int sum = 2;
        int i = 0;

        while (i < 4000000) {
            if (i == num1 + num2) {
                if(i%2==0) {
                    sum += i;
                }
                num1 = num2;
                num2 = i;
            }
            i++;
        }
        System.out.println("The sum is :"+sum);
    }
}