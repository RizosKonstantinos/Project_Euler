/*
    What is the largest prime factor of the number 600851475143 ?
 */

import java.util.ArrayList;

public class Problem_3 {

    public static void main(String[] args) {

        long number = 600851475143L;
        ArrayList<Long> primes = new ArrayList<>();
        ArrayList<Long> primesPower = new ArrayList<>();

        long input = number;
        long i=2;
        boolean more= true;

        while(more){
            if(isPrime(i)){
                long power=0;
                while(input%i==0){
                    power++;
                    input= input/i;
                }
                primes.add(i);
                primesPower.add(power);
            }
            i++;
            if(input==1){
                more = false;
            }
        }
        System.out.print("Prime factors of "+number+" are:");
        for(int p=0; p<primes.size(); p++){
            if(primesPower.get(p)>0){
                System.out.print(" "+primes.get(p)+"^"+primesPower.get(p)+" ");
                if(p<primes.size()-1){
                    System.out.print("+");
                }
            }
        }
    }

    // A method to check if a number is prime
    public static boolean isPrime(long aNumber){

        if(aNumber==2) {
            return true;
        }
        for(int i=2; i<aNumber; i++){
            if(aNumber%i==0) {
                return false;
            }
        }
        return true;
    }
}