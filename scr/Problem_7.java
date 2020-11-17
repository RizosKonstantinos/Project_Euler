/*
    By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
    What is the 10 001st prime number?
 */

public class Problem_7 {

    public static void main(String[] args) {

        int counter = 0;
        int i = 2;
        int num=0;

        while(counter<10001){
            if(isPrime(i)){
                counter++;
                num=i;
            }
            i++;
        }
        System.out.println("The 10001st prime number is: "+num);
    }

    static boolean isPrime(int aNumber){
        if(aNumber==2){
            return true;
        }
        for(int i=2; i< aNumber; i++){
            if(aNumber%i==0){
                return false;
            }
        }
        return true;
    }
}