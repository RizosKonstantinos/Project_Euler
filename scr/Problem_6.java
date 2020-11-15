/*
    Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

public class Problem_6 {

    public static void main(String[] args) {

        int sumOfSquares=0;
        int squareOfSum=0;

        for(int i=1; i<=100; i++){
            sumOfSquares+= (int)Math.pow(i,2);
        }

        for(int j=1; j<=100; j++){
            squareOfSum+=j;
        }

        squareOfSum = (int)Math.pow(squareOfSum,2);
        int diff = squareOfSum-sumOfSquares;

        System.out.println("The sum of the squares of the first one hundred natural numbers is: " + sumOfSquares);
        System.out.println("The square of sum of the first one hundred natural numbers is: " + squareOfSum);
        System.out.println("The difference is: " + squareOfSum + " - " + sumOfSquares + " = " + diff);
    }
}